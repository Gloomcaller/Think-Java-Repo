package chapter14exercises;

import java.util.ArrayList;

public class CardCollection {
    private String label;
    private ArrayList<Card> cards;

    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public Card popCard(int index) {
        return cards.remove(index);
    }

    public int size() {
        return cards.size();
    }

    public void display() {
        System.out.println(label + ": ");
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println();
    }

    public Card lastCard() {
        return cards.get(cards.size() - 1);
    }
}
