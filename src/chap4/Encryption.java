package chap4;
/* (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data.
 A company that wants to send data over the Internet has asked you to write a program that will encrypt it so
  that it may be transmitted more securely. All the data is transmitted as four-digit integers.
   Your application should read a four-digit integer entered by the user and encrypt it as follows:
    Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]
 */

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstAdd=0;
        int secondAdd=0;
        int thirdAdd=0;
        int fourthAdd=0;
        int temp ;
        int temp2 ;
        int remainder ;

        System.out.println("Enter number to be encrypted");
        int en = input.nextInt();
        int length = String.valueOf(en).length();
        if (length == 4) {
                remainder = en % 10;
                fourthAdd = remainder + 7;
                fourthAdd = fourthAdd % 10;
                en = en / 10;
                remainder = en % 10;
                thirdAdd =  remainder + 7;
                thirdAdd = thirdAdd % 10;
                en = en / 10;
                remainder = en % 10;
                secondAdd =  remainder + 7;
                secondAdd = secondAdd % 10;
                en = en / 10;
                remainder = en % 10;
                firstAdd = remainder + 7;
                firstAdd = firstAdd % 10;
                en = en / 10;

                temp = firstAdd;
                firstAdd = thirdAdd;
                thirdAdd = temp;

                temp2 = secondAdd;
                secondAdd = fourthAdd;
                fourthAdd = temp2;

        }
        else {
            System.out.println("Length if number is greater than 4");
        }
        System.out.printf(" Encrypted number :%d,%d,%d,%d ", firstAdd, secondAdd, thirdAdd, fourthAdd);

        System.out.println("Decryption");
        System.out.println("Enter number to be encrypted");
        int de = input.nextInt();
            de = de % 10;
            remainder = de / 10;
            fourthAdd = remainder % 10;
            if (fourthAdd + 10 > 16) {
                fourthAdd += 10;
                fourthAdd = fourthAdd / 10;
            }
            remainder = de / 10;
            thirdAdd =  remainder % 10;
        if (thirdAdd + 10 > 16) {
            thirdAdd += 10;
            thirdAdd = thirdAdd / 10;
        }
            de = de / 10;
            remainder = de % 10;
            secondAdd =  remainder % 10;
            de = de / 10;
            remainder = de % 10;
            firstAdd = remainder + 7;
            de = de / 10;

            temp = firstAdd;
            firstAdd = thirdAdd;
            thirdAdd = temp;

            temp2 = secondAdd;
            secondAdd = fourthAdd;
            fourthAdd = temp2;

        }


}
