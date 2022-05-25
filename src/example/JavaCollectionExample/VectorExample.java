package example.JavaCollectionExample;

import java.util.Vector;

public class VectorExample {
    
    public static void main(String[] args) {
        vectorEx();

        vectorStringEx();
    }

    public static void vectorEx() {
        // size of vector.
        int n = 5;

        Vector<Integer> v = new Vector<>();

        for (int i=0; i<n; i++) {
            v.add(i);
        }

        System.out.println(v + "; size: " + v.size());

        v.remove(3);
        System.out.println(v);
    }

    public static void vectorStringEx() {
        Vector<String> v = new Vector<>();

        String[] a = {"george", "mary", "JJ", "Haha"};
        for (int i=0; i<a.length; i++) {
            v.add(a[i]);
        }

        v.forEach(s -> {
            System.out.println(s);
        });
    }
}
