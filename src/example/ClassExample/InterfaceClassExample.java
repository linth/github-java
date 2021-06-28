package example.ClassExample;

public class InterfaceClassExample {
    public static void main(String[] args) {
        Fly bird = new Bird("angry bird"); // upcasting
        bird.flying();
        bird.getName();

        Fly airplane = new Airplane("Boeing 747 airplane"); // upcasting
        airplane.flying();
        airplane.getName();
    }
}

interface Fly {
    void getName();
    void flying();
}

class Bird implements Fly {
    private String name;

    Bird(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("I am a " + name + ".");
    }

    public void flying() {
        System.out.println("Bird is flying...");
    }
}

class Airplane implements Fly {
    private String name;

    Airplane(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("I am a " + name + ".");
    }

    public void flying() {
        System.out.println("Airplane is flying...");
    }
}

/**
 * default 擴充interface新功能，如果不使用 default，interface不允許方法內有實作內容。
 */
interface Vehicle {
    String getBrand();
    String run();

    default String alarmOn() {
        return "turn on alarm.";
    }

    default String alarmOff() {
        return "turn off alarm.";
    }

    static int speedUp(int speed) {
        return speed + 50;
    }
}

class Car implements Vehicle {
    private String brand;

    Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String run() {
        return "driving car safely.";
    }
}
