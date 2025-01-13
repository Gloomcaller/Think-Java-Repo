package chapter14exercises;

import java.util.ArrayList;

public class Eights {

	private ArrayList<Player> players;
	private int currentPlayerIndex;
	private Hand drawPile;
	private Hand discardPile;

	private boolean isGameOver = false;
	private int reshuffleCount = 0;

	public Eights() {
		this.players = new ArrayList<>();
		this.players.add(new Player("Allen"));
		this.players.add(new Player("Chris"));
		this.currentPlayerIndex = 0;
		initGame();
	}

	public Eights(ArrayList<Player> players) {
		this.players = players;
		this.currentPlayerIndex = 0;
		initGame();
	}

	private void initGame() {
		Deck deck = new Deck("Deck");
		deck.shuffle();

		for (Player player : players) {
			deck.deal(player.getHand(), 5);
		}

		discardPile = new Hand("Discards");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw pile");
		deck.dealAll(drawPile);

		System.out.println("Game initialized: Draw pile has " + drawPile.size() + " cards.");
	}

	public boolean isDone() {
		return players.get(0).getHand().isEmpty() || players.get(1).getHand().isEmpty();
	}

	public Card drawCard() {
	    if (drawPile.isEmpty()) {
	        if (reshuffleCount >= 3) {
	            System.out.println("Reshuffle limit reached. Ending the game.");
	            isGameOver = true;
	            return null;
	        }
	        System.out.println("Draw pile is empty. Reshuffling...");
	        reshuffle();
	    }

	    if (!drawPile.isEmpty()) {
	        return drawPile.popCard();
	    }

	    System.out.println("Both draw and discard piles are empty! Ending game.");
	    isGameOver = true;
	    return null;
	}

	public void reshuffle() {
	    if (discardPile.isEmpty()) {
	        System.out.println("No cards to reshuffle. Ending game.");
	        isGameOver = true;
	        return;
	    }

	    System.out.println("Before reshuffling:");
	    System.out.println("Draw pile: " + drawPile.size() + " cards.");
	    System.out.println("Discard pile: " + discardPile.size() + " cards.");

	    Card prev = discardPile.popCard();
	    discardPile.dealAll(drawPile);
	    discardPile.addCard(prev);
	    drawPile.shuffle();
	    System.out.println("After reshuffling:");
	    System.out.println("Draw pile: " + drawPile.size() + " cards.");
	    System.out.println("Discard pile: " + discardPile.size() + " cards.");

	    reshuffleCount++;
	}


	public Player nextPlayer(Player current) {
		return players.get((players.indexOf(current) + 1) % players.size());
	}

	public void displayState() {
		for (Player player : players) {
			player.display();
		}
		discardPile.display();
		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");
	}

	public void takeTurn(Player player) {
		Card prev = discardPile.lastCard();
		Card next = player.play(this, prev);
		discardPile.addCard(next);

		System.out.println(player.getName() + " plays " + next);
		System.out.println();
	}

	public void playGame() {
		while (!isDone() && !isGameOver) {
			displayState();

			Player currentPlayer = players.get(currentPlayerIndex);
			Card prevCard = discardPile.lastCard();

			Card playedCard = currentPlayer.play(this, prevCard);
			discardPile.addCard(playedCard);

			System.out.println(currentPlayer.getName() + " plays " + playedCard);
			System.out.println();

			currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
		}

		if (isGameOver) {
			System.out.println("Game Over due to no cards left!");
		} else {
			System.out.println("Game Over!");
		}

		for (Player player : players) {
			player.displayScore();
		}
	}

	public int getWinner() {
		if (players.get(0).getHand().isEmpty()) {
			return 1;
		} else if (players.get(1).getHand().isEmpty()) {
			return 2;
		}
		return 0;
	}

	public void replacePlayerOne(Genius genius) {
		if (players.size() > 0) {
			players.set(0, genius);
		}
	}
}
