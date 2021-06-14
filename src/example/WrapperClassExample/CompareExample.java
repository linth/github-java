package example.WrapperClassExample;

/**
 * equals(), compareTo()
 */

class ObjectCompared {
    public boolean equals(Object obj1, Object obj2) {
        return obj1.equals(obj2);
    }
}

public class CompareExample {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer c = 10;
        Boolean d = false;
        Boolean e = true;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(d.equals(e));

        // equals
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        ObjectCompared oc = new ObjectCompared();
        System.out.println("Object example: " + oc.equals(o1, o2));
        System.out.println("Object example: " + oc.equals(o1, o3));

        // compare, 物件小於參數 -1, 等於 0, 大於 1
        System.out.println(a.compareTo(b)); // -1
        System.out.println(a.compareTo(c)); // 0
        System.out.println(b.compareTo(c)); // 1
    }
}
