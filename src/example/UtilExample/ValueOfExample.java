package example.UtilExample;

/**
 * ValueOf() 方法
 * 
 * ! 注意 indexOf(), valueOf() 差異。
 * 
 * Reference:
 *  - https://www.runoob.com/java/java-string-valueof.html
 */
public class ValueOfExample {
    public static void main(String[] args) {
        int2String();
    }

    public static void int2String() {
        Integer val = 3;
        String valString = String.valueOf(val);
        
        System.out.println("val: " + val + "; type: " + val.getClass());
        System.out.println("conver to string val: " + valString + "; type: " + valString.getClass());
    }
}
