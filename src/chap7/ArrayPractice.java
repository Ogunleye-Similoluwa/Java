package chap7;

public class ArrayPractice {
    // Array is a collection of values of the same data type
    // Example : a crate of eggs,a crate of soft drinks
    // It has fixed length
    //index - numbering that start from 0 to access any of the elements of an array
    // To access an array you need an index.

    public static void main(String[] args) {
    /*    String []  colour = new String[7];
        colour[0] = "Red";
        colour[1] = "Orange";
        colour[2] = "Yellow";
        colour[3] = "Green";
        colour[4] = "Blue";
        colour[5] = "Indigo";
        colour[6] = "Violet"; */
        String []  colour = {"Red","Orange","Yellow","Green","Blue","Indigo","Violet"};


        for (int index =colour.length ; index > 0; index--) {
            System.out.println(colour[index]);
        }

    }
// create an array and initialize it with values. sum of the values ini the array and print them out
//  write psuedocode
}
