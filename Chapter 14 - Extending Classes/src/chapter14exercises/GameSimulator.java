package chapter14exercises;

public class GameSimulator {

    public void simulate(int numberOfGames) {
        int playerOneWins = 0;
        int playerTwoWins = 0;

        for (int i = 0; i < numberOfGames; i++) {
            Eights game = new Eights();
            game.replacePlayerOne(new Genius("Genius Player"));

            game.playGame();

            int winner = game.getWinner();
            if (winner == 1) {
                playerOneWins++;
            } else if (winner == 2) {
                playerTwoWins++;
            }
        }

        System.out.println("Player One Wins: " + playerOneWins);
        System.out.println("Player Two Wins: " + playerTwoWins);
    }
}
