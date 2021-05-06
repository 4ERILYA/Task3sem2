package com.company.model;

public enum CardValue {
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int value;

    CardValue(int value) {
        this.value = value;
    }
}
