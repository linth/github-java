package example.ClassExample;

public class InheritanceInterface {
    public static void main(String[] args) {
        Man man = new Man("george", 180, 75);
        man.showInfo();
    }
}

/**
 * 介面的繼承規則
 *  - class 繼承 class，使用 extends
 *  - class 繼承 interface，使用 implements
 *  - interface 繼承 interface，使用 extends
 */
interface Animal {
    String getName();
}

interface Human extends Animal {
    double getHeight();
    double getWeight(); 
}

class Man implements Human {
    String name;
    double height;
    double weight;

    Man(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void showInfo() {
        System.out.println(
            "Name: " + this.name + 
            "; Height: " + this.height + 
            "; Weight: " + this.weight);
    }
}