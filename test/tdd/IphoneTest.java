package tdd;

import chap4.Iphone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IphoneTest {
  /*  public static void main(String[] args) {
        Iphone myPhone = new Iphone();
        Iphone.setPrice(10_000_000);
        System.out.printf("The price is %.2f", Iphone.getPrice());
        System.out.println();
        myPhone.setColour("Blue");
        System.out.printf("The colour is %s", myPhone.getColour());**/

    @Test
    public void price(){
        Iphone myPhone = new Iphone();
        myPhone.setPrice(10000000);
        assertEquals(10000000,Iphone.getPrice());

    }
    @Test
    public void colour(){
        Iphone myPhone = new Iphone();
        myPhone.setColour("Blue");
        assertEquals("Blue",myPhone.getColour());
    }

}
