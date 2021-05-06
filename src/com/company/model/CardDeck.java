package com.company.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private List<Card> cards = new ArrayList<>();

    public CardDeck() {
        init();
        shuffle();
    }

    public List<Card> getCards() {
        return cards;
    }

    private void init() {
        Card card1 = new Card(CardSuit.HEARTS, CardValue.SIX);
        Card card2 = new Card(CardSuit.HEARTS, CardValue.SEVEN);
        Card card3 = new Card(CardSuit.HEARTS, CardValue.EIGHT);
        Card card4 = new Card(CardSuit.HEARTS, CardValue.NINE);
        Card card5 = new Card(CardSuit.HEARTS, CardValue.TEN);
        Card card6 = new Card(CardSuit.HEARTS, CardValue.JACK);
        Card card7 = new Card(CardSuit.HEARTS, CardValue.QUEEN);
        Card card8 = new Card(CardSuit.HEARTS, CardValue.KING);
        Card card9 = new Card(CardSuit.HEARTS, CardValue.ACE);

        Card card10 = new Card(CardSuit.DIAMONDS, CardValue.SIX);
        Card card11 = new Card(CardSuit.DIAMONDS, CardValue.SEVEN);
        Card card12 = new Card(CardSuit.DIAMONDS, CardValue.EIGHT);
        Card card13 = new Card(CardSuit.DIAMONDS, CardValue.NINE);
        Card card14 = new Card(CardSuit.DIAMONDS, CardValue.TEN);
        Card card15 = new Card(CardSuit.DIAMONDS, CardValue.JACK);
        Card card16 = new Card(CardSuit.DIAMONDS, CardValue.QUEEN);
        Card card17 = new Card(CardSuit.DIAMONDS, CardValue.KING);
        Card card18 = new Card(CardSuit.DIAMONDS, CardValue.ACE);

        Card card19 = new Card(CardSuit.CLUBS, CardValue.SIX);
        Card card20 = new Card(CardSuit.CLUBS, CardValue.SEVEN);
        Card card21 = new Card(CardSuit.CLUBS, CardValue.EIGHT);
        Card card22 = new Card(CardSuit.CLUBS, CardValue.NINE);
        Card card23 = new Card(CardSuit.CLUBS, CardValue.TEN);
        Card card24 = new Card(CardSuit.CLUBS, CardValue.JACK);
        Card card25 = new Card(CardSuit.CLUBS, CardValue.QUEEN);
        Card card26 = new Card(CardSuit.CLUBS, CardValue.KING);
        Card card27 = new Card(CardSuit.CLUBS, CardValue.ACE);

        Card card28 = new Card(CardSuit.SPADES, CardValue.SIX);
        Card card29 = new Card(CardSuit.SPADES, CardValue.SEVEN);
        Card card30 = new Card(CardSuit.SPADES, CardValue.EIGHT);
        Card card31 = new Card(CardSuit.SPADES, CardValue.NINE);
        Card card32 = new Card(CardSuit.SPADES, CardValue.TEN);
        Card card33 = new Card(CardSuit.SPADES, CardValue.JACK);
        Card card34 = new Card(CardSuit.SPADES, CardValue.QUEEN);
        Card card35 = new Card(CardSuit.SPADES, CardValue.KING);
        Card card36 = new Card(CardSuit.SPADES, CardValue.ACE);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);
        cards.add(card9);
        cards.add(card10);
        cards.add(card11);
        cards.add(card12);
        cards.add(card13);
        cards.add(card14);
        cards.add(card15);
        cards.add(card16);
        cards.add(card17);
        cards.add(card18);
        cards.add(card19);
        cards.add(card20);
        cards.add(card21);
        cards.add(card22);
        cards.add(card23);
        cards.add(card24);
        cards.add(card25);
        cards.add(card26);
        cards.add(card27);
        cards.add(card28);
        cards.add(card29);
        cards.add(card30);
        cards.add(card31);
        cards.add(card32);
        cards.add(card33);
        cards.add(card34);
        cards.add(card35);
        cards.add(card36);
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }
}
