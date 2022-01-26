package example.ClassExample.SuperEx;

import example.ClassExample.interfaceObject.Animal;

/**
 * 使用super()範例
 * 
 * Animal class 已經被定義在 InheritanceInterface 裡面。
 *  - 拆出來使用 baseClass, interfaceObject 裡面定義 interface, abstract, class.
 * 
 * Reference:
 *  - 
 */
public class SuperExample {
    public static void main(String[] args) {
        // parent class.
        Ape ape = new Ape("George", 18);
        System.out.println("name: " + ape.getName() + "; age: " + ape.getAge());

        // child class.
        Humanity humanity = new Humanity("Peter", 77, "F0001", 180, 56.1);
        System.out.println("name: " + humanity.getName() + "; age: " + humanity.getAge() + "; student ID: " + humanity.getStudentId() + "; height: " + humanity.getHeight() + "; weight: " + humanity.getWeight());
    }
}

class Ape implements Animal {
    protected String name;
    protected int age;

    Ape(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("create Ape constructor.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Humanity extends Ape {
    private String studentId;
    private double height;
    private double weight;

    Humanity(String name, int age, String studentId, double height, double weight) {
        super(name, age);
        this.studentId = studentId;
        this.height = height;
        this.weight = weight;
    }

    Humanity(String name, int age) {
        super(name, age);
        System.out.println("create Humanity constructor.");
    }

    public String getStudentId() {
        return studentId;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

