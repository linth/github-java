package designPattern.Factory;

import designPattern.Factory.food.Food;

/**
 * 工廠模式 (Factory design pattern)
 * 
 * Reference:
 *  - https://anexinet.com/blog/strategy-and-factory-patterns-in-a-spring-boot-application-part-i/
 *  - https://azeynalli1990.medium.com/5-software-design-patterns-implemented-in-spring-88356dac738d
 *  - https://www.javadoop.com/post/design-pattern
 */
public class Factory {
    public static void main(String[] args) {

        System.out.println("executing ChineseFoodFactory().");
        ChineseFoodFactory chineseFoodFactory = new ChineseFoodFactory();
        chineseFoodFactory.makeFood("A");
        chineseFoodFactory.makeFood("B");

        System.out.println("executing AmericanFoodFactory().");
        AmericanFoodFactory americanFoodFactory = new AmericanFoodFactory();
        americanFoodFactory.makeFood("A");
        americanFoodFactory.makeFood("B");
    }
}

interface FoodFactory {
    Food makeFood(String name);
}

class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        } else if (name.equals("B")) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}

class AmericanFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}

class ChineseFoodA extends Food {

}

class ChineseFoodB extends Food {

}

class AmericanFoodA extends Food {

}

class AmericanFoodB extends Food {

}
