import java.util.Scanner;
public class GreetMod{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter you name:");
		String name1 = input.nextLine();

		if (name1 == "Alice"){
		System.out.println("I greet you specially Alice");
		}
		else{
		System.out.print("Null");
		}

		System.out.print("Please enter you name:");
		String name2 = input.nextLine();
		
		
		if(name2 == "Bob"){
		System.out.println("I greet you specially Bob");
		}
		else{
		System.out.println("Null");
		}
		
	}
}     