package example.JavaCollectionExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * HashSet, LinkedHashSet, TreeSet class.
 */
public class SetExample {
    public static void main(String[] args) {
        // example for hashset.
        HashSetExample hse = new HashSetExample();
        hse.example();
        hse.example2();

        // example for linkedhashset.
        LinkedHashSetExample lhse = new LinkedHashSetExample();
        lhse.example();

        // example for treeset.
        TreeSetExample tse = new TreeSetExample();
        tse.example();
    }
}

/**
 * HashSet
 *  - 簡單好用
 *  - 串列資料較多時，效率會變差。
 */
class HashSetExample {
    void example() {
        HashSet<String> set = new HashSet<String>();
        set.add("George");
        set.add("May");
        set.add("JJ");

        System.out.println("content: " + set);
        System.out.println("# of element: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println("Include George: " + set.contains("George"));

        set.remove("JJ");
        System.out.println("content: " + set);
    }

    void example2() {
        var set = new HashSet<String>();
        set.add("AA");
        set.add("HH");
        set.add("KK");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("HashSet content: " + itr.next());
        }
    }
}

/**
 * LinkedHashSet
 *  - 可以有 null 資料
 *  - 可保存原始插入元素的順序
 */
class LinkedHashSetExample {
    void example() {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("papaya");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println("content: " + itr.next());
        }
    }
}

/**
 * TreeSet
 *  - 跟HashSet一樣，每元素皆是唯一
 *  - 順序為由大到小排列
 *  - 存取速度非常快
 */
class TreeSetExample {
    void example() {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(8);
        set.add(9);
        set.add(11);
        set.add(1);

        System.out.println("first: " + set.first()); // get the first element.
        System.out.println("last: " + set.last());  // get the last element.

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println("content: " + itr.next());
        }
    }
}