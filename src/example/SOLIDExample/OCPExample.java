package example.SOLIDExample;

/**
 * Open Closed Principle
 * 開放封閉原則：對於擴充保持開放，但對於修改則避免。
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
    }
}

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

    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

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