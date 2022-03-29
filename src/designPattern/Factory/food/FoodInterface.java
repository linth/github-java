package designPattern.Factory.food;

/**
 * 請多琢磨思考 interface class 部分
 *  - interface class 不能 new instance.
 * 
 * Reference:
 *  - https://www.javadoop.com/post/design-pattern
 *  - http://benyi.logdown.com/posts/2018/02/11/oop-what-is-interface
 */
public interface FoodInterface {
    public void addSpicy(String amount);
    public void addCondiment(String material);
}
