package example.GenericExample;

/**
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1265105853480864
 */
public class Main {    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 6};
        Double[] doubleArray = {5.5, 4.4, 3.3, 4.1, 6.3};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"UUU", "sssss", "You", "EEE"};

        // displayArray(intArray);
        // doubleArray(doubleArray);
        // charArray(charArray);
        // stringArray(stringArray);

        System.out.println("int: " + getFirst(intArray));
        System.out.println("double: " + getFirst(doubleArray));
        System.out.println("char: " + getFirst(charArray));
        System.out.println("string: " + getFirst(stringArray));
    }    

    public static void displayArray(Integer[] array) {
        for(Integer x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void doubleArray(Double[] array) {
        for(Double x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void charArray(Character[] array) {
        for(Character x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void stringArray(String[] array) {
        for(String x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        // for(T x : array) {
        //     System.out.println(x + " ");
        // }
        // System.out.println();
        return array[0];
    }
}

