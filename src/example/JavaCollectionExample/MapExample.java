package example.JavaCollectionExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap, LinkedHashMap, TreeMap
 * 
 * 
 *          ----------
 *         |  Map     |   <  -  - - - - - - - -
 *          ----------    <                    \
 *          ＾       ＾      \                   \
 *  extends |        |         \   implements     \   implements
 *         /          \          \                 \
 *        /             \implements \                \
 *  ----------          --------     -------------   --------- 
 * |SortedMap |        |HashMap |   |LinkedHashMap| |HashTable|
 *  ----------          --------     -------------   --------- 
 *     ^
 *     | implements
 *  ----------    
 * |TreeMap   | 
 *  ----------         
 * 
 * Reference: 
 *  - https://www.w3spoint.com/hashmap-linkedhashmap-treemap-hashtable-java
 *  - https://beginnersbook.com/2014/06/difference-between-hashmap-and-hashtable/
 *  - https://beginnersbook.com/java-collections-tutorials/
 */
public class MapExample {
    public static void main(String[] args) {
        // example for HashMap.
        HashMapExample hme = new HashMapExample();
        hme.example();

        // example for LinkedHashMap.
        LinkedHashMapExample lhme = new LinkedHashMapExample();
        lhme.example();

        // example for TreeMap.
        // TODO: 增加 treeMap example
    }
}

/**
 * HashMap
 *  - 元素皆唯一
 *  - 沒保持當初建立的順序 (order)
 *  - 每個元素皆有 key, value
 *  - 允許 null key, null value.
 * 
 * Reference:
 *  - https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
 * 
 */
class HashMapExample {
    void example() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "george");
        map.put(101, "may");
        map.put(102, "JJ");

        System.out.println("content: " + map);
        System.out.println("# of element: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println("Contain 101: " + map.containsKey(100));

        map.remove(102);
        System.out.println("content: " + map);

        System.out.println(map.get(100));
        System.out.println(map.get(102));

        map.clear();
        System.out.println("content: " + map);
    }
}

/**
 * LinkedHashMap
 *  - 元素皆唯一
 *  - 可保持當初建立的順序 (order)
 *  - 每個元素皆有 key, value
 *  - 允許 null key, null value.
 * 
 * Reference:
 *  - https://beginnersbook.com/2013/12/linkedhashmap-in-java/
 */
class LinkedHashMapExample {
    void example() {
        var map = new LinkedHashMap<String, String>();
        map.put("kaohsiung", "高雄");
        map.put("taipei", "台北");
        map.put("tainan", "台南");

        System.out.println(map.get("kaohsiung"));
        //! 似乎沒有 map.getKey(), map.getValue()
    }
}

/**
 * TreeMap
 *  - 皆為唯一
 *  - 由大到小排序
 *  - 不允許空的key, 但允許空的value.
 * 
 * Reference:
 *  - https://beginnersbook.com/2013/12/treemap-in-java-with-example/
 */
class TreeMapExample {
    void example() {
        //! 似乎 import 會有問題!
    }
}