package example.CallBackExample;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static String name = "george";
    private static Integer age;

    public static void main(String[] args) {
        // System.out.println(aa());

        // System.out.println("name: " + name);

        String word = "Hello world.";

        String name = "George, Amy, KK, Box";

        System.out.println(word.replace(" ", ","));

        String[] n = name.replace(",", "").split(" ");

        List<String> n2 = new ArrayList<>();

        for (String i : n) {
            System.out.println(i);
            n2.add(i);
        }

        for (int i=0; i<n2.size(); i++) {
            System.out.println(n2.get(i));
        }
    }

    public static int aa() {
        // System.out.println("3");
        System.out.println(bb());
        return 2;
    }

    public static int bb() {
        System.out.println("2");
        return 3;
    }
}
