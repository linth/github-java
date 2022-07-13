package class_ex;

public class MultipleInheritanceInterfaceExample {
    public static void main(String[] args) {
        // 多重繼承範例
        //! 需要思考應用情境為何?
        Bug bug = new Bug();
        bug.catRun();
        bug.mouseRun();
        bug.run();

        CatObject co = new CatObject();
        co.catRun();

        bug.eat();
        co.eat();

        //! 多重繼承可能會有成員變數的衝突發生
        Pet pet = new Pet();
        pet.catRun();
        pet.mouseRun();
    }
}


interface B {
    default void BMethod() {
        System.out.println("This is a B interface class.");
    }

    void BmethodOne();
}

interface C {
    default void CMethod() {
        System.out.println("This is a C interface class.");
    }

    void CmethodOne();
}

/**
 * 注意多重繼承時，method 名稱不能重複，會有衝突發生。
 */
class A implements B, C {

    public void BmethodOne() {
        // implement BmethodOne.
    }

    public void CmethodOne() {
        // implement CmethodOne.
    }
}

/**
 * Example 1: 2 interfaces classes and implements 1 interface class.
 * 
 * 使用的時機大概是多個 interface class 之間，有共通的功能可以拉出來一起定義?
 */
interface Cat {
    int age = 5;
    void catRun();
    void eat();
}

interface Mouse {
    int age = 10;
    void mouseRun();
    void eat();
}

interface Run extends Cat, Mouse {
    void run();
}

/**
 * 意味著 Bug class 實體化的物件，擁有三種方法 catRun, mouseRun, run。
 */
class Bug implements Run {
    public void catRun() {
        System.out.println("catRun() is calling...");
    }

    public void mouseRun() {
        System.out.println("mouseRun() is calling...");
    }

    public void run() {
        System.out.println("run() is calling...");
    }

    public void eat() {
        System.out.println("Bug is eating...");
    }
}

/**
 * CatObject class 實體化後的物件，因為只繼承 Cat 並只能實作 catRun。
 */
class CatObject implements Cat {
    public void catRun() {
        System.out.println("catRun() is calling by CatObject class.");
    }

    public void eat() {
        System.out.println("cat is eating...");
    }
}

/**
 * Example 2: 1 interface and extends 2 interface, then 1 concrete class.
 * 
 * 兩個 interface 有相同的命名名稱不會影響。請看上方 eat() 範例。
 */


 /**
  * 多重繼承可能會遭遇到相同成員變數名稱，請看上方變數 age 變數。
  */
 class Pet implements Cat, Mouse {
     public void catRun() {
        // System.out.println("my cat is running and it\'s " + age + " year old."); // Error
        System.out.println("my cat is running and it\'s " + Cat.age + " year old.");
     }

     public void mouseRun() {
        // System.out.println("my cat is running and it\'s " + age + " year old."); // Error
        System.out.println("my cat is running and it\'s " + Mouse.age + " year old.");
     }

     public void eat() {
        System.out.println("Pet is eating...");
     }
 }