package Lesson20Black;

import java.util.ArrayList;

public abstract class Hand {
    protected ArrayList<Card> hand;
    Hand(){
        hand = new ArrayList<>();
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < hand.size(); i++) {
            res += hand.get(i).toString();
        }
        return res;
    }
    public int calcScore(){
        //TODO сделать что бы туз давал 1 или 11 очков
        int score = 0;
        for (Card card:
             hand) {
            score += card.getRank();
        }
        return score;
    }
    public abstract void play(Deck deck) throws InterruptedException;
    public void takeOneCard(Deck deck){
        hand.add(deck.sendCard());

    }
}
