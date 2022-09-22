package Chap3;
/*(Computerization of Health Records) A health-care issue that has been in the news lately is
        the computerization of health records. This possibility is being approached cautiously because of
        sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
        Computerizing health records could make
        it easier for patients to share their health profiles and histories among their various health-care professionals.
        This could improve the quality of health care,
        help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
        save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person.
        The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
        attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
        The class also should include methods that calculate and return the user’s age in years, maximum
        heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
        Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s first name
, last name, gender, date of birth, height and weight—then calculates and prints the

        person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
        the BMI values chart from Exercise 2.33**/

import java.util.Scanner;

public class HealthRecordTest {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);

        HealthRecord heart = new HealthRecord(" "," ",0,0,0,0,0);


        System.out.println("Please enter your information");

        System.out.println("Enter your first name");
        String firstName = in.nextLine();
        heart.setFirstName(firstName);
        System.out.println("Enter your last name");
        String lastName = in.nextLine();
        heart.setLastName(lastName);
        System.out.println("Enter day Of Birth");
        int day = in.nextInt();
        heart.dayOfBirth(day);
        System.out.println("Enter month of birth");
        int month = in.nextInt();
        heart.monthOfBirth(month);
        System.out.println("Enter year of birth");
        int year = in.nextInt();
        heart.yearOfBirth(year);
        System.out.println("Enter your height in inches");
        double height= in.nextDouble();
        heart.setHeight(height);
        System.out.println("Enter weight in kilogram");
        double weight = in.nextDouble();
        heart.setWeight(weight);
        System.out.println("Enter gender ");
        String gender = in.nextLine();
        heart.setGender(gender);
        System.out.println();
        System.out.println();
        System.out.println("""
                |-----------------|
                |                 |
                | HEALTH RECORD   |
                |_________________|
                """);

        System.out.println();
        System.out.println();

        System.out.printf("%s%s%n%s%s%n%s%d/%d/%d%n%s%d%n%s%d",  "First name :",heart.getFirstName() ,"Last name :",heart.getLastName(),"Date of Birth :", heart.getDayOfBirth(),
                heart.getMonthOfBirth(),heart.getYearOfBirth(),"Age :",heart.calculateAge(),"Your heart rate is :", heart.CalculateMaximumHeartRate());
        System.out.println();
        heart.calculateTargetRangeHeartRate();
        System.out.println();
        System.out.printf("Gender : %s ", heart.getGender());
        System.out.println();
        System.out.printf("Height:%.2f",heart.getHeight());
        System.out.println();
        System.out.printf("Weight :%.2f",heart.getWeight());
        System.out.println();
        heart.calculateBMI();


    }
}
