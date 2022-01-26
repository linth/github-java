package example.ClassExample;

import example.ClassExample.baseClass.Man;
import example.ClassExample.baseClass.Women;

public class InheritanceInterface {
    public static void main(String[] args) {
        // ! 注意 constructor 需要使用 public
        Man man = new Man("George", 180, 75);
        man.showInfo();
        man.getName();
        man.getHeight();
        man.getWeight();

        Women women = new Women("Mary", 166, 44);
        women.showInfo();
        women.getHeight();
        women.getWeight();
    }
}
