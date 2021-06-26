package example.ClassExample;

/**
 * 擴充 Object class，Object也是Java最高層級的類別。
 * 
 * Object
 *  - String
 *  - Math
 *  - ...
 *  - ...
 *  - Scanner
 */
public class ObjectExample extends Object {
    public static void main(String[] args) {
        // example for using hasCode method.
        hashCodeExample();

        // compare with StringBuilder() and hasCode().
        ObjectExample oe = new ObjectExample();
        oe.useStringBuilder();

        // example for using object and hasCode.
        useObjectAndHashCode();

        // check two objects is the same or not.
        ObjectExample oe2 = new ObjectExample();
        oe2.checkObjectExample();
    }

    public static void hashCodeExample() {
        String msg1 = "台北";
        String msg2 = "台中";
        String msg3 = "台南";
        String msg4 = "高雄";
        String msg5 = "高雄";

        int hc1 = msg1.hashCode();
        int hc2 = msg2.hashCode();
        int hc3 = msg3.hashCode();
        int hc4 = msg4.hashCode();
        int hc5 = msg5.hashCode();

        System.out.println("[hashCodeExample] hc1: " + hc1);
        System.out.println("[hashCodeExample] hc2: " + hc2);
        System.out.println("[hashCodeExample] hc3: " + hc3);
        System.out.println("[hashCodeExample] hc4: " + hc4);
        System.out.println("[hashCodeExample] hc5: " + hc5);
    }

    /**
     * 使用 StringBuilder 和 hashcode
     */
    public void useStringBuilder() {
        String msg1 = "台北";
        StringBuilder msg2 = new StringBuilder("台中");
        String msg3 = "台南";
        StringBuilder msg4 = new StringBuilder("台南");

        int hc1 = msg1.hashCode();
        int hc2 = msg2.hashCode();
        int hc3 = msg3.hashCode();
        int hc4 = msg4.hashCode();

        System.out.println("[useStringBuilder] hc1: " + hc1);
        System.out.println("[useStringBuilder] hc2: " + hc2);
        System.out.println("[useStringBuilder] hc3: " + hc3);
        System.out.println("[useStringBuilder] hc4: " + hc4);
    }

    /**
     * 結合 Object 和 hashCode
     */
    public static void useObjectAndHashCode() {
        NTUStudent ntu1 = new NTUStudent("Peter", 10);
        int hc1 = ntu1.hashCode();

        System.out.println("[useObjectAndHashCode] hc1: " + hc1);
    }

    /**
     * 判斷物件是否相同
     */
    public void checkObjectExample() {
        NTUStudent ntu1 = new NTUStudent("George", 22);
        NTUStudent ntu2 = new NTUStudent("George", 32);
        NTUStudent ntu3 = ntu2;

        System.out.println(ntu1.equals(ntu2)); // false
        System.out.println(ntu1.equals(ntu3)); // false
        System.out.println(ntu2.equals(ntu3)); // true

        System.out.println(ntu1.toString() + "; <" + ntu1.getClass() + ">");
        System.out.println(ntu2.toString() + "; <" + ntu2.getClass() + ">");
        System.out.println(ntu3.toString() + "; <" + ntu3.getClass() + ">");
    }
}

class NTUStudent extends Student {

    NTUStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "; Age: " + this.age;
    }
}