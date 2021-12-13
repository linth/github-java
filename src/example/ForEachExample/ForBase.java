package example.ForEachExample;

import java.util.ArrayList;
import java.util.List;

public class ForBase {
    public static void main(String[] args) {
        baseForLoop();
        forEachExample();
    }

    public static List<String> generateData() {
        List<String> students = new ArrayList<>();

        students.add("george");
        students.add("peter");
        students.add("may");
        students.add("john");
        students.add("JJ");
        students.add("GG");

        return students;
    }

    public static void baseForLoop() {
        List<String> students = generateData(); 

        // list 裡面是放 string
        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i));
        }

        // list 裡面是放 object
        for (int i=0; i<students.size(); i++) {
            // TODO: build a example to demo object.
        }
    }

    public static void forEachExample() {
        // using foreach.
        List<String> students = generateData(); 

        students.forEach(s -> {
            System.out.println(s);
        });
    }

    // TODO: add another examples.
}
