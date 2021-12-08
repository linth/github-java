package example.GenericExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Java泛型教學
 * 
 * Reference:
 *  - https://tw511.com/20/209/8135.html
 */
public class GenericBase {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(101));
        integerList.add(Integer.valueOf(111));

        List<String> stringList = new ArrayList<String>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("Javascript");

        System.out.printf("Integer Value :%d\n", integerList.get(0));
        System.out.printf("String Value :%s\n", stringList.get(0));

        for (Integer data : integerList) {
            System.out.printf("Integer Value :%d\n", data);
        }

        Iterator<String> stringIterator = stringList.iterator();

        while (stringIterator.hasNext()) {
            System.out.printf("String Value :%s\n", stringIterator.next());
        }
    }
}
