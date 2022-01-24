package example.GenericExample;

/**
 * 泛型方法 Element
 * 
 * Reference:
 *  - https://www.runoob.com/java/java-generics.html
 */
public class GElement {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.2, 2.4, 3.7, 4.9, 5.0};
        Character[] charArray = {'H', 'G', 'O', 'E', 'F', 'K'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        System.out.println("the max number: " + maximum(3, 4, 5));

        Box<Integer> boxInteger = new Box<Integer>(10);
        Box<String> boxString = new Box<String>("New");
        System.out.println("boxInteger: " + boxInteger.get());
        System.out.println("boxString: " + boxString.get());
    }

    public static <E> void printArray(E[] inputArray) {
        // print all elements in the array.
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        // compare three value and return max value.
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}


class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}