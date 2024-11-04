package main.java.by.rymtsov.lesson10.model.card;

import main.java.by.rymtsov.lesson10.model.client.BaseClient;

import java.util.Arrays;

/**
 * This class describes operations with cards.
 * It has static method that calculates the number
 * of the same cards of the client.
 */

public class CardsOperations {

    public static int getNumberOfIdenticalCards(BaseClient client) {
        if (client.getCards().length == 0 || client.getCards() == null) {
            System.out.println("Client doesn't have any cards!");
            return 0;
        } else if (client.getCards().length == 1) {
            System.out.println("Client has only one card: " + Arrays.toString(client.getCards()));
            return 1;
        } else {
            int count = 0;
            for (int i = 0; i < client.getCards().length; i++) {
                for (int j = i + 1; j < client.getCards().length; j++) {
                    if (client.getCards()[i].equals(client.getCards()[j])) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
