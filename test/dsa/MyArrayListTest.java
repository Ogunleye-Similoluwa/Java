package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {
    @Test
    public void addItemSizeIncrease(){
        MyArrayList str = new MyArrayList();
        str.add("G_strings");
        str.add("F_strings");
        assertEquals(2,str.size());
    }
//    @Test
//    public void

}
