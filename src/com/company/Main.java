package com.company;

import com.company.model.CardDeck;
import com.company.solution.Game1;

public class Main {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Game1 game1 = new Game1(cardDeck);
        game1.simulate();
    }
}
