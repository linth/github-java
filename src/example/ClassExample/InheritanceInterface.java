package example.ClassExample;

public class InheritanceInterface {
    public static void main(String[] args) {
        Man man = new Man("George", 180, 75);
        man.showInfo();
        man.getName();
        man.getHeight();
        man.getWeight();

        Women women = new Women("Mary", 166, 44);
        women.showInfo();
        women.getHeight();
        women.getWeight();
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

interface HumanCategory {
    double getHeight();
    double getWeight(); 
}

abstract class Human implements HumanCategory, Animal {
    // ! 修改成多重繼承方式
    String name;
    double height;
    double weight;

    Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }

    public double getHeight() {
        System.out.println("Height: " + height);
        return height;
    }

    public double getWeight() {
        System.out.println("Weight: " + weight);
        return weight;
    }

    public void showInfo() {
        System.out.println(
            "Name: " + this.name + 
            "; Height: " + this.height + 
            "; Weight: " + this.weight);
    }
}

class Man extends Human {
    Man(String name, double height, double weight) {
        super(name, height, weight);
    }
}

class Women extends Human {
    Women(String name, double h, double w) {
        super(name, h, w);
    }
}