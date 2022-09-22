package ChibuzorAssignment;
/*5.17 (Student Grades) A group of five students earned the following grades:
 Student 1, ‘A’; student 2, C’; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’
. Write an application that reads a series
        of pairs of numbers as follows:
        a) student name
        b) student letter grade
        Your program should use a switch statement to determine how many students got a grade of ‘A’,
        how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
        loop as needed to input the five student grades, and then finally display the results*/


import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

            int count =0;
        String name = " ";
        int grade = 0;

            while (count< 5) {
                System.out.println("enter name of student");
                name = in.next();
                count++;
                System.out.println(name);

                System.out.println("Enter letter grade");
                grade = in.nextInt();
                grade++;
                switch (grade / 10) {
                    case 9:
                    case 8:
                        aCount++;
                        break;
                    case 5:
                        cCount++;
                        break;
                    case 7:
                    case 6:
                        bCount++;
                        break;
                    default:
                        dCount++;

                }
            }
        System.out.println("\n " +  " A : " + aCount + " Students" +
                "\n "   + " B : " + bCount + " students" +
                "\n " +  " C : " + cCount + " Students" +
                "\n " + " D : " + dCount + " Students");

    }
}
