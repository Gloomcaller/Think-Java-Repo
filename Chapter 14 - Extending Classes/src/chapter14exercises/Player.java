package chapter14exercises;

public class Player {
    private String name;
    private Hand hand;
    private PlayerStrategy strategy;

    public enum PlayerStrategy {
        DEFAULT, STRATEGIC, GENIUS
    }

    public Player(String name, PlayerStrategy strategy) {
        this.name = name;
        this.hand = new Hand(name);
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Card play(CrazyEightsGame game, Card prevCard) {
        switch (strategy) {
        case STRATEGIC:
            return playStrategic(game, prevCard);
        case GENIUS:
            return playGenius(game, prevCard);
        default:
            return playDefault(game, prevCard);
        }
    }

    private Card playDefault(CrazyEightsGame game, Card prevCard) {
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card.matches(prevCard)) {
                return hand.popCard(i);
            }
        }
        return drawForMatch(game, prevCard);
    }

    private Card playStrategic(CrazyEightsGame game, Card prevCard) {
        return playCardBasedOnBestMatch(game, prevCard, false);
    }

    private Card playGenius(CrazyEightsGame game, Card prevCard) {
        return playCardBasedOnBestMatch(game, prevCard, true);
    }

    private Card playCardBasedOnBestMatch(CrazyEightsGame game, Card prevCard, boolean isGenius) {
        int bestIndex = -1;
        Card bestCard = null;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card.getRank() == 8) {
                return hand.popCard(i);
            }
            if (card.matches(prevCard)) {
                if (bestCard == null || card.getRank() > bestCard.getRank()) {
                    bestCard = card;
                    bestIndex = i;
                }
            }
        }

        if (bestIndex != -1) {
            return hand.popCard(bestIndex);
        }
        return drawForMatch(game, prevCard);
    }

    private Card drawForMatch(CrazyEightsGame game, Card prevCard) {
        while (true) {
            Card card = game.drawCard();
            System.out.println(name + " draws " + card);
            if (card.matches(prevCard)) {
                return card;
            }
            hand.addCard(card);
        }
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.getCard(i);
            if (card instanceof CrazyEightsCard) {
                score += ((CrazyEightsCard) card).scoreCard();
            }
        }
        return score;
    }

    public void display() {
        hand.display();
    }

    public void displayScore() {
        System.out.println(name + " has " + score() + " points");
    }
}
