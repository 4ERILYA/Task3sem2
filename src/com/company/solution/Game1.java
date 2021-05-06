package com.company.solution;

import com.company.model.Card;
import com.company.model.CardDeck;
import com.company.queue.MyQueue;

import java.util.List;

public class Game1 {

    private CardDeck deck;

    public Game1(CardDeck deck) {
        this.deck = deck;
    }

    public void simulate() {
        List<Card> cards = deck.getCards();

        MyQueue<Card> cardsStack = new MyQueue<>();

        for (int i = 0; i < cards.size(); i++) {
            cardsStack.add(cards.get(i));
        }

        MyQueue<Card> cardsOnTable = new MyQueue<>();

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
                cardsOnTable.addToBeginning(currentCardFromStack);
                stopHelper = 0;
            } else {
                cardsStack.add(currentCardFromStack);
                stopHelper++;
            }
            stepCount++;
        }

        System.out.println("Step count = " + stepCount);
        System.out.print("Cards on table = ");
        cardsOnTable.print();
        System.out.println();
        System.out.print("Cards from stack = ");
        cardsStack.print();
    }
}
