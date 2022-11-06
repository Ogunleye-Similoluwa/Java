package chap2.GraceAssignment;

public class Account {
	public String name ;
	public double balance;

	public Account(String name, double balance) {

        this.name = name;

        if (balance > 0.00){
            this.balance = balance;
        }
    }
	
	public void withdrawMoney(double withdraw) {
        if (withdraw <= balance) {
            balance = balance - withdraw;
        } else {
            System.out.println("withdraw amount exceeded account balance");
        }
    }
	public double getPrice(){
    		return balance;
	}


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
 
 }

 
 