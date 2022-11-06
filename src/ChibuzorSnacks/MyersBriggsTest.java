package ChibuzorSnacks;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class MyersBriggsTest {
    //    ArrayList<String> bList = new ArrayList<>();
//    ArrayList<String> cList = new ArrayList<>();
//    ArrayList<String> dList = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    private static String concat = " ";
    private static int aCount = 0;
    private static int bCount = 0;
    private static int aCount1 = 0;
    private static int bCount1 = 0;
    private static int aCount2 = 0;
    private static int bCount2 = 0;
    private static int aCount3 = 0;
    private  static int bCount3 = 0;

    //
    public static void question1(ArrayList<String> aList) {

        String q1 = "A. Expend energy, Enjoy groups";
        String q2 = "B. Converse energy, Enjoy one-on-one";
        String q3 = "A. Interpret Literally";
        String q4 = "B. Look for Meaning and possibilities";
        String q5 = "A. Logical, Thinking, Questioning ";
        String q6 = "B. Empathetic,Feeling,Accommodating";
        String q7 = "A. Organized,Orderly ";
        String q8 = "B. Flexible, Adaptable";
        String q9 = "A. More out going, Think out loud";
        String q10 = "B. More reserved, Think to your self";
        for (int i = 1; i <= 5; ) {

            out.print("A " + " :Expend energy, Enjoy groups");
            out.print("       B " + "Converse energy, Enjoy one-on-one");
            out.println();
            String answer = in.next().toUpperCase();

            if (answer.equals("A") | answer.equals("B") && i == 1) {

                if (answer.equals("A")) {
                    aList.add(q1);
                    aCount++;


                }
                if (answer.equals("B")) {
                    aList.add(q2);
                    bCount++;
                }
                i++;
            }
            out.print("A " + " Interpret Literally    ");
            out.print("      B" + " Look for Meaning and possibilities");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && i == 2) {
                if (answer.equals("A")) {
                    aList.add(q3);
                    aCount++;

                }
                if (answer.equals("B")) {
                    bCount++;
                    aList.add(q4);
                }
                i++;
            }
            out.print("A " + " Logical, Thinking, Questioning   ");
            out.print("      B" + " Empathetic,Feeling,Accommodating");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && i == 3) {
                if (answer.equals("A")) {
                    aList.add(q5);
                    aCount++;


                }
                if (answer.equals("B")) {
                    aList.add(q6);
                    bCount++;

                }
                i++;
            }
            out.print("A " + " Organized,Orderly   ");
            out.print("      B" + " Flexible, Adaptable");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && i == 4) {
                if (answer.equals("A")) {
                    aCount++;
                    aList.add(q7);

                }
                if (answer.equals("B")) {
                    bCount++;
                    aList.add(q8);

                }
                i++;
            }
            out.print("A " + " More out going, Think out loud   ");
            out.print("      B" + "    More reserved, Think to your self");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && i == 5) {
                if (answer.equals("A")) {
                    aList.add(q9);
                    aCount++;

                }
                if (answer.equals("B")) {
                    aList.add(q10);
                    bCount++;

                }
                i++;
            }
        }
        out.println();


        if (aCount > bCount) {
            concat += "E";

        } else {
            concat += "I";
        }

    }

    public static void question2(ArrayList<String> bList) {
        String q11 = "A. practical, realistic, experiential";
        String q12 = "B. imaginative, innovative, theoretical";
        String q13 = "A. candid, straight forward, frank";
        String q14 = "B. tactful, kind, encouraging";
        String q15 = "A. plan, schedule ";
        String q16 = "B. unplanned, spontaneous";
        String q17 = "A. seek many tasks, public activities, interaction with others ";
        String q18 = "B. seek private, solitary activities with quiet to concentrate";
        String q19 = "A. standard, usual, conventional";
        String q20 = "B. different, novel, unique";
        for (int counter2 = 1; counter2 <= 5; ) {
            out.print("A " + " :Practical, Realistic,Experimental   ");
            out.print("       B " + "    Imaginative,Innovative,Theoretical ");
            out.println();
            String answer = in.next().toUpperCase();

            if (answer.equals("A") | answer.equals("B") && counter2 == 1) {
                if (answer.equals("A")) {
                    bList.add(q11);
                    aCount1++;
                }
                if (answer.equals("B")) {
                    bList.add(q12);
                    bCount1++;
                }
                counter2++;
            }
            out.print("A " + " Candid,Straight forward, Frank   ");
            out.print("      B" + " tactful, kind, encouraging ");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter2 == 2) {
                if (answer.equals("A")) {
                    bList.add(q13);
                    aCount1++;
                }
                if (answer.equals("B")) {
                    bList.add(q14);
                    bCount1++;
                }
                counter2++;
            }
            out.print("A " + " plan, schedule   ");
            out.print("      B" + " unplanned, spontaneous");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter2 == 3) {
                if (answer.equals("A")) {
                    bList.add(q15);
                    aCount1++;
                }
                if (answer.equals("B")) {
                    bList.add(q16);
                    bCount1++;
                }
                counter2++;
            }
            out.print("A " + " seek many tasks, public activities, interaction with other   ");
            out.print("      B" + " seek private, solitary activities with quiet to concentrate");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter2 == 4) {
                if (answer.equals("A")) {
                    bList.add(q17);
                    aCount1++;
                }
                if (answer.equals("B")) {
                    bList.add(q18);
                    bCount1++;
                }
                counter2++;
            }
            out.print("A " + " standard, usual, conventional   ");
            out.print("      B" + "    different, novel, unique");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter2 == 5) {
                if (answer.equals("A")) {
                    bList.add(q19);
                    aCount1++;
                }
                if (answer.equals("B")) {
                    bList.add(q20);
                    bCount1++;
                }
                counter2++;
            }
            out.println();
        }
        if (aCount1 > bCount1) {
            concat += "S";

        } else {
            concat += "N";
        }
    }

    public static void question3(ArrayList<String> cList) {
        String q21 = "A. firm, tend to criticize, hold the line ";
        String q22 = "B.  gentle, tend to appreciate, conciliate";
        String q23 = "A.  regulated, structured ";
        String q24 = "B. easygoing, “live” and “let live";
        String q25 = "A. external, communicative, express yourself ";
        String q26 = "B. internal, reticent, keep to yourself";
        String q27 = "A. focus on here-and-now ";
        String q28 = "B. look to the future, global perspective, “big picture”";
        String q29 = "A. tough-minded, just";
        String q30 = "B. tender-hearted, merciful";

        for (int counter3 = 1; counter3 <= 5; ) {
            out.print("A " + " : firm, tend to criticize, hold the line  ");
            out.print("       B " + "  gentle, tend to appreciate, conciliate  ");
            out.println();
            String answer = in.next().toUpperCase();

            if (answer.equals("A") | answer.equals("B") && counter3 == 1) {
                if (answer.equals("A")) {
                    aCount2++;
                    cList.add(q21);
                }
                if (answer.equals("B")) {
                    bCount2++;
                    cList.add(q22);

                }
                counter3++;
            }
            out.print("A " + " regulated, structured   ");
            out.print("      B" + " easygoing, “live” and “let live” ");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter3 == 2) {
                if (answer.equals("A")) {
                    aCount2++;
                    cList.add(q23);
                }
                if (answer.equals("B")) {
                    bCount2++;
                    cList.add(q24);
                }
                counter3++;
            }
            out.print("A " + " external, communicative, express yourself   ");
            out.print("      B" + "  internal, reticent, keep to yourself");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter3 == 3) {
                if (answer.equals("A")) {
                    aCount2++;
                    cList.add(q25);
                }
                if (answer.equals("B")) {
                    bCount2++;
                    cList.add(q26);
                }
                counter3++;
            }
            out.print("A " + " focus on here-and-now  ");
            out.print("      B" + " look to the future, global perspective, “big picture”");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter3 == 4) {
                if (answer.equals("A")) {
                    aCount2++;
                    cList.add(q27);
                }
                if (answer.equals("B")) {
                    bCount2++;
                    cList.add(q28);
                }
                counter3++;
            }
            out.print("A " + " tough-minded   ");
            out.print("      B" + "   tender-hearted, merciful");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter3 == 5) {
                if (answer.equals("A")) {
                    aCount2++;
                    cList.add(q29);
                }
                if (answer.equals("B")) {
                    bCount2++;
                    cList.add(q30);
                }
                counter3++;
            }
            out.println();
        }
        if (aCount2 > bCount2) {
            concat += "T";

        } else {
            concat += "F";
        }
    }

    public static void question4(ArrayList<String> dList) {
        String q31 = "A. preparation, plan ahead";
        String q32 = "B. go with the flow, adapt as you go ";
        String q33 = "A. active, initiate";
        String q34 = "B. reflective, deliberate";
        String q35 = "A. facts, things, “what is” ";
        String q36 = "B. ideas, dreams, “what could be,” philosophical";
        String q37 = "A. matter of fact, issue-oriented ";
        String q38 = "B. sensitive, people-oriented, compassionate";
        String q39 = "A. control, govern";
        String q40 = "B. latitude, freedom";
        for (int counter4 = 1; counter4 <= 5; ) {
            out.print("A " + " : preparation, plan ahead  ");
            out.print("       B " + "  go with the flow, adapt as you go ");
            out.println();
            String answer = in.next().toUpperCase();

            if (answer.equals("A") | answer.equals("B") && counter4 == 1) {
                if (answer.equals("A")) {
                    aCount3++;
                    dList.add(q31);
                }
                if (answer.equals("B")) {
                    bCount3++;
                    dList.add(q32);
                }
                counter4++;
            }
            out.print("A " + " active, initiate   ");
            out.print("      B" + " reflective, deliberate ");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter4 == 2) {
                if (answer.equals("A")) {
                    aCount3++;
                    dList.add(q33);
                }
                if (answer.equals("B")) {
                    bCount3++;
                    dList.add(q34);
                }
                counter4++;
            }
            out.print("A " + " facts, things, “what is”   ");
            out.print("      B" + "   ideas, dreams, “what could be,” philosophical");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter4 == 3) {
                if (answer.equals("A")) {
                    aCount3++;
                    dList.add(q35);
                }
                if (answer.equals("B")) {
                    bCount3++;
                    dList.add(q36);
                }
                counter4++;
            }
            out.print("A " + " matter of fact, issue-oriented  ");
            out.print("      B" + " sensitive, people-oriented, compassionate");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter4 == 4) {
                if (answer.equals("A")) {
                    aCount3++;
                    dList.add(q37);
                }
                if (answer.equals("B")) {
                    dList.add(q38);
                    bCount3++;
                }
                counter4++;
            }
            out.print("A " + " control, govern  ");
            out.print("      B" + " latitude, freedom ");
            out.println();
            answer = in.next().toUpperCase();
            if (answer.equals("A") | answer.equals("B") && counter4 == 5) {
                if (answer.equals("A")) {
                    dList.add(q39);
                    aCount3++;
                }
                if (answer.equals("B")) {
                    bCount3++;
                    dList.add(q40);
                }
                counter4++;
            }
            out.println();
        }
        if (aCount3 > bCount3) {
            concat += "J";

        } else {
            concat += "P";
        }
    }

    public static void result(ArrayList<String> aList, ArrayList<String> bList, ArrayList<String> cList, ArrayList<String> dList) {
        for (String i : aList) {
            out.println(i);
        }
        out.println("Number of A selected: " + aCount);
        out.println("Number of B selected: " + bCount);
        out.println();
        out.println();
        for (String i : bList) {
            out.println(i);
        }
        out.println("Number of A selected: " + aCount1);
        out.println("Number of B selected: " + bCount1);
        out.println();
        out.println();
        for (String i : cList) {
            out.println(i);
        }
        out.println("Number of A selected: " + aCount2);
        out.println("Number of B selected: " + bCount2);
        out.println();
        out.println();
        for (String i : dList) {
            out.println(i);
        }
        out.println("Number of A selected: " + aCount3);
        out.println("Number of B selected: " + bCount3);

        switch (concat) {
            case " INFP" -> {
                System.out.println("\t\t\tINFP: Mediator");
                System.out.println("You are Poetic, kind, and altrusic, always eager to help a good cause");
            }
            case " INTJ" -> {
                System.out.println("\t\t\tINTJ: Architect");
                System.out.println("You are Imaginative and a strategic thinker, with a plan for everything");
            }
            case " INTP" -> {
                System.out.println("\t\t\tINTP: Logician");
                System.out.println("You are an innovative inventor with an unquenchable thirst for knowledge");
            }
            case " ENTJ" -> {
                System.out.println("\t\t\tENTJ: Commander");
                System.out.println("You are a bold, imaginative and strong-willes leader, always finding a way or making one");
            }
            case " ENTP" -> {
                System.out.println("\t\t\tENTP: Debater");
                System.out.println("You are a smart and a curious thinker who cannot resist an intellectual challenge");
            }
            case " INFJ" -> {
                System.out.println("\t\t\tINFJ: Advocate");
                System.out.println("You are quiet and mystical, yet very inspiring and tireless idealists");
            }
            case " ENFJ" -> {
                System.out.println("\t\t\tENFJ: Protagonist");
                System.out.println("You're a charismatic and inspiring leader, able to mesmerize his listeners");
            }
            case " ENFP" -> {
                System.out.println("\t\t\tENFP: Campaigner");
                System.out.println("You're enthusiastic, creative and sociable free spirit, who can always find a reason to smile ");
            }
            case " ISTJ" -> {
                System.out.println("\t\t\tISTJ: Logistician");
                System.out.println("You are a practical and fact-minded individual, whose reliability cannot be doubted");
            }
            case " ISFJ" -> {
                System.out.println("\t\t\tISFJ: Defender");
                System.out.println("You're a very dedicated and warm protector, always ready to defend your loved ones");
            }
            case " ESTJ" -> {
                System.out.println("\t\t\tESTJ: Executive");
                System.out.println("You're an excellent administrator, unsurpassed at managing things or people");
            }
            case " ESFJ" -> {
                System.out.println("\t\t\tESFJ: Consul");
                System.out.println("You're a extraordinarily caring, social and popular, always eager to help");
            }
            case " ISTP" -> {
                System.out.println("\t\t\tISTP: Virtuoso");
                System.out.println("You're a bold and practical experimenter, master of all tools");
            }
            case " ISFP" -> {
                System.out.println("\t\t\tISFP: Adventurer");
                System.out.println("You're a flexible charming artist, always ready to explore somehing new");
            }
            case " ESTP" -> {
                System.out.println("\t\t\tESTP: Entrepreneur");
                System.out.println("You're a smart, energetic and very perceptive");
            }
            case " ESFP" -> {
                System.out.println("\t\t\tESFP: Entertainer");
                System.out.println("You're spontaneous, energetic and enthusiastic, life is never boring around you");
            }
        }

    }
}