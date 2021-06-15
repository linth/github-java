package example.JavaCollectionExample;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("TW");
        list.add("US");
        list.add("HK");

        //! 使用foreach物件來歷遍arraylist
        for (String obj:list) {
            System.out.println(obj);
        }

        //! 使用iterator物件來歷遍arraylist
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
