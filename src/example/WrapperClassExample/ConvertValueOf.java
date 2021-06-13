package example.WrapperClassExample;

public class ConvertValueOf {
    
}


class ExampleValueOf {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(10);
        Integer y = Integer.valueOf("101");
        Integer b2 = Integer.valueOf("10111", 2);
        Integer b8 = Integer.valueOf("15", 8);
        Integer b16 = Integer.valueOf("18a", 16);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("b2: " + b2);
        System.out.println("b8: " + b8);
        System.out.println("b16: " + b16);
        System.out.println("Class of x: " + x.getClass());
    }
}