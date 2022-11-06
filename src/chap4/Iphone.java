package chap4;

public class Iphone {
    private static double price;
    private String colour;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static   void setPrice(int price) {
        Iphone.price = price;
    }

    public static  double getPrice() {
        return price;
    }
}





