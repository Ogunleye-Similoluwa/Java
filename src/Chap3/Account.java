package Chap3;


public class Account {
    public  String name ;
    public   double balance;

    public Account(String name, double balance){

        this.name = name;

        if (balance > 0.00){
            this.balance = balance;
        }
    }

    public void withdraw(double withdrawAmount){
        if( withdrawAmount <= balance ) {
            balance = balance - withdrawAmount;
        }

        else{
            System.out.println("withdraw amount exceeded account balance");
        }
    }

    public void depositAmount(double depositAmount){
        if(balance > 0.00){
            balance = balance + depositAmount;
        }
    }
    public  double getBalance(){
        return balance;
    }


    public void setName(String name){
        this.name = name;
    }

    public  String getName(){
        return name;
    }

}

