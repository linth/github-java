package designPattern.Factory.food;

/**
 * abstract class: Food.
 * 
 * Reference:
 *  - https://www.javadoop.com/post/design-pattern
 */
public abstract class Food implements FoodInterface {
    public void addSpicy(String amount) {
        System.out.println("[Food] call addSpicy(), and the amount is " + amount + ".");
    }

    public void addCondiment(String material) {
        System.out.println("[Food] call addCondiment(), and the material is " + material + ".");
    }
}
