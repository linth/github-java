package example.SOLIDExample;

/**
 * Liskov substitution principle
 * 
 * Reference:
 *  - https://www.edureka.co/blog/solid-principles-in-java/
 */
public class LSPExample {
    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();

        lsp.calculateArea(new RectangleV2());
        lsp.calculateArea(new Square());
    }
}

class RectangleV2 {
    private int length;
    private int breadth;

    public int getLength(int length) {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return this.length * this.breadth;
    }
}

class Square extends RectangleV2 {
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }

    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
}

class LSPDemo {
    void calculateArea(RectangleV2 r) {
        r.setBreadth(2);
        r.setLength(3);

        assert r.getArea() == 6 : printError("area", r);
        // assert r.getLength() == 3 : printError("length", r);
        assert r.getBreadth() == 2 : printError("breadth", r);
    }

    private String printError(String errorIdentifer, RectangleV2 r) {
        return "Unexpected value of " + errorIdentifer + " for instance of " + r.getClass().getName();
    }
}