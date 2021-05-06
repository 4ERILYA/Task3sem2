package com.company.solution;

import com.company.model.Card;
import com.company.model.CardDeck;

import java.util.ArrayDeque;
import java.util.List;

public class Game2 {

    private CardDeck deck;

    public Game2(CardDeck deck) {
        this.deck = deck;
    }

    public void simulate() {
        List<Card> cards = deck.getCards();

        ArrayDeque<Card> cardsStack = new ArrayDeque<>();

        for (int i = 0; i < cards.size(); i++) {
            cardsStack.add(cards.get(i));
        }

        ArrayDeque<Card> cardsOnTable = new ArrayDeque<>();

        Card firstCardOnTable = cardsStack.poll();
        cardsOnTable.add(firstCardOnTable);

        int stepCount = 0;

        int stopHelper = 0;
        while (!cardsStack.isEmpty()) {
            if (stopHelper > cards.size()) {
                stepCount = stepCount - stopHelper;
                break;
            }

            Card currentCardFromStack = cardsStack.poll();
            Card currentCardOnTable = cardsOnTable.peek();

            if (currentCardFromStack.getCardSuit() == currentCardOnTable.getCardSuit() ||
                    currentCardFromStack.getCardValue() == currentCardOnTable.getCardValue()) {
                cardsOnTable.addFirst(currentCardFromStack);
                stopHelper = 0;
            } else {
                cardsStack.add(currentCardFromStack);
                stopHelper++;
            }
            stepCount++;
        }

        System.out.println("Step count = " + stepCount);
        System.out.println("Cards on table = " + cardsOnTable);
        System.out.println("Cards from stack = " + cardsStack);
    }
}
