package com.company;

import com.company.model.CardDeck;
import com.company.solution.Game2;

public class Main2 {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Game2 game2 = new Game2(cardDeck);
        game2.simulate();
    }
}
