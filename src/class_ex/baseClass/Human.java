package class_ex.baseClass;

import class_ex.interfaceObject.Animal;
import class_ex.interfaceObject.HumanCategory;

public abstract class Human implements Animal, HumanCategory {
    // ! 修改成多重繼承方式
    String name;
    double height;
    double weight;

    Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getName() {
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
