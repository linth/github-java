package example.UtilExample;

/**
 * String indexOf example.
 * 
 * Reference:
 *  - https://www.runoob.com/java/java-string-indexof.html
 */
public class StringIndexOfExample {
    public static void main(String[] args) {
        findString();
    }

    public static void findString() {
        String string = "aaa456ac"; 

        System.out.println(string.indexOf("b")); // -1 不存在
        System.out.println(string.indexOf("a")); // 0
        System.out.println(string.indexOf("a", 3)); // 6

        // TODO: need to check.
        String string2 = "a-97,b-98,c-99";
        System.out.println(string.indexOf(99)); // 7
        System.out.println(string.indexOf("c")); // 7
    }

}
