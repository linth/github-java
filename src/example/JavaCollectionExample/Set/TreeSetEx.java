package example.JavaCollectionExample.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet example.
 *  - 使用者自訂排序 
 * 
 * Reference:
 *  - https://akuma1.pixnet.net/blog/post/244432678-%E5%9F%BA%E7%A4%8E%E8%A8%93%E7%B7%B4%EF%BC%8D%EF%BC%8D%2809%29java%E8%88%87collection
 */
public class TreeSetEx {
    
    public static void main(String[] args) {
        
        Set<Integer> set = new TreeSet<>();
        set.add(8);
        set.add(9);
        set.add(11);
        set.add(1);

        // 使用 for-each.
        set.forEach(item -> {
            System.out.println(item);
        });

        // 使用 iterator.
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        } 
    }


}
