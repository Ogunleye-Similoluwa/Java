package w3Resource;

public class Equalno {
    public static void main(String[] args) {

        int no = 1;
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                for (int c = 1; c <= 4; c++) {
                    if (a != b && a!= c &&  b!= c) {
                            no++;
                        System.out.println(a + " " + b + " " + c + " ");



                    }
                }
            }
        }
        System.out.println(" "+ no);
    }


}