package ClassGradeTest;

import ChibuzorSnacks.ClassGrade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    ClassGrade grades;
    @BeforeEach
    public  void startUp(){
        grades = new ClassGrade();
    }
    @Test
    public  void listCanCalculateScoresForEachStudent(){

        int [][] grade = new int[2][2];
        grade[0][0] =64;
        grade[0][1] =34;
        grade[1][0] =36;
        grade[1][1] =94;
      //  assertEquals(130,grades.calculateTotalAtEachIndex(grade));
    }
    @Test
    public void canFindPositionForEachStudent(){
        int [][] grade = new int[2][2];
        grade[0][0] =64;
        grade[0][1] =34;
        grade[1][0] =36;
        grade[1][1] =94;
      //  assertEquals(130,grades.calculateTotalAtEachIndex(grade));
      //  assertEquals(1,grades.positionForEachStudent());
    }
}
