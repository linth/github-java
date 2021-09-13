package example.ClassExample;

/**
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
    }
}

/**
 * Abstract class
 */
abstract class Shape {
    // public double area() {
    //     return 0;
    // };

    // abstract method 抽象方法
    public abstract void draw();
    public abstract double area();
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

    public double area() {
        return height * width;
    }

    public void draw() {
        System.out.println("The rectangle is drawing.");
    }
}

class Circle extends Shape {
    protected double r;

    Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public void draw() {
        System.out.println("The circle is drawing.");
    }
}