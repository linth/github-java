package example.JavaCollectionExample;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 適合用在list上面，因為不清楚整個list長度多少? 所以需要使用while確定是否有下一個節點。
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("TW");
        list.add("HK");
        list.add("US");
        list.add("JAP");

        ListIterator<String> litr = list.listIterator();
        
        System.out.println("from front to back.");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("from back to front.");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
