package example.UtilExample;

/**
 * ValueOf() 方法
 *  - 可以使用 valueOf() 來把 type 轉換成想要的
 * 
 * ! 注意 indexOf(), valueOf() 差異。
 * 
 * Reference:
 *  - https://www.runoob.com/java/java-string-valueof.html
 */
public class ValueOfExample {
    public static void main(String[] args) {
        int2String();
        String2Int();
    }

    public static void int2String() {
        // 把 integer 轉 string
        Integer val = 3;
        String valString = String.valueOf(val);
        
        System.out.println("val: " + val + "; type: " + val.getClass());
        System.out.println("conver to string val: " + valString + "; type: " + valString.getClass());
        System.out.println("----------------------------");
    }

    public static void String2Int() {
        // 把 string 轉 integer
        String age = "30";
        Integer val = Integer.valueOf(age);

        System.out.println("age: " + age + "; type: " + age.getClass());
        System.out.println("conver to Integer val: " + val + "; type: " + val.getClass());
        System.out.println("----------------------------");

        Integer result = val + 3;
        System.out.println("val: " + result + "; type: " + val.getClass());
    }

    // TODO: (Type) 轉換成 (Type).    
}
