package ChibuzorSnacks;

import java.util.Arrays;
import java.util.Scanner;

public class ClassGrade {
    public static void main(String[] args) {
        ClassGrade score = new ClassGrade();
        Scanner in = new Scanner(System.in);
        System.out.println("How many students do you have ?");
        int amountOfStudents = in.nextInt();
        System.out.println("How many subjects do they offer ?");
        int amountOfSubjects = in.nextInt();
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
        int[][] grades = new int[amountOfStudents + 1][amountOfSubjects];
        int[] total = new int[grades.length];
        int[] average = new int[grades.length];
        int total2 = 0;
        for (int i = 1; i < grades.length; i++) {
            for (int j = 1; j < grades[i].length; j++) {
                System.out.println("Enter score for  student " + i);
                System.out.println("Enter grades for subject " + j);
                grades[i][j] = in.nextInt();
                System.out.println("""
                        Saving >>>>>>>>>>>>>>>>>>>>>>>>>>
                        Saved successfully
                        """);
                total[i] += grades[i][j];
            }
            for (int test = 0; test < grades[0].length; test++) {
                System.out.printf("Test %d ", test + 1);
            }

            System.out.println("Average"); // student average column heading

            // create rows/columns of text representing array grades
            for (int student = 0; student < grades.length; student++) {
                System.out.printf("Student %2d", student + 1);

                for (int test : grades[student]) { // output student's grades
                    System.out.printf("%8d", test);
                }
                // call method getAverage to calculate student's average grade;
                // pass row of grades as the argument to getAverage

                System.out.printf("%9.2f%n", average);


                //  double average = getAverage(grades[student]);
            }
        }


//        for (int i = 0; i < grades.length; i++) {
//            for (int  j :grades[i]) {
//                System.out.printf("""
//                        %d
//                        %d
//                        %d
//                        """, j,total[i],total[i]/ grades.length-1);
//
//            }
//            System.out.println();
//        }

            System.out.println("SUBJECT SUMMARY");
            System.out.println("Subject 1");
            for (int i = 1; i < grades.length + 1; i++) {
                for (int j = 1; j < grades[i].length + 1; j++) {
                    int lowestGrade = grades[0][0];
                    int highestGrade = grades[0][0];
                    if (grades[i][j] > highestGrade) {
                        highestGrade = grades[i][j];
                        System.out.println("The highest grade  scored by student " + j + " : " + highestGrade);
                    }
                    if (grades[i][j] < lowestGrade) {
                        lowestGrade = grades[i][j];
                        System.out.println("The lowest grade  scored by student " + j + " : " + lowestGrade);
                    }

                }
            }


        }


    public  void positionForEachStudent(int [] total){
        int [] position = new int[total.length];
        int n = total.length;
        int pos =0;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (total[j] > total[j + 1]) {
                      total[j] =i++;
                    total[j + 1] = i++;
                }
    }
    

}
    

