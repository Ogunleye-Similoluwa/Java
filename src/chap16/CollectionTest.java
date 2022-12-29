package chap16;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
        List<String> list = new ArrayList<String>();
        for(String color : colors){
            list.add(color);
        }
        String[] removeColors ={"RED","BLUE","WHITE"};
        List<String> removeList = new ArrayList<String>();
        for(String removeColor : removeColors){
            removeList.add(removeColor);
        }
        System.out.println("ArrayList");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s",list.get(i));
        }
        System.out.println();
        removeColors(list,removeList);
        for(String color : list){
            System.out.print(color);
        }
    }
    private static void removeColors(Collection<String>collectionList1,Collection<String> collectionList2){
        Iterator<String>iterator = collectionList1.iterator();
        while(iterator.hasNext()){
            if (collectionList2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
