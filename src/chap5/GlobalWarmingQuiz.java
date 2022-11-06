package chap5;
/*1 (Global Warming Facts Quiz) The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the issue online. Create a five-question
multiple-choice quiz on global warming, each question having four possible answers (numbered 1–
4). Be objective and try to fairly represent both sides of the issue. Next, write an application that
administers the quiz, calculates the number of correct answers (zero through five) and returns a message to the user.
 If the user correctly answers five questions, print “Excellent”; if four, print “Very
good”; if three or fewer, print “Time to brush up on your knowledge of global warming,”
and include a list of some of the websites where you found your facts.*/




import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Answer the following questions on Global warning");
        for (int questions = 1; questions <= 5; questions++) {
            questions = in.nextInt();
            if (questions >= 1 && questions <= 5) {
                switch (questions) {
                    case 1:
                        System.out.println("Question 1: What is your name ");
                        System.out.println("(1) simex (2) adeola (3) henry (4) seun");
                        int options = in.nextInt();
                        if (options == 1) {
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect");
                            System.out.println("The right answer is (a) simex");

                        }
                        break;
                    case 2:
                        System.out.println("Question 2: What is your are you doing currently ");
                        System.out.println("(a) java (b) python (c) c++ (d) database");
                        options = in.nextInt();
                        if (options == 3) {
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect");
                            System.out.println("The right answer is (c) c++");

                        }
                        break;
                    case 3:
                        System.out.println("Question 3: which is the most used language ");
                        System.out.println("(1) java (2) c++ (3) python (4) js");
                        options = in.nextInt();
                        if (options == 3) {
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect");
                            System.out.println("The right answer is (c)python ");

                        }
                        break;
                    case 4:
                        System.out.println("Question 4: which is a front-end programming language ");
                        System.out.println("(1) java (2) c++ (3) python (4) js");
                        options = in.nextInt();
                        if (options == 4) {
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect");
                            System.out.println("The right answer is (d) js ");

                        }
                        break;
                    case 5:
                        System.out.println("Question 5: which is java derived from");
                        System.out.println("(a) java (b) c++ (c) python (d) js");
                        options = in.nextInt();
                        if (options == 2) {
                            System.out.println("Correct");
                        } else {
                            System.out.println("Incorrect");
                            System.out.println("The right answer is (b) c++ ");

                        }
                        break;

                }
            } else {
                System.out.println("You have entered a wrong question");
                System.out.println("Try again");
            }
        }
    }
}


