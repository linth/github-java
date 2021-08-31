package example.SOLIDExample;

/**
 * Open Closed Principle
 *  - 開放封閉原則：對於擴充保持開放，但對於修改則避免。
 *  - 軟體實體應該對擴展開放，對修改關閉
 * 
 * Reference:
 *  - https://www.edureka.co/blog/solid-principles-in-java/
 */
public class OCPExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("area: " + rectangle.calculateArea());
        
        AreaCalculator areaCalculator = new AreaCalculator();
        double res = areaCalculator.calcuateShapeArea(rectangle);
        System.out.println("res: " + res);

        Circle circle = new Circle(10);
        double res2 = areaCalculator.calcuateShapeArea(circle);
        // 使用AreaCalculator class來計算面積
        System.out.println("res2 using areaCalculator: " + res2);
        // 使用Circle class內部函式來計算面積
        System.out.println("res2 using circle: " + circle.calculateArea());
    }
}

/**
 * 使用interface class來定義，由各個class去繼承並實作內容，這樣寫法會產生許多class，方便使用者自行呼叫想要的物件。
 * 
 */
interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        // constructor.
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

/**
 * 有時候許多class內部的函數，也可以抽象化出來，利用interface class來當引數帶入。
 */
class AreaCalculator {
    public double calcuateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

/**
 * Generic Example.
 */
class NrConverter {
    
}