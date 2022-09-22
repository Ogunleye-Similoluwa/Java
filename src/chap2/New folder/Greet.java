import java.util.Scanner;
public class Greet{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter you name:");
		String name = input.nextLine();
		System.out.println("I greet you specially " +  name );
	}
}     