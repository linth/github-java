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
 * 
 * Iterable:
 *!  - 代表能被迭代的集合，所以能被For-Each loop及有forEach()方法；
 * 
 * Iterator: (迭代器)
 *!  - 代表集合的迭代器，所以有hasNext()及next()用來迭代的方法。
 * 
 * TODO: 增加 forEachRemaining 範例, iterator().forEachRemaining
 * 
 * Reference 
 *  - https://kucw.github.io/blog/2018/12/java-iterator/
 *  - https://www.baeldung.com/java-iterable-to-collection
 *  - https://www.gushiciku.cn/pl/g25m/zh-tw
 *  - https://openhome.cc/Gossip/Java/IterableIterator.html
 */

 // 只要繼承 Iterable 介面都必須要實作 iterator() 方法。
 /*
interface Iterable<T> {
    Iterator<T> iterator();

    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);

        for (T t : this) {
            action.accept(t);
        }
    }
}
*/

// ! 可使用跌代器 iterator 去歷遍 ArrayList
// interface Iterator<E> {
// boolean hasNext();

// E next();

// void remove(); // delet the last element.
// }

public class BaseIter {
    public static void main(String[] args) {
        useIterable();
        useIterator();

        // TODO: 舉例有無擁有iterable，但沒有iterator的範例!?
    }

    // ! 請注意 useIterable 和 useIterator 差異!!
    public static void useIterable() {
        // 使用 iterable 來迭代
        Iterable<String> iter = Arrays.asList("john", "tom", "jane");

        System.out.println("使用 iterable 來迭代歷遍:");
        iter.forEach(s -> {
            System.out.println(s);
        });
    }

    public static void useIterator() {
        // 使用 iterator 來迭代
        Iterable<String> iter = Arrays.asList("john", "tom", "jane");

        Iterator<String> iterator = iter.iterator();

        System.out.println("使用 iterator 來迭代歷遍:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void iterableGenericExample() {
        // TODO: 可以試試看使用 generic method.
    }

    public void testIterableConvertToList() {
        List<String> list = new ArrayList<>();
        Iterable<String> iterable = Arrays.asList("john", "tom", "jane");

        iterable.forEach(list::add);
    }
}
