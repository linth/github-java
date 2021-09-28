package example.ForEachExample;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Foreach example.
 * 
 * Reference:
 *  - https://beginnersbook.com/2017/10/java-8-foreach/
 *  - https://www.runoob.com/java/java-hashmap.html
 */
public class ForEachSample {
    public static void main(String[] args) {
        // foreach to iterate a Map.
        // MapAndHasMapExample();

        // foreach to iterate a List.
        // ListExample();

        // foreach method to iterate a stream.
        StreamExample();
    }

    public static void MapAndHasMapExample() {
        Map<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(1, "apple");
        hmap.put(2, "orange");
        hmap.put(3, "tiger");
        hmap.put(4, "dog");
        hmap.put(5, "cat");
        hmap.put(6, "cat");

        hmap.forEach((key, value) -> {
            System.out.println("key = " + key + " " + "value = " + value);

            if (value.equals("cat")) {
                System.out.println("got the cat.");
            }

            if (key % 2 == 0) {
                System.out.println("key: " + key + "; value: " + value);
            } 
        });
    }

    public static void ListExample() {
        List<String> fruits = new ArrayList<String>(); 
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear"); 
        fruits.add("Mango");

        fruits.forEach(s -> {
            System.out.println(s);
        });
    }

    public static void StreamExample() {
        List<String> list = new ArrayList<String>();
        list.add("Maggie");
        list.add("Michonne");
        list.add("Rick");
        list.add("Merle");
        list.add("Governor");

        list.stream()
            .filter(f -> f.startsWith("M"))
            .forEach(s -> {
                System.out.println(s);
            });

        // 另一種寫法
        //! System.out::println
        // list.stream()
        //     .filter(f -> f.startsWith("M"))
        //     .forEach(System.out::println);
    }
}
