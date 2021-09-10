package example.InnerExample;

/**
 * Inner class
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1376414781669409
 */
public class Outer {
    private String name;

    public Outer(String name) {
        this.name = name;
    }

    /**
     * Inner class.
     */ 
    public class Inner {
        public void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
        
    }
}

/**
 * FirstClass and InnerFirstClass.
 */
class FirstClass {
    //! 使用 inner class 有什麼好處或作用？
    // 可以輕鬆使用外部成員
    public class InnerFirstClass {
        public void callInnerFirst() {
            System.out.println("call InnerFirst function...");
        }
    }
}

/**
 * SecondClass and InnerSecondClass.
 */
class SecondClass {    
    class InnerSecondClass {
        public void callInnerSecond() {
            System.out.println("call InnerSecond function...");
        }
    }
}