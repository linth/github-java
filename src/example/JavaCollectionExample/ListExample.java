package example.JavaCollectionExample;

import java.util.*;

/**
 * Reference:
 *  - https://beginnersbook.com/2013/12/java-arraylist/
 */
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

    public void forEachArrayList(ArrayList<String> list) {
        // using forEach to print the arraylist.
        for (String element : list) {
            System.out.println(element);
        }
    }

    public void usingIteratorArrayList(ArrayList<String> list) {
        // using Iterator class to travel the arraylist.
        Iterator<String> itr = list.iterator();
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public ArrayList<String> list2AnotherList(ArrayList<String> list) {
        ArrayList<String> antherList = new ArrayList<String>();

        list.forEach(element -> {
            antherList.add(element);
        });
        return antherList;
    }

    public int getNumberOfElement(ArrayList<String> list) {
        return list.size();
    }
}
