package Lesson20Black;

public class Dealer extends Hand{

    @Override
    public void play(Deck deck) throws InterruptedException { //ЕСЛИ ЕСТЬ ЛСИП ТО ДОБАВЛЯЕМ throws InterruptedException
        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore() < 17){
            System.out.println("Dealer hand: " + hand + "dealer score: " + calcScore());
            takeOneCard(deck);
            Thread.sleep(1000); // ПАУЗА 1 сек
        }
        System.out.println("Dealer hand: " + hand + "dealer score: " + calcScore());
    }
}
