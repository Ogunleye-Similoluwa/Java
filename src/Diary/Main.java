package Diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static  Diary diary;
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String mainMenu = """
                Welcome to my Diary!!!
                Let's setup it up
                """;
        print(mainMenu);
        String userName = input("Enter your userName");
        String password = input("Enter your password");
        diary = new Diary(userName,password);
        print("Diary created for " + userName);
        displayLockScreenMenu();

    }

    private static void displayLockScreenMenu() {
        String mainMenu = """
                Press
                 1--> Unlock Diary
                 2--> Lock Diary
                 3-->Exit
                """;
        int userInput = Integer.parseInt(input(mainMenu));
        switch (userInput) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Diary is locked");
        displayLockScreenMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter your password");
        diary.unlockWith(password);
        if (diary.isLocked()){
            print("Wrong password");
            displayLockScreenMenu();
        }
        displayDiaryMenu();
        
    }

    private static void displayDiaryMenu() {
        String diaryMenu= """
                press 1 --> create Entry
                press 2 --> Find Entry by Id
                press 3 --> Get total number of Id
                press 4 --> Lock diary
                press 5 --> Update Entry
                press 6 --> Delete Entry
                press 7 --> Get all Entries
                """;
        int userInput = Integer.parseInt(input(diaryMenu));
        switch (userInput) {
            case 1 -> createEntry();
            case 2 -> FindById();
            case 3 -> getTotalNumberOfId();
            case 4 -> lockDiary();
            case 5 -> updateEntry();
            case 6 -> deleteEntry();
            case 7 -> getAllEntries();
        }
    }

    private static void getAllEntries() {
       print(String.valueOf(diary.getAllEntries()));
        displayDiaryMenu();
    }

    private static void deleteEntry() {
        diary.getAllEntries();
       int id = Integer.parseInt(input("Enter your entry id"));
        diary.deleteEntry(id);
        print("Entry deleted");
        displayDiaryMenu();
    }

    private static void updateEntry() {
        String title = input("Enter your entry title");
        String body = input("Enter your entry body");
        int id = Integer.parseInt(input("Enter your entry id"));
        diary.updateEntry(id,title, body);
        print("Entry updated");
        displayDiaryMenu();
    }


    private static void getTotalNumberOfId() {
        int totalNumberOfEntries = diary.getNumberOfHappenings();
        print("You have " + totalNumberOfEntries + "+ Entries");
        displayDiaryMenu();
    }

    private static void FindById() {
        String id = input("Enter The Id for the entry you want to find");
        Happenings foundHappenings = diary.findEntryWithId(Integer.parseInt(id));
        print(foundHappenings.toString());
        displayDiaryMenu();
    }

    private static void createEntry() {
        String title = input("Enter title for the entry");
        String body = input("Enter body for the entry");
        diary.write(title,body);
        print("Written Successfully");
        displayDiaryMenu();

    }


    private static void print(String prompt){
        //System.out.println(prompt);
        JOptionPane.showMessageDialog(null,prompt);

    }
    private static String input(String prompt){
//        print(prompt);
//        return in.nextLine();
        return JOptionPane.showInputDialog(null,prompt);

    }

}
