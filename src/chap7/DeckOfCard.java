package chap7;

import java.security.SecureRandom;

public class DeckOfCard {
    private static final SecureRandom random = new SecureRandom();
    private static final int DECK_OF_CARDS= 52;

    private final Card[] card = new Card[DECK_OF_CARDS];
    private int currentCard = 0;
        public  DeckOfCard() {
            String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};


            for (int count = 0; count < card.length; count++){
                card[count]= new Card(faces[count%13],suits[count/13] );
            }
        }

        public  void ShuffleCard(){
            currentCard =0;

            for (int first =0; first < card.length; first++ ){
                int second = random.nextInt(DECK_OF_CARDS);

                Card temp = card[first];
                card[first] = card[second];
                card[second] =temp;
            }
        }
        public Card dealCard(){
            if (currentCard < card.length){
                return card[currentCard++];
            }
            else {
                return null;
            }
        }



}
