import java.util.Scanner;




public class FinancialApplication{
	public static void main(String[] args){ 

		Scanner input = new Scanner(System.in);

		System.out.print("enter investment amount:");
		double investmentAmount = input.nextDouble();
		System.out.print(" enter annual rate in percentage:");
		double annualRate = input.nextDouble();
		System.out.print("enter number of years:");
            int years = input.nextInt();
          
            double monthlyInterestRate =  annualRate/100/12 ;

		
    		
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + monthlyInterestRate , years * 12));
    
  		System.out.printf("The Accumulated value is is:$%.2f",  futureInvestmentValue);
	}
}