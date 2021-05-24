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