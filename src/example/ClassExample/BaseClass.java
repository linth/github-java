package example.ClassExample;

interface OriginInterface {
    public void printSelf();

    public void printHello();
}

abstract class Origin {
    public void printHello() {
        System.out.println("Hello");
    }
}

class AA extends Origin {
    public void printSelf() {
        System.out.println("AA");
    }

    public void printHello() {
        System.out.println("Hello");
    }
}

class BB extends AA {
    public void printSelf() {
        System.out.println("BB");
    }
}

public class BaseClass {
    public static void main(String[] args) {
        // B b = new B();
        // b.printA();
        AA a = new AA();
        a.printSelf();

        BB b = new BB();
        b.printSelf();
    }
}
