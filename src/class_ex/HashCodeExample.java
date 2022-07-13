package class_ex;

/**
 * Hashcode: 主要是確認 object 是否為相同，需要搭配 equals。
 * 
 * Reference:
 *  - https://www.gushiciku.cn/pl/gkK1/zh-tw
 */
public class HashCodeExample {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;

        System.out.println("hash code of a: " + a.hashCode());
        System.out.println("hash code of b: " + b.hashCode());
    }
}
