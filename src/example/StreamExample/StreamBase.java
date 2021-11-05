package example.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream 範例
 * 
 * 
 * Reference
 *  - https://mrbird.cc/java8stream1.html
 *  - https://blog.tonycube.com/2015/10/java-java8-3-stream.html
 */
public class StreamBase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "python", "PHP", "C#", "Golang", "Swift");
        List<Integer> num = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        findJChangeBig(list);

        List<String> res = dealWithStream(list);
        res.forEach(s -> {
            System.out.println(s);
        });
        
        List<String> res2 = changeUpperCase(res);
        res2.forEach(s2 -> {
            System.out.println(s2);
        });

        // StreamTask streamTask = new StreamTask();
        // streamTask.filterShapAndShow(list);
        // streamTask.distinctEven(num);

        useCollect();
    }

    // ! 傳統作法使用for-loop一個一個處理
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

    // ! 使用stream來解決問題
    public static List<String> dealWithStream(List<String> list) {
        List<String> res = new ArrayList<>();
        list.stream()
            .filter(s -> s.startsWith("J"));
            // .map(String::toUpperCase)
            // .forEach(System.out::println);
        return res;
    }

    public static List<String> changeUpperCase(List<String> list) {
        // ? 可以思考使用 Stream<String> 方式處理
        List<String> res = new ArrayList<>();
        list.stream()
            .map(String::toUpperCase)
            .forEach(res::add);
        return res;
    }

    public static List<String> changeLowerCase(List<String> list) {
        // ? 可以思考使用 Stream<String> 方式處理
        List<String> res = new ArrayList<>();
        list.stream()
            .map(String::toLowerCase)
            .forEach(res::add);
        return res;
    }

    public static void useCollect() {
        // use collect.
        List<String> names = Stream.of("Tom", "Tony", "John").collect(Collectors.toList());
        System.out.println("names: " + names.toString() + "; " + names.getClass().getTypeName());

        List<String> names2 = Arrays.asList("Tom", "Tony", "John");
        System.out.println("names2 " + names2 + "; " + names2.getClass());
    }

    public static void useCollectJoining() {
        // TODO: use collect joining.
        // https://blog.tonycube.com/2015/10/java-java8-3-stream.html
    }

    public void useMap() {
        // TODO: use map.
        // 使用時機: 資料的轉換。當你有一個方法(method)它的用途會將某個輸入資料轉換成另一個資料輸出時，map 可以讓你使用這個方法。 
        // 輸入輸出：T -> R
    }

    public void useFilter() {
        // TODO: use filter.
    }

    public void useFlatMap() {
        // TODO: use flatMap.
    }

    public void useCount() {
        // TODO: use count.
    }

    public void useMaxMin() {
        // TODO: use Max and Min.
    }

    public void useSorted() {
        // TODO: use sorted.
    }

    public void useSequential() {
        // TODO: use sequential.
        // https://blog.tonycube.com/2015/10/java-java8-3-stream.html
        // ! 可以比較 sequential 和 parallel 差異。
    }

    public void useParallel() {
        // TODO: use parallel.
        // https://blog.tonycube.com/2015/10/java-java8-3-stream.html
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
