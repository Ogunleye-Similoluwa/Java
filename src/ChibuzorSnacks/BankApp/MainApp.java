package ChibuzorSnacks.BankApp;

import javax.swing.*;

public class MainApp {
    private static User user;

    public static void main(String[] args) {
        String bank = """
                =============================
                Welcome to the simplest bank application
                to exist
                =============================
                """;
        print(bank);
        startUp();
    }
    private static void startUp(){
        String firstName= input("Enter your firstName: ");
        String lastName= input("Enter your lastName: ");
        int accountNumber = Integer.parseInt(input("Enter your account number"));
       user = new User(firstName, lastName, accountNumber);

        entry();

    }
    private static void entry(){
        String menu =("""
                1- Deposit
                2-Withdraw
                3-View account
                4-Exit
                """);
        int result = Integer.parseInt(input(menu));
        switch (result){
            case 1: deposit();
            case 2: withdraw();
            case 3: viewAccount();
            case 4: Exit();
        }
    }

    private static void Exit() {
        String exit ="Thanks for using our app";
        print(exit);
        System.exit(0);
    }

    private static void viewAccount() {
        BankAccount account  = user.viewAccount();
        print(String.valueOf(account));
        entry();
    }

    private static void withdraw() {
        try {
            double withDraw = Double.parseDouble(input("Enter amount to be deposited"));
            user.withDraw(withDraw);
            String result ="Successfully WithDrawed";
            print(result);
            entry();
        }
        catch (Exception e){
            print(e.getMessage());
            entry();
        }
    }

    public static void deposit(){
        try {
            double deposit = Double.parseDouble(input("Enter amount to be deposited"));
            user.deposit(deposit);
            String result ="Successfully Deposited";
            print(result);
            entry();
        }
        catch (Exception e){
            print(e.getMessage());
            entry();
        }


    }
    private static void print(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
    private static String input(String prompt){
        return JOptionPane.showInputDialog(null,prompt);

    }
}
