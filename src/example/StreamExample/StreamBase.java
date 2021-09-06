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

        findJChangeBig(list);
        dealWithStream(list);
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
