package tdd.w3;

import org.junit.jupiter.api.Test;
import w3Resource.Array.OperationsArray;

import static org.junit.jupiter.api.Assertions.*;


public class OperationsArrayTest {

    @Test
    public void addArray(){
        int [] array = {1,2,3,4,5};
        assertEquals(15,OperationsArray.totalArray(array));

            }
    @Test
    public void maxArray(){
        int [] array = {1,2,3,4,5};
        assertEquals(5, OperationsArray.maxArray(array));

    }
    @Test
    public void minArray(){
        int [] array = {1,2,3,4,5};
        assertEquals(1, OperationsArray.minArray(array));

    }
//    @Test
//    public void sumArray(){
//        int [] array = {1,2,3,4,5};
//        assertEquals(1, OperationsArray.sumOperations(maxArray(array)));
//
//    }
//    @Test
//    public  void ascOrder(){
//        int [] array = {5,4,3,2,1};
//        assertArrayEquals(array);
//    }
}
