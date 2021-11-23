package example.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Generic + Stream 範例
 * 
 * Reference
 *  - https://www.itread01.com/content/1545383650.html
 */
public class GenericAndStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        System.out.println("list 交集" + MathUtils.getIntersection(list, list1));
    }
}

class MathUtils {

    MathUtils() {
        
    }

    /**
     * 交集
     * 
     * @param <T>
     * @param n
     * @param m
     * @return
     */
    public static <T> List<T> getIntersection(List<T> n, List<T> m) {
        Set<T> setN = new HashSet<>(n);
        Set<T> setM = new HashSet<>(m);
        setN.retainAll(setM);
        return new ArrayList<>(setN);
    }

    // TODO: do more examples.
}