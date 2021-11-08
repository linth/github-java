package example.TmpExample;

/**
 * if-else 縮寫範例 (三元運算子)
 * 
 * Reference:
 *  - https://matthung0807.blogspot.com/2019/05/java-ternary-operator.html
 */
public class ifElseExample {
    public static void main(String[] args) {
        
    }

    public static int traditionStyle(int a, int b) {
        // ! tradition style.
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static int newStyle(int a, int b) {
        // ! new style.
        // 表達式1 ? 表達式2 : 表達式3;
        int min = (a < b) ? a : b;
        return min;
    }
}
