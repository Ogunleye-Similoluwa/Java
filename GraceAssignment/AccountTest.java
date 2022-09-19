import java.util.Scanner;

public class AccountTest{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

System.out.print("enter amount you want to withdraw");
   double AmountWithDrawed = input.nextdouble();
     System.out.print("The amount withdrawed is %.2f", AmountWithDrawed);
     balance.withdraw(AmountWithDrawed);
}

}      


