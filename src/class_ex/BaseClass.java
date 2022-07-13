package class_ex;

/**
 * Class 和 Object 物件
 * 
 * 訊息是唯一可令物件執行操作的管道, 操作則是唯一可改變物件內部狀態的管道。
 * 有了這些限制, 物件內部狀態可說是被妥為封裝了起來 (encapsulation) : 
 * 無法接觸及, 無法自外界窺伺。
 * 
 * 
 * TODO: use super().
 * 
 * 你可以抽象化interface, abstract, or concrete class.
 * 
 * References:
 *  - https://pdai.tech/md/java/basic/java-basic-oop.html
 *  - https://nwpie.blogspot.com/2017/05/3-class-interface-abstract.html
 */
interface OriginInterface {
    // interface class.
    static String name = "OriginInterface";

    public void printSelf();

    public void printHello();

    private void printName() {
        System.out.println("name: " + name);
    }
}

abstract class Origin implements OriginInterface {
    // abtstact class.
    public void printHello() {
        System.out.println("Hello by Origin.");
    }
}

class HH extends Origin {
    // concorete class.

    @Override
    public void printSelf() {
        System.out.println("HH");
    }

    // ! HH 的 printHello() 已繼承了 Origin
}

class AA extends Origin {
    // concorete class.

    @Override
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

/**
 * 可使用 final 關鍵字來讓class不允許繼承
 */
final class DD {
    public void printSelf() {
        System.out.println("DD");
    }
}

// ! 會有錯誤，因為 DD 不允許被繼承。
// class EE extends DD {

// }