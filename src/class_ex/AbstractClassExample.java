package class_ex;

/**
 * abstract class 範例
 * 
 * Reference
 *  - https://matthung0807.blogspot.com/2020/04/java-abstract-class-interface-difference.html
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(3);

        //! abstract class不能被實體化
        // Shape shape = new Shape();

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());

        rectangle.draw();
        circle.draw();

        rectangle.printClassName();
        circle.printClassName();
    }
}

/**
 * interface Figure
 */
interface Figure {
    public abstract void draw();
    public abstract double area();
    public void printClassName();
}

/**
 * Abstract class
 */
abstract class Shape implements Figure {
    // public double area() {
    //     return 0;
    // };

    // abstract method 抽象方法
    @Override
    public void printClassName() {
        System.out.println("Shape class.");
    }
}

/**
 * Rectangle 繼承 Shape，即為形成 IS-A
 */
class Rectangle extends Shape {
    protected double height;
    protected double width;

    Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
    }
    
    @Override
    public double area() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("The rectangle is drawing.");
    }

    @Override
    public void printClassName() {
        System.out.println("Rectangle class");
    }
}

class Circle extends Shape {
    protected double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public void draw() {
        System.out.println("The circle is drawing.");
    }

    @Override
    public void printClassName() {
        System.out.println("Circle class.");
    }
}