package example.JavaCollectionExample.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndArrayListExample {
    
    public static void main(String[] args) {
        ArrayExample();

        useArrayList();
    }

    public static void ArrayExample() {
        // array 要 sorting需要使用 Arrays.sort即可
        int[] myArray = {21, 102, 33, 4, 45};

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static List<Integer> useArrayList() {
        // arraylist要 sorting需要使用 collections
        List<Integer> l = new ArrayList<>();
        l.add(21);
        l.add(102);
        l.add(33);
        l.add(4);
        l.add(45);
        
        Collections.sort(l);

        l.forEach(s -> {
            System.out.println(s);
        });

        return l;
    }
}
