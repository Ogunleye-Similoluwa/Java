package chap8;

public class StringManipulation {
    public static void main(String[] args) {
        String[] string = {"1", "A", "2", "d", "e"};
        manipulate(string);
    }

    public static int manipulate(String[] letter) {
        int count = 0;
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for (String i : letter) {
            for (String j : num) {
                if (j.equalsIgnoreCase(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int raheemCode(String simi) {
        return simi.replaceAll("\\D", "").length();
    }
}

