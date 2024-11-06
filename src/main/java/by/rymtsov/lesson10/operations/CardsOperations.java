package main.java.by.rymtsov.lesson10.operations;

import main.java.by.rymtsov.lesson10.model.card.BaseCard;
import main.java.by.rymtsov.lesson10.model.client.BaseClient;
import java.util.HashMap;

/**
 * This class describes operations with cards.
 * It has two static methods: the second method
 * checks if client doesn't have any cards, one card, etc.
 * If client has 2 or more cards, the first method
 * calculates the number of identical cards.
 */

public class CardsOperations {

    private static int calculateNumberOfIdenticalCards(BaseCard[] cards) {
        int count = 0;
        HashMap<BaseCard, Boolean> nonIdenticalCards = new HashMap<>();
        for (BaseCard card : cards) {
            if (!nonIdenticalCards.containsKey(card)) {
                nonIdenticalCards.put(card, false);
            }
            else if (!nonIdenticalCards.get(card)) {
                count += 2;
                nonIdenticalCards.put(card, true);
            }
            else {
                count++;
            }
        }

        return count;
    }

    public static int getNumberOfIdenticalCards(BaseClient client) {
        if (client.getCardsCount() == 0 || client.getCards() == null) {
            System.out.println("Client doesn't have any cards!");
            return 0;
        } else if (client.getCardsCount() == 1) {
            System.out.println("Client has only one card!");
            return 0;
        } else {
            return  calculateNumberOfIdenticalCards(client.getCards());
        }
    }
}
