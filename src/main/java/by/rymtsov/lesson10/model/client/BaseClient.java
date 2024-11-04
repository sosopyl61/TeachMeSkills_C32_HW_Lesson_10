package main.java.by.rymtsov.lesson10.model.client;

import main.java.by.rymtsov.lesson10.model.card.BaseCard;

import java.util.Arrays;

/**
 * This class describes a client.
 * A client has a name and cards.
 */

public class BaseClient {

    private String name;
    private BaseCard[] cards;
    private int cardsCount;

    public BaseClient(String name, int maxCardsCount) {
        this.name = name;
        this.cards = new BaseCard[maxCardsCount];
        this.cardsCount = 0;
    }

    public void addCard(BaseCard card) {
        if (cardsCount >= cards.length) {
            System.out.println("You can't add one more card.");
        }
        else {
            cards[cardsCount] = card;
            cardsCount++;
            System.out.println("Number of the cards: " + cardsCount);
        }
    }

    @Override
    public String toString() {
        return "Client - " + this.name + '\n'
                + "Cards:" + '\n'
                + Arrays.toString(this.cards) + '\n';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public BaseCard[] getCards() {
        return cards;
    }


}
