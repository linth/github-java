package example.StreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Reference
 *  - https://mrbird.cc/java8stream2.html
 */
public class StreamCollect {
    public static void main(String[] args) {
        List<Dish> list = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        list.stream()
            .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)))
            .ifPresent(System.out::println);
    }
}

class Dish {
    public enum Type {MEAT, FISH, OTHER}

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String toString() {
        return this.getName();
    }

    public String getName() {
        return this.name;
    }

    public int getCalories() {
        return this.calories;
    }
    // ignore the getter, setter.
}
