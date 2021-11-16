package example.JavaCollectionExample;

import java.util.*;

/**
 * List 範例
 *  - 搭配 iterable
 *  - 搭配 iterator
 * 
 *             ----------
 *            |  List    |  
 *             ----------    
 *             ＾       ＾    
 *  implements |        | implements
 *            /          \    
 *          /             \
 *  ----------          -----------  
 * |ArrayList |        |LinkedList |  
 *  ----------          -----------   
 * 
 * 
 * Reference:
 *  - https://beginnersbook.com/java-collections-tutorials/
 *  - https://beginnersbook.com/2013/12/java-arraylist/
 *  - https://ithelp.ithome.com.tw/articles/10216257
 *  - https://iter01.com/550657.html
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

        // FirstList example.
        FirstList firstList = new FirstList();
        firstList.createListArray();
        firstList.createLinkedListByList();
        firstList.createLinkedList();
        firstList.createList();
        // TODO: ArrayList, LinkedList 各自適合使用情境
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

class FirstList {
    private List<?> list;
    private LinkedList<?> linkedList;

    public void createListArray() {
        ArrayList<String> list = new ArrayList<String>();
        addData(list)
            .showDataByForEach(list, "ArrayList");
    }

    public void createLinkedListByList() {
        // 使用 List 去實體化 LinkedList.
        List<String> list = new LinkedList<String>();
        addData(list)
            .showDataByForEach(list, "LinkedList");     
    }

    public void createLinkedList() {
        // ! 使用 LinkedList 去實體化 LinkedList. (請注意List, LinkedList差異)
        // ? 一開始使用linkedlist去實體化，將會有linkedlist的addFirst, addLast功能。
        LinkedList<String> linkedList = new LinkedList<String>();
        addData(linkedList)
            .showDataByForEach(linkedList, "LinkedList (使用linkedlist實體化)"); // 多載方式
    }

    // ! 請注意spring寫法通常使用 interface class 方式，統一對接口，實體化則各自呼叫。
    public void createList() {
        List<String> list = new ArrayList<String>();
        addData(list)
            .showDataByForEach(list, "list");
    }

    public FirstList addData(List<String> list) {
        list.add("TW");
        list.add("US");
        list.add("HK");
        this.list = list;
        return this;
    }

    public FirstList addData(LinkedList<String> linkedList) {
        // TODO: 使用多載方式之後，是否可以結合範型來處理？
        // ? Reference: https://www.796t.com/post/NTQ5ZjI=.html
        linkedList.add("TW");
        linkedList.add("US");
        linkedList.add("HK");
        linkedList.addFirst("UK");
        linkedList.addLast("CN");
        this.linkedList = linkedList;
        return this;
    }

    // ! 多載方式
    public void showDataByForEach(List<?> list, String listName) {
        System.out.println("Class Type: " + list.getClass() + " " + System.identityHashCode(list));
        System.out.println("開始執行" + listName + "...");
        this.list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("結束" + listName + "...\n");
    }

    public void showDataByForEach(LinkedList<?> list, String listName) {
        System.out.println("Class Type: " + list.getClass() + " " + System.identityHashCode(list));
        System.out.println("開始執行" + listName + "...");
        // * you can use "list" to foreach them.
        this.linkedList.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("結束" + listName + "...\n");
    }
}
