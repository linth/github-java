package example.WrapperClassExample;

/**
 * Autoboxing and Unboxing example.
 *  - 整數轉成整數物件，或是整數物件轉成整數
 *  - 例如：整數 a 轉成 2進位字串輸出
 */

public class AutoBoxing {
    
    public static void main(String[] args) {
        int x = 5;
        //! autoboxing 自動封箱
        Integer xObj = new Integer(x); //! 似乎在Java 9 就被 deprecated 
        Integer yObj = new Integer(10);
        Boolean bo = new Boolean("George");
        Character ch = 'a';

        System.out.println("xObj: " + xObj.getClass());
        System.out.println("yObj: " + yObj.getClass());
        System.out.println("The content of bo: '" + bo + "'; bo: " + bo.getClass());
        System.out.println("ch: " + ch.getClass());
    }
}


class Unboxing {
    
    public void unboxing_example() {
        Integer y = 10;
        y = y + 20;
        System.out.println("y: " + y);
    }
}