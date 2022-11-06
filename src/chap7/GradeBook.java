package chap7;

public class GradeBook {
    private String courseName;
    private int []grades ;

    public GradeBook(String courseName , int [] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void processGrade(){
        outputGrade();
        System.out.println("Class Average : " + getAverage());
        System.out.println("Lowest grade : " + getLowestGrade() + "\n" + "Highest grade : " + getHighestGrade() );

        outputBarChart();
    }
    public  int getLowestGrade() {
        int lowestGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }
        return lowestGrade;
    }
        public  int getHighestGrade(){
            int highestGrade = grades[0];
            for (int grade : grades){
                if (grade > highestGrade){
                    highestGrade = grade;
                }
            }
            return highestGrade;
    }
    public double  getAverage(){
       double total = 0;


        for (int grade : grades){
            total += grade;
        }
        return (double) total/ grades.length;

    }
    public void outputBarChart(){
        System.out.println("Grade Distribution");
        int [] frequency = new int[11];
            for (int grade : grades){
                ++frequency[grade/10];
            }
            for (int count = 0; count < frequency.length ; count++){
                    if (count == 10){
                        System.out.printf("%5d:",100);
                    }
                    else {
                        System.out.printf("%02d-%02d:",count * 10,count*10 + 9);
                    }
                    for (int stars = 0 ; stars < frequency[count]; stars++){
                        System.out.print("*");
                    }
                    System.out.println();
            }
    }
    public void outputGrade(){
        System.out.println("Grades");
        for (int student = 1 ; student < grades.length; student++){
            System.out.printf("%n student%2d:%3d" , student + 1, grades[student]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] gradeArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook score = new GradeBook("CS101 Introduction to Java Programming",gradeArray);
        System.out.println("""
                Welcome to grade book for \n
                """ + score.getCourseName());
                score.processGrade();
    }
}
