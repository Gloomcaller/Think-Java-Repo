package chapter14exercises;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		// Test 1: Deck creation and shuffle
		System.out.println("TEST 1: Deck Creation and Shuffle");
		Deck deck = new Deck("Test Deck");
		System.out.println("Deck before shuffle: ");
		System.out.println(deck);
		deck.shuffle();
		System.out.println("Deck after shuffle: ");
		System.out.println(deck);
		System.out.println();

		// Test 2: Player creation and hand management
		System.out.println("TEST 2: Player Creation and Hand Management");
		Player player1 = new Player("Alice");
		Player player2 = new Player("Bob");
		deck.deal(player1.getHand(), 5);
		deck.deal(player2.getHand(), 5);
		System.out.println("Player 1's hand: ");
		player1.display();
		System.out.println("Player 2's hand: ");
		player2.display();
		System.out.println();

		// Test 3: Game mechanics
		System.out.println("TEST 3: Game Mechanics");
		Hand drawPile = new Hand("Draw Pile");
		deck.dealAll(drawPile);
		Hand discardPile = new Hand("Discard Pile");
		discardPile.addCard(drawPile.popCard());
		System.out.println("Draw pile: " + drawPile.size() + " cards");
		System.out.println("Discard pile: " + discardPile.lastCard());
		System.out.println();

		// Test 4: Basic Gameplay
		System.out.println("TEST 4: Basic Gameplay");
		Eights game = new Eights();
		System.out.println("Starting game...");
		game.playGame();
		System.out.println("Game finished!");
		System.out.println();

		// Test 5: StrategicPlayer vs Genius
		System.out.println("TEST 5: StrategicPlayer vs Genius");
		StrategicPlayer strategicPlayer = new StrategicPlayer("Strategic Player");
		Genius geniusPlayer = new Genius("Genius Player");
		ArrayList<Player> testPlayers = new ArrayList<>();
		testPlayers.add(strategicPlayer);
		testPlayers.add(geniusPlayer);
		Eights strategyGame = new Eights(testPlayers);
		System.out.println("Starting strategic vs genius game...");
		strategyGame.playGame();
		System.out.println("Game finished!");
		System.out.println();

		// Test 6: Game Simulation
		System.out.println("TEST 6: Game Simulation");
		GameSimulator simulator = new GameSimulator();
		simulator.simulate(10);
		System.out.println("Simulation complete!");
	}
}
