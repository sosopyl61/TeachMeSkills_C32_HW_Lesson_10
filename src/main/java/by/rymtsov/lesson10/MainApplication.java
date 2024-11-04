package main.java.by.rymtsov.lesson10;

import main.java.by.rymtsov.lesson10.model.card.BaseCard;
import main.java.by.rymtsov.lesson10.model.card.CardsOperations;
import main.java.by.rymtsov.lesson10.model.client.BaseClient;

/**
 * This is the application runner class
 * with the solution of the task:
 * There is a client.
 * The client can have any number of cards.
 * The card has three fields - cvv code, card number and amount on the card.
 * Display a message on the screen about how many identical cards the client has.
 * The field with the amount on the card should not be included in the comparison.
 * That is, two cards with the same cvv codes and numbers, but different amounts are considered the same.
 * Provide for different options for the output message -
 * for example, the client does not have any cards at all,
 * the client does not have any identical cards and other possible situations.
 */

public class MainApplication {
    public static void main(String[] args) {
        BaseClient client = new BaseClient("User", 5);
        client.addCard(new BaseCard("1234", 100, 1000));
        client.addCard(new BaseCard("5678", 200, 1500));
        client.addCard(new BaseCard("1234", 100, 2000));
        client.addCard(new BaseCard("5678", 101, 2500));
        client.addCard(new BaseCard("1357", 200, 3000));
        client.addCard(new BaseCard("1111", 111, 2000));
        System.out.println("Number of the identical cards - "
             + CardsOperations.getNumberOfIdenticalCards(client) + '\n');
    }
}
