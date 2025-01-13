package chapter14exercises;

import java.util.Scanner;

public class Eights {

	private Player one;
	private Player two;
	private Hand drawPile;
	private Hand discardPile;
	private Scanner in;

	public Eights() {
		Deck deck = new Deck("Deck");
		deck.shuffle();

		one = new Player("Allen");
		deck.deal(one.getHand(), 5);
		two = new Player("Chris");
		deck.deal(two.getHand(), 5);

		discardPile = new Hand("Discards");
		deck.deal(discardPile, 1);

		drawPile = new Hand("Draw pile");
		deck.dealAll(drawPile);

		in = new Scanner(System.in);
	}

	public boolean isDone() {
		return one.getHand().isEmpty() || two.getHand().isEmpty();
	}

	public void reshuffle() {
		Card prev = discardPile.popCard();

		discardPile.dealAll(drawPile);

		discardPile.addCard(prev);

		drawPile.shuffle();
	}

	public Card drawCard() {
		if (drawPile.isEmpty()) {
			reshuffle();
		}
		return drawPile.popCard();
	}

	public Player nextPlayer(Player current) {
		if (current == one) {
			return two;
		} else {
			return one;
		}
	}

	public void displayState() {
		one.display();
		two.display();
		discardPile.display();
		System.out.print("Draw pile: ");
		System.out.println(drawPile.size() + " cards");
		in.nextLine();
	}

	public void takeTurn(Player player) {
		Card prev = discardPile.lastCard();
		Card next = player.play(this, prev);
		discardPile.addCard(next);

		System.out.println(player.getName() + " plays " + next);
		System.out.println();
	}

	public void playGame() {
		Player player = one;

		while (!isDone()) {
			displayState();
			takeTurn(player);
			player = nextPlayer(player);
		}

		one.displayScore();
		two.displayScore();
	}

	public static void main(String[] args) {
		Eights game = new Eights();
		game.playGame();
	}

}