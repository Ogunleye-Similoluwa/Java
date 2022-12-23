package ChibuzorSnacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class ClassGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> students = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();


        out.println("Enter the amount of students");
        int amountOfStudents = in.nextInt();
        out.println("Enter the amount of subjects");
        int amountOfSubjects = in.nextInt();
        int[][] grade = new int[amountOfStudents + 1][amountOfSubjects + 1];
        int score;


        int[] total ;
        for (int i = 1; i < grade.length; i++) {
            total = new int[grade.length];
            for (int j = 1; j < grade[i].length; j++) {
                out.println("Enter score for student " + i);
                out.println("Enter score subject " + j);
                score = in.nextInt();
                grade[i][j] = score;
                total[i] += score;

            }
        }
        for (int i = 1; i < grade.length; i++) {
            out.print("student" + "  " + i);
            for (int j : grade[i]) {
                out.print(" " + j );

            }
            out.println();

        }
//        for (int point : total) {
//            out.println(point);
//        }
    }
    private static int calculateTotal(int [][] score){
        int score1 = score.length;
       // int [] score2 = score1[].length;
        int [] total = new int[score1];
    return  0;

    }
}
