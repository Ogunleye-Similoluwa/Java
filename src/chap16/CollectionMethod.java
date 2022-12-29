package chap16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        String [] suit = {"Hearts", "Diamonds", "Clubs", "Spade"};
        String [] suit2 = {"Hearts", "Diamonds", "Clubs", "Spade"};
        List<String> list = Arrays.asList(suit);
        List<String> list2 = Arrays.asList(suit2);
        Collections.sort(list);
        Collections.sort(list2,Collections.reverseOrder());
        System.out.print(list + " ");
        System.out.println();
        System.out.print(list2 + " ");
    }
}
