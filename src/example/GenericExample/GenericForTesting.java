package example.GenericExample;

/**
 * Reference:
 *  - https://www.geeksforgeeks.org/generics-in-java/
 */
public class GenericForTesting {
    public static void main(String[] args) {
        //! 減少 unit test code.
        // test integer.
        Test<Integer> t1 = new Test<>(11);
        System.out.println(t1.getObj());
        assert t1.getObj() == 11;

        // test string.
        Test<String> t2 = new Test<>("11");
        System.out.println(t2.getObj());
        assert t2.getObj() == "11";
        // assert t2.getObj() == 11;
    }
}

class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
