package chap16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        String [] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        LinkedList<String> list = new LinkedList<>();

        for (String color : colors) {
            list.add(color);
        }
        String [] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        LinkedList<String> list2 = new LinkedList<>();
        for (String color : colors2) {
            list2.add(color);
        }
        list.addAll(list2);
        list2 = null;
        printList(list);
        removeItems(list,4,6);
        printReversedList(list);
        convertListToUpperCaseString(list);
    }
    public  static void printList(List<String> list){
        for (String color : list){
            System.out.printf("%s ",color);
        }
        System.out.println();
    }
    public static  void convertListToUpperCaseString(List<String> list){
        ListIterator<String> iteratorList = list.listIterator();
        while(iteratorList.hasNext()){
           String color = iteratorList.next();
           iteratorList.set(color.toUpperCase());
        }
        printList(list);
    }
    public static void removeItems(List<String> list, int start, int end){
        list.subList(start, end).clear();
    }
    public static void printReversedList(List<String> list){
        ListIterator iterator = list.listIterator(list.size());
       while (iterator.hasPrevious())
           System.out.printf("%s ",iterator.previous());
    }
}
