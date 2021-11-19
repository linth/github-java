package example.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        // union example.

        // subtraction example.

        // TODO: 當如果資料結構比較複雜的時候，是否能依舊使用這些function.
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

    // TODO: finish union example.
    // public static void unionExample() {
    //     // * union example.
    //     List<String> list1 = data();
    //     List<String> list2 = data2();
        
    //     List<String> result = union(list1, list2);
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

    public static List<String> interaction(List<String> firstList, List<String> secondList) {
        // * find the interaction of two Lists.
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

    public static List<String> union(List<String> firstList, List<String> secondList) {
        // * find the union of two Lists.
        List<String> list = new ArrayList<>();
        return list;
    }

    public static List<String> subtraction(List<String> firstList, List<String> secondList) {
        // * find the subtraction of two Lists.
        List<String> list = new ArrayList<>();
        return list;
    }
}
