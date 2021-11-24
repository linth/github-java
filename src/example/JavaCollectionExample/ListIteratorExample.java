package example.JavaCollectionExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 適合用在list上面，因為不清楚整個list長度多少? 所以需要使用while確定是否有下一個節點。
 * 
 * 可以跟 ListExample.java 搭配學習!!
 */
public class ListIteratorExample {
    public static void main(String[] args) {      
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.createArrayList();

        CustomArrayList customArrayList2 = new CustomArrayList();
        customArrayList2.createLinkedListAndPrintThem();
    }
}

class CustomArrayList {
    public void createArrayList() {
        // ArrayList<String> list = new ArrayList<String>();
        // ArrayList<String> list = addData(new ArrayList<String>());
        List<String> list = addData(new ArrayList<String>());
        ListIterator<String> litr = list.listIterator();

        // list.forEach(s -> {
        //     System.out.println(s); // using foreach to show.
        // });

        System.out.println("from front to back.");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("from back to front.");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }

    public void createLinkedListAndPrintThem() {
        // * create linked list and print them.
        LinkedList<String> linkedList = addData(new LinkedList<String>());

        // 使用 ListIterator 方式來歷遍
        ListIterator<String> litr = linkedList.listIterator();
        // useListIterator(litr);
        
        // 使用 foreach 方式來歷遍
        useForEach(linkedList);

        // 使用 iterator 方式來歷遍
        useIterator(linkedList);
    }

    public static void useListIterator(ListIterator<String> litr) {
        // 使用 ListIterator 方式來歷遍

        System.out.println("from front to back.");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("from back to front.");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }

    public static void useForEach(LinkedList<String> linkedList) {
        // * 使用 foreach 方式來歷遍
        linkedList.forEach(s -> {
            System.out.println(s);
        });
    }

    public static void useIterator(LinkedList<String> linkedList) {
        // * 使用 iterator 方式來歷遍
        linkedList.iterator()
            .forEachRemaining(s -> {
                System.out.println(s);
            });
    }

    public List<String> addData(List<String> arrayList) {
        // * add data: arraylist.
        arrayList.add("TW");
        arrayList.add("HK");
        arrayList.add("US");
        arrayList.add("JAP");
        return arrayList;
    }

    public LinkedList<String> addData(LinkedList<String> linkedList) {
        // * add data: linked list.
        linkedList.add("TW");
        linkedList.add("CN");
        linkedList.add("HK");
        linkedList.add("CAN");
        linkedList.addFirst("UK");
        linkedList.addLast("EN");
        return linkedList;
    }
}

