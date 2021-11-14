package example.ClassExample;

/**
 * 使用super()範例
 * 
 * Animal class 已經被定義在 InheritanceInterface 裡面。
 */
public class SuperExample {
    public static void main(String[] args) {
        Humanity humanity = new Humanity("Peter");
        System.out.println(humanity.getName());
    }
}

class Ape implements Animal {
    protected String name;

    Ape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Humanity extends Ape {

    Humanity(String name) {
        super(name);
    }
}

