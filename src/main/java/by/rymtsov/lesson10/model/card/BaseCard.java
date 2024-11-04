package main.java.by.rymtsov.lesson10.model.card;

import java.util.Objects;

/**
 * This class describes a card.
 * A card has a card number, CVV code and amount.
 */

public class BaseCard {
    private String cardNumber;
    private int cvv;
    private double amount;

    public BaseCard(String cardNumber, int cvv, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCard baseCard = (BaseCard) o;
        return cvv == baseCard.cvv && Objects.equals(cardNumber, baseCard.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }

    @Override
    public String toString() {
        return "Card number: " + this.cardNumber + '\n'
                + "CVV: " + this.cvv + '\n'
                + "Amount: " + this.amount + '\n';
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

}
