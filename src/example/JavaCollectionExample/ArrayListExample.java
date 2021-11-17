package example.JavaCollectionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ArrayList + stream 範例
 * 
 * Reference:
 *  - https://www.geeksforgeeks.org/how-to-get-arraylist-from-stream-in-java-8/
 */
public class ArrayListExample<T> {
    public static void main(String[] args) {
        ArrayList<String> list = generateData();

        arrayList2Stream(list)
            .forEach(s -> {
                System.out.println(s);
            });

        ArrayList<String> getWithoutPWordList = filterPWord(list);
        System.out.println(getWithoutPWordList);
    }

    public static ArrayList<String> generateData() {
        // * generate data which is arraylist.
        ArrayList<String> list = new ArrayList<String>();

        list.add("e");
        list.add("haha");
        list.add("Peter");

        return list;
    }

    public static ArrayList<String> filterPWord(ArrayList<String> list) {
        // * converting stream to arraylist.
        List<String> result = list.stream()
            .filter(name -> !name.startsWith("P"))
            .collect(Collectors.toList());
        
        return new ArrayList<String>(result);
    }

    public static List<String> stream2List(ArrayList<String> list) {
        // * converting stream to list.
        return list.stream()
            .collect(Collectors.toList());
    }

    public static Stream<String> arrayList2Stream(ArrayList<String> arrayList) {
        return arrayList.stream();
    }
}
