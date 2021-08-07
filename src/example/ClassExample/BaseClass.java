package example.ClassExample;

/**
 * 三層架構：interface class, abstract class, concrete class.
 */
interface OriginInterface {
    // interface class.
    public void printSelf();

    public void printHello();
}

abstract class Origin {
    // abtstact class.
    public void printHello() {
        System.out.println("Hello");
    }
}

class AA extends Origin {
    // concorete class.
    public void printSelf() {
        System.out.println("AA");
    }

    public void printHello() {
        System.out.println("Hello");
    }
}

class BB extends AA {
    // concorete class.
    @Override
    public void printSelf() {
        System.out.println("BB");
    }
}

/**
 * 覆寫(Override)是指子類別繼承父類別時，改寫父類別原有的方法內容
 */
class CC extends AA {
    // concorete class.
    @Override
    public void printSelf() {
        System.out.println("I re-define a new print self function.");
    }

    @Override
    public void printHello() {
        System.out.println("I re-define a new print hello function.");
    }
}

public class BaseClass {
    public static void main(String[] args) {
        // B b = new B();
        // b.printA();
        AA a = new AA();
        a.printSelf();
        a.printHello();

        BB b = new BB();
        b.printSelf();
        b.printHello();

        CC c = new CC();
        c.printSelf();
        c.printHello();
    }
}
