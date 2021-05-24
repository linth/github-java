package example.InnerExample;

/**
 * Inner class, Anonymous class.
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1376414781669409
 */
public class inner {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested"); // instance an outer.
        Outer.Inner inner = outer.new Inner(); // instance an inner.
        inner.hello();
    }
}
