package class_ex;

/**
 * Polymorphism (多型) 範例
 * 
 * 動態繫結 (Dynamic Binding) 更讓你能夠在執行期以同一介面的多個物件交互替換, 
 * 這種替換性質就叫做多型 (Polymorphism)
 * 
 * Reference:
 *  - https://nwpie.blogspot.com/2017/05/3-class-interface-abstract.html 
 */
public class PolymorphismExample {
    public static void main(String[] args) {
         Animal2 animal2 = new Animal2();
         animal2.sound();

         Pig pig = new Pig();
         pig.sound();

         Dog dog = new Dog();
         dog.sound();
    }
}

class Animal2 {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}


class Pig extends Animal2 {

    @Override
    public void sound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal2 {

    @Override
    public void sound() {
        System.out.println("The dog says: bow wow");
    }
}