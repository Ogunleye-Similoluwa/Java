import java.util.Scanner;

public class FoodTest {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 

Food myFood = new Food("ultima");
System.out.printf("The name of our shop name is %s", myFood.getname());
System.out.println();
  
System.out.print("enter food name ") ;
  String foodname = input.nextLine() ;
myFood.setname(foodname);

System.out.printf("The name of the food is %s%n", myFood.getname());
 
  Food myprice = new Food ("int");
System.out.print("enter food price");
int price = input.nextInt();
  myprice.setprice(price) ;
 System.out.printf("the price of the food is %d%n", myprice.getprice());
 
 

  }
}