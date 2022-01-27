package example.ForEachExample;

import java.util.ArrayList;
import java.util.List;

/**
 * for loop
 * 
 * keyword:
 *  - for loop
 *  - a++, ++a
 * 
 * Reference:
 *  - https://ithelp.ithome.com.tw/articles/10283750
 */
public class ForBase {
    public static void main(String[] args) {
        baseForLoop();
        forEachExample();

        aPlusPlusOrPlusPlusA();
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
        // * basic for loop.
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

    public static void aPlusPlusOrPlusPlusA () {
        // * 區隔 a++ 和 ++a 差別
        Integer numOne = 1;
        Integer numTwo = 5;

        System.out.println(numOne++); // 1
        System.out.println(++numTwo); // 6
    }

    // TODO: add another examples.
}
