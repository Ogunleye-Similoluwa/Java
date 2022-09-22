package chap7;

public class CardTest {
    public static void main(String[] args) {
        DeckOfCard game= new DeckOfCard();
        game.ShuffleCard();

        for (int count =1;count <=52; count++){
            System.out.printf("%-19s",game.dealCard());
            if (count % 4 == 0){
                System.out.println();
            }
        }


    }
}