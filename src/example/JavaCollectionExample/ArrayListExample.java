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
public class ArrayListExample {
    public static void main(String[] args) {
        // example();

        example2();
    }

    public static void example() {
        // using string element and put into the arraylist.
        ArrayList<String> list = generateData();

        arrayList2Stream(list)
            .forEach(s -> {
                System.out.println(s);
            });

        ArrayList<String> getWithoutPWordList = filterPWord(list);
        System.out.println(getWithoutPWordList);
    }

    public static void example2() {
        // * using object element and put into the arraylist.
        ArrayList<Device> list = generateObjectData();
        ArrayList<Device> list2 = generateObjectData2();

        // TODO: two-for-loop function.
        list.forEach(s -> {
            list2.forEach(s2 -> {
                if (s2.sn == s.sn) {
                    System.out.println(s2.sn);
                }
            });
        });

        // TODO: other way?  map + json + key,value?
        // Could we use stream style to filter them?
        // List<Device> res = list.stream()
        //     .filter((s) -> list2.contains(s))
        //     .collect(Collectors.toList());

        // res.forEach(s -> {
        //     System.out.println(s.sn);
        // });
    }

    public static ArrayList<String> generateData() {
        // * generate data which is arraylist.
        ArrayList<String> list = new ArrayList<String>();

        list.add("e");
        list.add("haha");
        list.add("Peter");
        return list;
    }

    public static ArrayList<Device> generateObjectData() {
        // * generate object data which in arraylist.
        ArrayList<Device> list = new ArrayList<>();

        list.add(new Device("device1", "AZ001"));
        list.add(new Device("device2", "AZ002"));
        list.add(new Device("device3", "AZ003"));
        list.add(new Device("device4", "AZ004"));
        list.add(new Device("device5", "AZ005"));
        return list;
    }

    public static ArrayList<Device> generateObjectData2() {
        // * generate object data which in arraylist.
        ArrayList<Device> list = new ArrayList<>();

        list.add(new Device("device1", "AZ001"));
        list.add(new Device("device3", "AZ003"));
        list.add(new Device("device4", "AZ006"));
        list.add(new Device("device5", "AZ007"));
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

class Device {
    String name;
    String sn;

    Device(String name, String sn) {
        this.name = name;
        this.sn =  sn;
    }
}