package example.GenericExample;

import java.util.List;

/**
 * Reference:
 *  - http://puremonkey2010.blogspot.com/2010/12/gossip-in-java-generics.html
 */
public class GenericFooExample {
    public static void main(String[] args) {
        GenericFoo<String> genericFoo = new GenericFoo<>();
        genericFoo.setFoo("Hello");
        System.out.println(genericFoo.getFoo());

        //! Unresolved compilation problem.
        // GenericFoo<String> genericFoo2 = new GenericFoo();
        // genericFoo2.setFoo(123); 
        // System.out.println(genericFoo2.getFoo());

        SubGenericQoo<String, String, Integer> subGenericQoo = new SubGenericQoo<>();
        subGenericQoo.setQoo1("1");
        subGenericQoo.setQoo2("George");
        subGenericQoo.setQoo3(22);
        System.out.println("ID: " + subGenericQoo.getQoo1() + "; Name: " + subGenericQoo.getQoo2() + "; Age: " + subGenericQoo.getQoo3());
    }
}

class GenericFoo<T> {
    private T foo;

    public void setFoo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }
}

/**
 * 可利用GenericFoo的泛型功能寫一個包裝類別 (Wrapper)
 */
class WrapperFoo<T> {
    private GenericFoo<T> foo;

    public void setFoo(GenericFoo<T> foo) {
        this.foo = foo;
    }

    public GenericFoo<T> getFoo() {
        return foo;
    }
}

/**
 * 可限制泛型可用類型
 */
class ListGenericFoo<T extends List<T>> {
    private T[] fooArray;

    public void setFoo(T[] fooArray) {
        this.fooArray = fooArray;
    }

    public T[] getFoo() {
        return fooArray;
    }
}

/**
 * 擴充泛型類別、實作泛型介面
 */
class GenericQoo<T1, T2> {
    private T1 qoo1;
    private T2 qoo2;

    public void setQoo1(T1 qoo1) {
        this.qoo1 = qoo1;
    }

    public T1 getQoo1() {
        return qoo1;
    }

    public void setQoo2(T2 qoo2) {
        this.qoo2 = qoo2;
    }

    public T2 getQoo2() {
        return qoo2;
    }
}

class SubGenericQoo<T1, T2, T3> extends GenericQoo<T1, T2> {
    private T3 qoo3;

    public void setQoo3(T3 qoo3) {
        this.qoo3 = qoo3;
    }

    public T3 getQoo3() {
        return qoo3;
    }
}

