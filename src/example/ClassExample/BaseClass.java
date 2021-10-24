package example.ClassExample;

/**
 * 三層架構：interface class, abstract class, concrete class.
 * 
 * TODO: add private, protected
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
        System.out.println("Hello by Origin.");
    }
}

class HH extends Origin {
    public void printSelf() {
        System.out.println("HH");
    }

    // ! HH 的 printHello() 已繼承了 Origin
}

class AA extends Origin {
    // concorete class.
    public void printSelf() {
        System.out.println("AA");
    }

    @Override
    public void printHello() {
        System.out.println("Hello by AA.");
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

    // ! BB 的 printHello() 已繼承了 AA
}

/**
 * 覆寫(Override)是指子類別繼承父類別時，改寫父類別原有的方法內容
 */
class CC extends AA {
    // concorete class.
    @Override
    public void printSelf() {
        System.out.println("CC");
    }

    @Override
    public void printHello() {
        System.out.println("Hello by CC.");
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

        HH h = new HH();
        h.printSelf();
        h.printHello();

        showInfo(h);
    }

    public static void showInfo(OriginInterface oi) {
        // ! 統一開啟一個 function: get printSelf() 值
        oi.printSelf();
    }
}

class DD {
    public void printSelf() {
        System.out.println("DD");
    }
}