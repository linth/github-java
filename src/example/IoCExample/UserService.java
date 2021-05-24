package example.IoCExample;

/**
 * service layer for getting a fruit.
 * 
 */
public class UserService {
    private Fruit fruit;

    public void setFruit(Fruit f) {
        this.fruit = f;
    }

    public void getFruit() {
        this.fruit.get();
    }
}
