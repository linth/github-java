package example.ClassExample;

/**
 * 使用super()範例
 * 
 * Animal class 已經被定義在 InheritanceInterface 裡面。
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
        Humanity humanity = new Humanity("Peter", 77, 180, 56.1);
        System.out.println("name: " + humanity.getName() + "; age: " + humanity.getAge() + "; height: " + humanity.getHeight() + "; weight: " + humanity.getWeight());
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

    Humanity(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }

    Humanity(String name, int age) {
        super(name, age);
        System.out.println("create Humanity constructor.");
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

