package example.JavaCollectionExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap, LinkedHashMap, TreeMap
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
    }
}

/**
 * HashMap
 *  - 元素皆唯一
 *  - 沒保持當初建立的順序 (order)
 *  - 每個元素皆有 key, value
 *  - 允許 null key, null value.
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
 */
class TreeMapExample {
    void example() {
        //! 似乎 import 會有問題!
    }
}