package example.GenericExample;

public class Pair<T> {
    // same type for parameters.
    private T fist;
    private T last;

    public Pair(T first, T last) {
        this.fist = first;
        this.last = last;
    }

    public T getFirst() {
        return fist;
    }

    public T getLast() {
        return last;
    }

    public static <K> Pair<K> create(K first, K last) {
        return new Pair<K>(first, last);
    }

    public static void main(String[] args) {
        SecondPair<String, Integer> p = new SecondPair<> ("test", 123);
        System.out.println("first: " + p.getFirst());
        System.out.println("last: " + p.getLast());
    }
}


class SecondPair<T, K> {
    // two different type for parameters.
    private T first;
    private K last;

    public SecondPair(T first, K last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public K getLast() {
        return last;
    }
}