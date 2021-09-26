package example.ExceptionExample;

/**
 * 如果要使用assert，建議使用Unit test中使用JUnit。
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1264740093521088
 */

public class assertExample {
    public static void main(String[] args) {
        // assert example.
        //! 增加 assert example.
        int x = -1;

        assert x > 0;
        System.out.println(x); // -1
    }
}
