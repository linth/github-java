package example.IoCExample;

/**
 * IoC concept
 * 
 * Reference:
 *  - https://www.zhihu.com/question/53729800
 */

public class User {

    /**
     * Demo for IoC example and concept.
     * @param args
     */
    public static void main(String[] args) {

        // get an orange.
        UserService u1 = new UserService();
        u1.setFruit(new Orange());
        u1.getFruit();
        
        // get an apple.
        UserService u2 = new UserService();
        u2.setFruit(new Apple());
        u2.getFruit();

        // get a banana.
        UserService u3 = new UserService();
        u3.setFruit(new Banana());
        u3.getFruit();
    }
}
