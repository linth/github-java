package example.JavaCollectionExample;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("TW");
        list.add("HK");
        list.add("US");
        System.out.println(list);

        list.addFirst("JAP");
        list.addLast("UK");
        System.out.println(list);
    }
}
