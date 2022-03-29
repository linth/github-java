package designPattern.Factory;

import designPattern.Factory.food.Food;

public class JapanNoodle extends Food {
    @Override
    public void addSpicy(String amount) {
        System.out.println("[JapanNoodle] call addSpicy(), and the amount is " + amount);
    }
}
