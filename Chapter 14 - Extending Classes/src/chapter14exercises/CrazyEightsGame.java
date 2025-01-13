package chapter14exercises;

import java.util.ArrayList;
import java.util.Collections;

public class CrazyEightsGame {
	private ArrayList<Player> players;
	private int currentPlayerIndex;
	private Hand drawPile;
	private Hand discardPile;
	private boolean isGameOver = false;

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public CrazyEightsGame() {
		this.players = new ArrayList<>();
		this.players.add(new Player("Alice", Player.PlayerStrategy.STRATEGIC));
		this.players.add(new Player("Bob", Player.PlayerStrategy.GENIUS));
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
		for (Player player : players) {
			if (player.getHand().size() == 0) {
				return true;
			}
		}
		return false;
	}

	public Card drawCard() {
		if (drawPile.size() == 0) {
			System.out.println("Draw pile is empty. Reshuffling...");
			reshuffle();
		}

		if (drawPile.size() > 0) {
			return drawPile.popCard(0);
		}

		System.out.println("Both draw and discard piles are empty! Ending game.");
		isGameOver = true;
		return null;
	}

	private void reshuffle() {
		if (discardPile.size() > 1) {
			drawPile = new Hand("Draw pile");
			for (int i = 1; i < discardPile.size(); i++) {
				drawPile.addCard(discardPile.popCard(i));
			}
			Collections.shuffle(drawPile.getCards());
			System.out.println("Draw pile reshuffled.");
		}
	}

	public void playGame() {
	    while (!isDone() && !isGameOver) {
	        Player currentPlayer = players.get(currentPlayerIndex);
	        Card prevCard = discardPile.lastCard();
	        Card playedCard = currentPlayer.play(this, prevCard);
	        discardPile.addCard(playedCard);
	        System.out.println(currentPlayer.getName() + " plays " + playedCard);
	        
	        currentPlayer.displayScore();

	        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
	    }
	}

}
