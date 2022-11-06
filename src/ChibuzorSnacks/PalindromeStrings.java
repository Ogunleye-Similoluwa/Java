package ChibuzorSnacks;

public class PalindromeStrings {
    public static void isPalindrome(String value) {
       String total = "";
        for (int j = value.length() -1 ; j >=0  ; j--) {
            total += value.charAt(j);
        }
            if (total.equals(value)){
                System.out.println( value+ " is a palindrome");
            }
            else {
                System.out.println( value+ " is not a palindrome");
            }
    }

    public static void main(String[] args) {
        String value = "madam";
        isPalindrome(value);

    }
}
