package example.MethodExample;

/**
 * The Call by Value and Call by Referene example.
 * 
 * 若是傳遞某個 object 給 method 時，objects 是以 call by reference 方式來傳遞。
 * 
 * Reference:
 *  - http://brownydev.blogspot.com/2011/06/java-call-by-value-call-by-reference.html
 *  - https://sites.google.com/site/dychen1127/developer-java/java-call-by-reference
 *  - https://sites.google.com/site/dychen1127/developer-java/java-call-by-value
 *  - https://wayne265265.pixnet.net/blog/post/112556555-%E3%80%90%E6%95%99%E5%AD%B8%E3%80%91call-by-value%2C-call-by-address%2C-call-by-referenc
 */
class Data {
    int x; 
    int y;
}

public class ArgumentMethod {
    
    /**
     * Call by value example.
     * @param args
     */
    public static void swap(int x, int y) {
        //! 此範例無法讓資料進行交換
        int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("call swap(), x = %d, y = %d\n", x, y);
    }

    /**
     * Call by reference example.
     * @param args
     */
    public static void swap_cbr(Data data) {
        //! 如果要使用call by reference, 需要傳遞參數為array, class，讓變數進入method後計算一併修改。
        int tmp = data.x;
        data.x = data.y;
        data.y = tmp;
        System.out.printf("call swap_cbr(), x = %d, y = %d\n", data.x, data.y);
    }

    /**
     * Call by address.
     * 
     * @param args
     */
    public static void swap_cba(Data data) {
        
    }

    public static void main(String[] args) {
        Data d = new Data();
        int x = 10;
        int y = 20;
        d.x = 10;
        d.y = 20;
        System.out.printf("before call function, x = %d, y = %d\n", x, y);

        // call by value.
        swap(x, y);

        // call by reference
        swap_cbr(d);

        System.out.printf("after call swap function, x = %d, y = %d\n", x, y);
        System.out.printf("after call swap_cbr function, x = %d, y = %d\n", d.x, d.y);
    }
}
