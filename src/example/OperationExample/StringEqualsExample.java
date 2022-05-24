package example.OperationExample;

import designPattern.Template.sevenEleven.main;

public class StringEqualsExample {
    
    public static void main(String[] args) {
        // demo the situation of '=='
        twoEquals();

        // demo the situation of equals().
        equalExample();
    }

    public static void twoEquals() {
        // == 會比較資料的值和位址是否正確
        String s1 = "Hello world.";
        String s2 = "Hello world.";
        System.out.println(s1 == s2); // true.

        String s3 = new String("Hello world.");
        System.out.println(s1 == s3); // false.
    }

    public static void equalExample() {
        // equal 是只比較數值
        String s1 = "Hello world.";
        String s3 = new String("Hello world.");

        System.out.println(s1.equals(s3)); // true.
    }
}
