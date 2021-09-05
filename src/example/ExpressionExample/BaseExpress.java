package example.ExpressionExample;

/**
 * 運算子 operator
 * 運算式 expression
 * 運算元 operand
 */
public class BaseExpress {
    public static void main(String[] args) {
        showHelloWithNTime(10);

        // 無限大 infinite
        double x = 100.0 / 0;
        System.out.println(x);
    }

    public boolean isLarger30(int age) {
        return age > 30 ? true : false;
    }

    public int getSqureArea(int length) {
        return length*length;
    }

    public static void showHelloWithNTime(int n) {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}
