package example.JavaCollectionExample.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet example.
 *  - 可快速取出
 * 
 * Reference:
 *  - https://akuma1.pixnet.net/blog/post/244432678-%E5%9F%BA%E7%A4%8E%E8%A8%93%E7%B7%B4%EF%BC%8D%EF%BC%8D%2809%29java%E8%88%87collection
 */
public class HashSetEx {
    
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("george");
        set.add("mary");
        set.add("haha");

        // 使用 for-each.
        set.forEach(item -> {
            System.out.println(item);
        });

        // 使用 iterator.
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
