package example.JavaCollectionExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // sample();

        sampleHashmap();
    }

    public static void sampleHashmap() {
        Map<Integer, String> s = new HashMap<>();
        s.put(1, "george");
        s.put(2, "Haha");
        s.put(3, "JJ");
        s.put(4, "PP");
        s.put(1, "george"); // 元素皆唯一

        // System.out.println(Student);
        // Student.remove(2);
        // System.out.println(Student);
        // Student.clear();
        // System.out.println(Student);

        s.size(); // calculate size
        for (Integer i : s.keySet()) {
            System.out.println("key: " + i + "; value: " + s.get(i));
        }
    }

    public static void sample() {
        Map<String, Integer> table = new Hashtable<>();

        table.put("george", 38);
        table.put("amy", 22);
        table.put("QQ", 9);
        table.put("peter", 52);

        table.forEach((k, v) -> {
            v = v+1;
            table.replace(k, v);
            System.out.println("key: " + k + "; value: " + v);
        });
    }
}