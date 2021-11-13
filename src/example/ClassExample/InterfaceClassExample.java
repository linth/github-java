package example.ClassExample;

/**
 * 繼承 interface 範例
 * 
 */
public class InterfaceClassExample {
    public static void main(String[] args) {
        // Airplane, Bird example.
        Fly bird = new Bird("angry bird"); // upcasting
        bird.flying();
        bird.getName();

        Fly airplane = new Airplane("Boeing 747 airplane"); // upcasting
        airplane.flying();
        airplane.getName();

        // Car example. (主要理解default, static, private method in the interface class.)
        Car<String> car = new Car<>("Toyota");
        System.out.println("[Step 1] " + car.alarmOn());
        System.out.println("[Step 2] " + car.getBrand());
        System.out.println("[Step 3] " + car.run());
        System.out.println("------------------------------------");

        Car<String> result = car.execute();
        System.out.println("execute time: " + result.getExecuteTime());
    }
}

/**
 * 使用單一 interface 介面來實作
 *  - interface: Fly
 *  - class: Bird, Airplane
 */
interface Fly {
    void getName();
    void flying();
}

class Bird implements Fly {
    private String name;

    Bird(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("I am a " + name + ".");
    }

    @Override
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
 * Interface class 規則與範例
 *  - 介面內 private method 存在時，可提供介面內程式碼重複使用。
 *  - 實作的類別將無法呼叫介面內 private method。
 *  - default method 則可以被實作類別呼叫。
 * 
 * default 擴充interface新功能，如果不使用 default，interface不允許方法內有實作內容。
 */
interface Vehicle<T> {
    String getBrand();
    String run();

    default String alarmOn() {
        method1();
        return "turn on alarm.";
    }

    default String alarmOff() {
        return "turn off alarm.";
    }

    static int speedUp(int speed) {
        return speed + 50;
    }

    /**
     * 此 private method 只能被允許在介面內使用
     */
    private void method1() {
        method3();
        System.out.println("This is a method 1.");
    }

    private void method2() {
        System.out.println("This is a method 2.");
    }

    private void method3() {
        System.out.println("This is a method 3.");
        method2();
    }

    /**
     * TODO: 是否可以使用通用介面來讓class繼承並實作細節
     */
    public Vehicle execute();
}

/**
 * 實作 interface: Vehicle
 */
class Car<T> implements Vehicle {
    private String brand;
    private int execute_time;

    Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String run() {
        return "driving car safely.";
    }

    public Car<T> step4() {
        System.out.println("call step 4.");
        execute_time++;
        return this;
    }

    public Car<T> step5() {
        System.out.println("call step 5.");
        execute_time++;
        return this;
    }

    public Car<T> step6() {
        System.out.println("call step 6.");
        execute_time++;
        return this;
    }

    public Car<T> reverseStep() {
        System.out.println(" call reverse step.");
        execute_time--;
        return this;
    }

    @Override
    public Car<T> execute() {
        execute_time = 0;

        this.step4()
            .reverseStep()
            .step5()
            .step6()
            .reverseStep();

        // System.out.println("execute_time: " + execute_time);
        return this;
    }

    public int getExecuteTime() {
        return this.execute_time;
    }
}
