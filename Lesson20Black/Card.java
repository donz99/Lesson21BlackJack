package Lesson20Black;

public class Card {
    private char suit;
    private String rank;
    public Card(){}

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank+""+suit+" ";
    }

    int getRank() {
        int res = 0;
        if (rank.equals("A")) res = 1;
        else if (rank.equals("2")) res = 2;
        else if (rank.equals("3")) res = 3;
        else if (rank.equals("4")) res = 4;
        else if (rank.equals("5")) res = 5;
        else if (rank.equals("6")) res = 6;
        else if (rank.equals("7")) res = 7;
        else if (rank.equals("8")) res = 8;
        else if (rank.equals("9")) res = 9;
        else if (rank.equals("10")) res = 10;
        else if (rank.equals("J")) res = 10;
        else if (rank.equals("Q")) res = 10;
        else if (rank.equals("K")) res = 10;
        return res;
    }
}
