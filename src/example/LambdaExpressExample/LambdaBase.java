package example.LambdaExpressExample;

import java.util.List;
import java.util.ArrayList;

/**
 * Lambda 表達式
 * 
 * 
 * 
 * 
 * Reference 
 *  - https://mrbird.cc/java8lambda1.html -
 * https://pdai.tech/md/java/java8/java8-stream.html
 *  - https://blog.tonycube.com/2015/10/java-java8-2-lambda-expression.html
 */
public class LambdaBase {
    public static void main(String[] args) {
        copyAndPrint();
    }

    public static void copyAndPrint() {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list.add(1);
        list.add(133);
        list.add(4);

        list.forEach(list2::add);
        list2.forEach(System.out::println);
        // ! 不要在Lambda內修改定義在域外的變數
        // list2.forEach((e -> { e++; }));
    }

    // TODO: stream, parallelStream
}
