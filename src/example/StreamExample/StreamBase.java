package example.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reference
 *  - https://mrbird.cc/java8stream1.html
 */
public class StreamBase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "python", "PHP", "C#", "Golang", "Swift");
        List<Integer> num = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        findJChangeBig(list);
        dealWithStream(list);

        StreamTask streamTask = new StreamTask();
        streamTask.filterShapAndShow(list);
        streamTask.distinctEven(num);
    }

    // 傳統作法使用for-loop一個一個處理
    public static void findJChangeBig(List<String> list) {
        List<String> filterList = new ArrayList<>();

        for (String str : list) {
            if (str.startsWith("J")) {
                filterList.add(str.toUpperCase());
            }
        }

        for (String str : filterList) {
            System.out.println(str);
        }
    }

    // 使用stream來解決問題
    public static void dealWithStream(List<String> list) {
        list.stream()
            .filter(s -> s.startsWith("J"))
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}

class StreamTask {
    public void filterShapAndShow(List<String> list) {
        list.stream()
            .filter(s -> s.contains("#"))
            .forEach(System.out::println);
    }

    public void distinctEven(List<Integer> num) {
        num.stream()
            .filter(i -> i % 2 == 0)
            .distinct()
            .forEach(i -> System.out.println(i));
    }
}
