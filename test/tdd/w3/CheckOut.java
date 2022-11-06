package tdd.w3;

import java.util.ArrayList;
public class CheckOut {



    public static void grandTotal(ArrayList<Integer> price, ArrayList<Integer> quantity) {
        int total = 0;
        for (int i = 0 ; i < price.size(); i++) {
            total += price.get(i) * quantity.get(i);

        }
        System.out.println(total);

    }
}

