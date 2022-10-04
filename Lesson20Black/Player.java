package Lesson20Black;

import java.util.Scanner;

class Player extends Hand{
    @Override
    public void play (Deck deck) {
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        // взять 2 карты
        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore() < 21 && answer == 'y'){
            System.out.println("Your hand: " + hand + "your score: " + calcScore());
            System.out.println("Do you want another card? (type y for yes, n for no)");
            answer = in.nextLine().charAt(0); //1-ый символ должен быть либо y либо n
            if (answer == 'y'){
                takeOneCard(deck);
            }

        }
        System.out.println("Your hand: " + hand + "your score: " + calcScore());
//        if (calcScore() == 21){
//            System.out.println("Player wins!");
//        }
//        else if (calcScore() > 21){
//            System.out.println("Player loses!");
//        } ЭТО НЕПРАВИЛЬНО т.к. если игрок набрал 21 очко, дилер уже не должен брать карту, мы должны прервать игру. Это победа


    }
}
