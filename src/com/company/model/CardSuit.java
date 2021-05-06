package com.company.model;

public enum CardSuit {
    HEARTS(1),
    DIAMONDS(2),
    CLUBS(3),
    SPADES(4);

    private int value;

    CardSuit(int value) {
        this.value = value;
    }
}
