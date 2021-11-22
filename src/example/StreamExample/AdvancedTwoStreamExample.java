package example.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 兩個以上的 stream 進行交集、聯集、差集範例
 * 
 * Reference:
 *  - https://www.gushiciku.cn/pl/pjFy/zh-tw
 */
public class AdvancedTwoStreamExample {
    public static void main(String[] args) {
        // interaction example.
        interactionExample();
        interactionExample2();

        // union example.
        // unionExample();

        // subtraction example.
    }

    public static void interactionExample() {
        // * interaction example.
        List<String> list1 = data();
        List<String> list2 = data2();

        List<String> result = interaction(list1, list2);

        Optional<List<String>> finalResult = Optional.ofNullable(result);
        // List<String> a = new ArrayList<>();
        // finalResult.orElse(a); 
        System.out.println(finalResult);
    }

    public static void interactionExample2() {
        // * interaction 2 example.
        // TODO: 當如果資料結構比較複雜的時候，是否能依舊使用這些function.
        Vendor vendor1 = data3();
        Vendor vendor2 = data4();

        System.out.println(vendor1);
        System.out.println(vendor2);

        List<Device> list1 = new ArrayList<>();
        List<Device> list2 = new ArrayList<>();

        System.out.println("==========vendor1=============");
        vendor1.getSn()
            .iterator()
            .forEachRemaining(s -> {
                System.out.println(s.sn);
                list1.add(s);
            });
        System.out.println("===========vendor2============");
        vendor2.getSn()
            .iterator()
            .forEachRemaining(s -> {
                System.out.println(s.sn);
                list2.add(s);
            });
        
        System.out.println("===========result============");
        List<Device> res = list1.stream()
            .filter(s -> list2.contains(s))
            .collect(Collectors.toList());
        
        res.stream()
            .forEach(s -> {
                System.out.println(s);
            });
    }

    // // TODO: finish union example.
    // public static void unionExample() {
    //     // * union example.
    //     List<String> list1 = data();
    //     List<String> list2 = data2();
        
    //     try {
    //         List<String> result = union(list1, list2);
    //         // result.forEach(System.out::println);
    //     } catch (Exception e) {
    //         System.out.println(e.toString());
    //         e.printStackTrace();
    //     }
    // }

    // TODO: finish subtraction example.
    // public static void subtractionExample() {
    //     // * union example.
    //     List<String> list1 = data();
    //     List<String> list2 = data2();
        
    //     List<String> result = subtraction(list1, list2);
    // }

    public static List<String> data() {
        // * generate a list of data.
        return Arrays.asList("Java", "JavaScript", "python", "PHP", "C#");
    }

    public static List<String> data2() {
        // * generate a list of data2.
        return Arrays.asList("Java", "JavaScript", "C#", "Golang", "Swift");
    }

    public static Vendor data3() {
        // generate a list.
        ArrayList<Device> list = new ArrayList<>();
        Vendor.generateDeviceList()
            .forEach(s -> {
                // System.out.println(s.sn);
                list.add(s);
            });

        // generate a hashmap.
        HashMap<String, List<Device>> map = new HashMap<>();
        map.put("sn", list);

        // generate a vendor.
        Vendor vendor = new Vendor("vendor1", map);
        System.out.println(vendor.name);        
        for (String key : vendor.snInfo.keySet()) {
            System.out.println(key);
        }
        
        return vendor;
    }

    public static Vendor data4() {
        // generate a list.
        ArrayList<Device> list = new ArrayList<>();
        Vendor.generateDeviceList2()
            .forEach(s -> {
                // System.out.println(s.sn);
                list.add(s);
            });

        // generate a hashmap.
        HashMap<String, List<Device>> map = new HashMap<>();
        map.put("sn", list);

        // generate a vendor.
        Vendor vendor = new Vendor("vendor2", map);
        System.out.println(vendor.name);        
        for (String key : vendor.snInfo.keySet()) {
            System.out.println(key);
        }
        
        return vendor;
    }

    public static List<String> interaction(List<String> firstList, List<String> secondList) {
        // * find the interaction of two Lists. (交集)
        // List<String> result = new ArrayList<>();

        // origin way.
        // return firstList.stream()
        //     .filter(s -> secondList.contains(s))
        //     .collect(Collectors.toList());

        // another clean way.
        return firstList.stream()
            .filter(secondList::contains)
            .collect(Collectors.toList());
    }

    // public static List<String> union(List<String> firstList, List<String> secondList) throws Exception {
    //     // * find the union of two Lists. (聯集: 包括重複)
    //     List<String> result = new ArrayList<>();
    //     return firstList;
    // }

    // public static List<String> unionWithoutDuplicated() {
    // }

    public static List<String> subtraction(List<String> firstList, List<String> secondList) {
        // * find the subtraction of two Lists.
        List<String> list = new ArrayList<>();
        return list;
    }
}

class Vendor {
    public final String name;
    public final Map<String, List<Device>> snInfo;

    // String obj3 = {
    //     "name": "vendor1"
    //     "snInfo": {
    //         "sn": [
    //             "ZG02000010",
    //             "ZG02000020"
    //         ]
    //     }
    // }

    Vendor(String name, Map<String, List<Device>> map) {
        this.name = name;
        this.snInfo = map;
    }

    public static List<Device> generateDeviceList() {
        List<Device> list = new ArrayList<>();
        
        list.add(new Device("ZG02000010"));
        list.add(new Device("ZG02000020"));
        return list;
    }

    public static List<Device> generateDeviceList2() {
        List<Device> list = new ArrayList<>();
        
        list.add(new Device("ZG02000010"));
        list.add(new Device("ZG02000030"));
        list.add(new Device("ZG02000050"));
        list.add(new Device("ZG02000060"));
        return list;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Device>> getSnInfo() {
        return snInfo;
    }

    public List<Device> getSn() {
        return snInfo.get("sn");
    }
}

class Device {
    public String sn;

    Device(String sn) {
        this.sn = sn;
    }
}