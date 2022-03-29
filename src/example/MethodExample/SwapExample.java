package example.MethodExample;

/**
 * Swap觀念
 * 
 * Reference:
 *  - https://java.4-x.tw/java-07/java-swap
 * 
 */
public class SwapExample {
    public static void main(String[] args) {
        swap(2, 3);

        Data data = new Data();
        data.x = 11;
        data.y = 22;
        swap(data);
    }
    
    /**
     * Call by value example.
     * 
     * @param a
     * @param b
     */
    private static void swap(Integer a, Integer b) {
        // ! main裡面的變數a和b，並不是swap方法裡面的a和b。也就是說swap方法的a和b只是main方法裡面a和b的複製品。
        // TODO: 是否有抓取變數的位址？
        System.out.println("before result:");
        System.out.println("a: " + a + "; b: " + b);

        Integer temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("after result:");
        System.out.println("a: " + a + "; b: " + b);
    }

    /**
     * Call by reference example.
     * 
     * @param Data
     */
    public static void swap(Data data) {
        System.out.println("before result:");
        System.out.println("x: " + data.x+ "; y: " + data.y);

        Integer temp;
        temp = data.x;
        data.x = data.y;
        data.y = temp;

        System.out.println("after result:");
        System.out.println("x: " + data.x + "; y: " + data.y);
    }
}
