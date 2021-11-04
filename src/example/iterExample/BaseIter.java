package example.iterExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 詳細請追原始碼，初步這裡講概念。 
 * 1) iterable, iterator 皆為 interface class. 
 * 2) 如果一個class實現iterable interface，那就需要建立一個內部類去實現一個iterator class。 
 * 3) 如果能使用跌代器iterator來歷遍就可以使用foreach 
 * 4) Map無法直接使用foreach，但List, Set可以。
 * 
 * Reference 
 *  - https://kucw.github.io/blog/2018/12/java-iterator/
 *  - https://www.baeldung.com/java-iterable-to-collection
 */

// interface Iterable<T> {
// Iterator<T> iterator();
// }

// ! 可使用跌代器 iterator 去歷遍 ArrayList
// interface Iterator<E> {
// boolean hasNext();

// E next();

// void remove(); // delet the last element.
// }

public class BaseIter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world.");

        Iterator<String> its = list.iterator();

        // while (true) {
        // if (its.hasNext()) {
        // System.out.println(its.next());
        // } else {
        // break;
        // }
        // }

        // 通常會寫的程式碼，使用foreach
        for (String s : list) {
            System.out.println(s);
        }

        // 實際上會被編譯成使用iterator去歷遍。

        iterableExample();
    }

    /**
     * In this tutorial, we explore different ways to convert an iterable a collection in Java.
     */
    public static void iterableExample() {
        // ! 請注意 iterable 和 iterator 差異!!

        // define our Iterable.
        Iterable<String> iterable = Arrays.asList("john", "tom", "jane");

        // define a simple Iterator.
        Iterator<String> iterator = iterable.iterator();

        System.out.println("使用 iterable 歷遍: ");
        iterable.forEach(s -> { System.out.println(s); });
        System.out.println("使用 iterator 歷遍: ");
        iterator.forEachRemaining(s -> { System.out.println(s); });
    }

    public static void iterableGenericExample() {
        // TODO: 可以試試看使用 generic method
        Iterable<String> iterable = Arrays.asList("john", "tom", "jane");
    }

    public void testIterableConvertToList() {
        List<String> list = new ArrayList<>();
        Iterable<String> iterable = Arrays.asList("john", "tom", "jane");

        iterable.forEach(list::add);
    }
}
