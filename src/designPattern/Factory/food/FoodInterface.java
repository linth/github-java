package designPattern.Factory.food;

/**
 * 請多琢磨思考 interface class 部分
 *  - interface class 不能 new instance.
 * 
 * Reference:
 *  - https://www.javadoop.com/post/design-pattern
 */
public interface FoodInterface {
    public void addSpicy(String amount);
    public void addCondiment(String material);
}
