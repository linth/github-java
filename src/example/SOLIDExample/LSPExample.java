package example.SOLIDExample;

/**
 * 里氏替換原則 (Liskov substitution principle)
 *  - 子型別要完全實作父型別的方法
 *  - 子型別要能完全替代父型別，且不能出現錯誤或異常
 * 
 * 里氏替換原則優點
 *  - 增加程式碼的健全度，在使用不同的子類別的時候，可以大幅度的保證彼此之間的相容性。只要父類別可以使用，基本上子類別也可以使用
 *  - 子類別如果要新增功能，獨立在父類別的功能之外，才不會在搬移到其他子類別的時候發生奇怪的問題，也可以將功能切分乾淨，區分職責
 * 
 * Reference:
 *  - https://www.edureka.co/blog/solid-principles-in-java/
 *  - https://ithelp.ithome.com.tw/articles/10248355
 */
public class LSPExample {
    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();

        lsp.calculateArea(new RectangleV2());
        lsp.calculateArea(new Square());
    }
}

/**
 * 建立RectangleV2 class，以及建立 Square 並繼承 RectangleV2
 * 
 * 也可以參考 OCP example.
 */
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