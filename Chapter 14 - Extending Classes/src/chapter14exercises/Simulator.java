package chapter14exercises;

public class Simulator {

	public static void main(String[] args) {
		CrazyEightsGame game = new CrazyEightsGame();

		System.out.println("Game starting...\n");
		game.playGame();

		System.out.println("\nFinal Scores:");
		for (Player player : game.getPlayers()) {
			player.displayScore();
		}

		Player player1 = game.getPlayers().get(0);
		Player player2 = game.getPlayers().get(1);

		if (player1.score() > player2.score()) {
			System.out.println(player1.getName() + " wins!");
		} else if (player1.score() < player2.score()) {
			System.out.println(player2.getName() + " wins!");
		} else {
			System.out.println("It's a tie!");
		}
	}
}
