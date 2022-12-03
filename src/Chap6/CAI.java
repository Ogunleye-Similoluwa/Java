package Chap6;

import java.security.SecureRandom;
import java.util.Scanner;

/*
(Computer-Assisted Instruction) The use of computers in education is referred to as
computer-assisted instruction (CAI). Write a program that will help an elementary school student learn
multiplication. Use a SecureRandom object to produce two positive one-digit integers. The program
should then prompt the user with a question, such as
How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question.
This method should be called once when the application begins execution and each time the
user answers the question correctly
 */
public class CAI {
    private final static SecureRandom random = new SecureRandom();
    public static Scanner in = new Scanner(System.in);
    public static void answerQuestion() {
        System.out.println("Answer The following questions");
        System.out.println("Which difficulty would you like to choose");
        System.out.print("Press 1 for difficulty level one and 2 for difficulty level two");
        int difficulty = in.nextInt();
        if (difficulty  == 1) {
            int a = random.nextInt(1, 11);
            int b = random.nextInt(1, 11);
            int pass = 0;
            int count = 1;
            int choice = 0;
            do {
                while (count <= 11) {
                    System.out.printf(count + "." + " what is  %d multiplied by %d", a, b);
                    System.out.println();
                    int answer = in.nextInt();

                    int mul = a * b;
                    if (answer == mul) {
                        System.out.println("Correct");
                        a = random.nextInt(1, 11);
                        b = random.nextInt(1, 11);
                        int c = random.nextInt(1, 5);
                        switch (c) {
                            case 1 -> System.out.println("Very good!");
                            case 2 -> System.out.println("Excellent!");
                            case 3 -> System.out.println("Nice work!");
                            case 4 -> System.out.println("Keep up the good work!");

                        }
                        pass++;
                    } else {
                        int d = random.nextInt(1, 5);
                        switch (d) {
                            case 1 -> System.out.println("No. Please try again.");
                            case 2 -> System.out.println("Wrong. Try once more");
                            case 3 -> System.out.println("Don't give up!");
                            case 4 -> System.out.println("No. Keep trying");
                        }
                    }
                    System.out.println();
                    count++;
                    if (count == 11 && pass > 7) {
                        System.out.println("Congratulations, you are ready to go to the next level!");
                        System.out.println("Next student");
                        count -= 10;
                    } else if (count == 11 && pass <= 7) {
                        System.out.println("Please ask your teacher for extra help.");
                        System.out.println(" To quit enter 2");
                        choice = in.nextInt();
                        if (choice == 2){
                            break;
                        }
                        System.out.println("Next Student");
                        count -= 10;
                    }


                }

            } while (choice != 2);
        }
        if (difficulty == 2){
            int a = random.nextInt(12, 21);
            int b = random.nextInt(12, 21);
            int pass = 0;
            int count = 1;
            int choice = 0;
            do {
                while (count <= 11) {
                    System.out.printf(count + "." + " what is  %d multiplied by %d", a, b);
                    System.out.println();
                    int answer = in.nextInt();

                    int mul = a * b;
                    if (answer == mul) {
                        System.out.println("Correct");
                        a = random.nextInt(12, 21);
                        b = random.nextInt(12, 21);
                        int c = random.nextInt(1, 5);
                        switch (c) {
                            case 1 -> System.out.println("Very good!");
                            case 2 -> System.out.println("Excellent!");
                            case 3 -> System.out.println("Nice work!");
                            case 4 -> System.out.println("Keep up the good work!");

                        }
                        pass++;
                    } else {
                        int d = random.nextInt(1, 5);
                        switch (d) {
                            case 1 -> System.out.println("No. Please try again.");
                            case 2 -> System.out.println("Wrong. Try once more");
                            case 3 -> System.out.println("Don't give up!");
                            case 4 -> System.out.println("No. Keep trying");
                        }
                    }
                    System.out.println();
                    count++;
                    if (count == 11 && pass > 7) {
                        System.out.println("Congratulations, you are ready to go to the next level!");
                        System.out.println("Next student");
                        count -= 10;
                    } else if (count == 11 && pass <= 7) {
                        System.out.println("Please ask your teacher for extra help.");
                        System.out.println(" To quit enter 2");
                        choice = in.nextInt();
                        if (choice == 2){
                            break;
                        }
                        System.out.println("Next Student");
                        count -= 10;
                    }


                }

            }while (choice!=2);
        }




    }

    public static void main(String[] args) {
        CAI.answerQuestion();
    }
}
