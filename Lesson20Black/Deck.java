package Lesson20Black;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private final int suitSize = 13;
    private final int deckSize = 52;
    private ArrayList<Card> deck;

    public Deck () {
        deck = new ArrayList<Card>();
        init();
        shuffle();
        shuffle();
        shuffle();
    }

    private void init(){
        initSuit('\u2661');
        initSuit('\u2662');
        initSuit('\u2664');
        initSuit('\u2667');
    }

    private void shuffle(){
        Random gen = new Random();
        for (int i = 0; i < deck.size() - 1; i++) {
            int randomIndex = gen.nextInt(deckSize - i-1) + i+1;
            Collections.swap(deck, i, randomIndex);
        }

    }



    private void initSuit(char suit){
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < suitSize; i++) {
                deck.add(new Card(suit,ranks[i]));  //юникод карточной масти
        }

    }

    @Override
    public String toString() {
        return deck.toString();
    }

    public Card sendCard(){
        Card t = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return t;
    }

}
