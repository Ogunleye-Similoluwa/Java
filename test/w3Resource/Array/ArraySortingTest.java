//package w3Resource.Array;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ArraySortingTest {
//
//    @Test
//    public void testThatAscendingArrayIsReturned() {
//        int [] array = {5, 2, 3, 1, 4};
//      assertArrayEquals(array, ArraySorting.ascendingOrder(array));
//    }
//
//    @Test
//    public void testThatDescendingArrayIsReturned() {
//        int [] array = {5, 2, 3, 1, 4};
//        int [] expected = {5, 4, 3, 2, 1};
//        assertArrayEquals(expected, ArraySorting.descendingOrder(array));
//    }
//
//    @Test
//    public void testThatArrayIsShuffled() {
//        int [] array = {5, 2, 3, 1, 4};
//        assertNotEquals(array, ArraySorting.shuffling(array).toString());
//    }
//}