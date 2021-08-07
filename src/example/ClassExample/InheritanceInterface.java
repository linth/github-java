package example.ClassExample;

public class InheritanceInterface {
    public static void main(String[] args) {
        Man man = new Man("george", 180, 75);
        man.showInfo();
        man.getName();
        man.getHeight();
        man.getWeight();

        Man man2 = new Man("peter", 166, 44);
        man2.showInfo();
        man2.getHeight();
        man2.getWeight();
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

    @Override
    public String getName() {
        // 可否改成chain function, 並return this?
        System.out.println("Name: " + name);
        return name;
    }

    @Override
    public double getHeight() {
        System.out.println("Height: " + height);
        return height;
    }

    @Override
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