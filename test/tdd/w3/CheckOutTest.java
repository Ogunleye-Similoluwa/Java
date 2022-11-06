package tdd.w3;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutTest {
        public static void main(String[] args) {
            ArrayList<String> items = new ArrayList<>();
            ArrayList<Integer> quantities = new ArrayList<>();
            ArrayList<Integer> price = new ArrayList<>();
            Scanner in = new Scanner (System.in);
            System.out.print("Enter customers name :");
            String customer = in.nextLine();
            System.out.print("Enter cashier name :");
            String cashier = in.nextLine();


            String choice;
            while(true) {
                System.out.println("Enter items bought:");
                String item = in.next();
                items.add(item);
                System.out.println("Enter quantity of item:");
                int quantity = in.nextInt();
                quantities.add(quantity);
                System.out.println("Enter price for each product:");
                int product = in.nextInt();
                price.add(product);
                System.out.println("Enter anything to continue OR No to end:");
                choice = in.next().toUpperCase();


                if(choice.equals("NO")){
                    for (int i =0 ; i < items.size(); i++) {
                        System.out.printf("""
                                -----------------------------------------+
                                Customers Name: %s
                                Cashier's name: %s
                                    item  |  Quantity |  Price |    Total
                                     %s        %d       %d        %d
                                ------------------------------------------
                                """, customer.toUpperCase().charAt(0) + customer.substring(1),
                                cashier.toUpperCase().charAt(0) + cashier.substring(1),
                                items.get(i),quantities.get(i),price.get(i), quantities.get(i) * price.get(i));
                    }
                    System.out.print("Grand Total :" );
                    CheckOut.grandTotal(price,quantities);
                    break;
                }
            }
        }

    }

