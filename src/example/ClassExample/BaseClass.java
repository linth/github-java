package example.ClassExample;

/**
 * 三層架構：interface class, abstract class, concrete class.
 * 
 * 你可以抽象化interface, abstract, or concrete class.
 */
interface OriginInterface {
    // interface class.
    public void printSelf();

    public void printHello();
}

abstract class Origin implements OriginInterface {
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

/**
 * 你可以建立新的class去繼承，不改寫父類別原有方法則。
 */
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
        System.out.println("CC; I re-define a new print self function.");
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

        DD d = new DD();
        // 注意會擋非 OriginInterface & OriginInterface子類別
        // showInfo(d); //! error!!
        showInfo(c);
    }

    public static void showInfo(OriginInterface oi) {
        oi.printSelf();
    }
}

class DD {
    public void printSelf() {
        System.out.println("DD");
    }
}