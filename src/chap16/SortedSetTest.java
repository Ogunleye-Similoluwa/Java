package chap16;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
    public static void main(String[] args) {
        String [] colors = {"red", "white",  "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        for (String value : tree) {
            System.out.println(value);
        }
        for (String value : tree) {
            System.out.println(tree.headSet("orange"));
        }
        for (String value : tree) {
            System.out.println(tree.tailSet("orange"));
        }
        System.out.println(tree.first());
        System.out.println(tree.last());

    }
}
