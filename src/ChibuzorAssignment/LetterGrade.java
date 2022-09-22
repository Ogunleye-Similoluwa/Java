package ChibuzorAssignment;

import java.util.Scanner;

public class LetterGrade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter grade within the range 100 and Enter -1 to quit");
        int total=0;
        int gradeCounter= 0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int fCount=0;
        System.out.println();
        System.out.println();
        System.out.print("\nEnter grade or -1 to quit:");
        int grade = input.nextInt();



        while(grade != -1){
            System.out.print("Enter grade or -1 to quit:");
             grade = input.nextInt();
             total = total + grade;
             gradeCounter++;

            switch (grade / 10) {
                case 10, 9 -> aCount++;
                case 8 -> bCount++;
                case 7 -> cCount++;
                case 6 -> dCount++;
                default -> fCount++;
            }
        }
        System.out.printf("%nGrade report %n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("The number of student are %d and the total grade is: %d", gradeCounter, total);
            System.out.printf("%nThe total average of the grade is %.2f", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                     "Number of students who received each grade:",
                     "A: ", aCount,
                     "B: ", bCount,
                     "C: ", cCount,
                     "D: ", dCount,
                     "F: ", fCount);
        }
        else {
            System.out.println("No grade was entered");
        }
    }
}
