package chap16;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        String [] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.println(list);
        Set<String> set = new TreeSet<>(list);
        for (String value : set){
            System.out.print(value + " ");
        }

    }
}
