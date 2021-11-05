package example.TmpExample;

import java.util.Optional;

/**
 * Optional 範例
 * 
 * Optional 物件
 *  - of()：接受非 null 的值並回傳 Optional 物件。
 *  - ofNullable()：可以接受 null 的值，回傳 Optional 物件
 *  - get()：如果值存在就回傳這個值，否則就丟出 NoSuchElementException。
 *  - orElse(T other)：如果值存在就回傳這個值，否則回傳 other 。
 *  - orElseGet(Supplier<? extends T> other)：如果值存在就回傳這個值，否則就呼叫 other 並回傳它的結果。
 *  - orElseThrow(Supplier<? extends X> exceptionSupplier)：如果值存在就回傳這個值，否則就丟出由 exceptionSupplier 建立的例外。
 * 
 * Reference:
 *  - http://blog.tonycube.com/2015/10/java-java8-4-optional.html
 */
public class OptionalExample {
    public static void main(String[] args) {
        OptionalExample o = new OptionalExample();
        Optional<Integer> val1 = Optional.ofNullable(2);
        Optional<Integer> val2 = Optional.ofNullable(5);

        System.out.println("val1: " + val1.get());
        System.out.println("val2: " + val2.get());

        o.nameNotNull();
        o.nameNullable();
        o.nameIsPresent(null);
        o.nameIsPresent("GG");
    }

    public void nameNotNull() {
        String name = "GEORGE";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.get());
    }

    public void nameNullable() {
        String name = null;
        // Optional<String> optName = Optional.of(name); // 使用of會有錯誤
        Optional<String> optName = Optional.ofNullable(name);
        
        // System.out.println(optName.get()); // 因為是null，會出現NoSuchElementException狀況。
        System.out.println(optName);
    }

    public void nameIsPresent(String n) {
        String name = n;
        Optional<String> optName = Optional.ofNullable(name);

        if (optName.isPresent()) {
            System.out.println(optName.get());
        } else {
            System.out.println("name value is null.");
        }
    }

    public void useEmpty() {
        // TODO: check empty case.
    }

    public void useOrElse() {
        // TODO: reduce if statement.
    }

    public void useOrElseGet() {

    }

    public void useOrElseThrow() {

    }

    // public Integer sum(Optional<Integer> first, Optional<Integer> second) {
    //     if (first.isPresent() && second.isPresent()) {
    //         return first.get() + second.get();
    //     }
    //     return null;
    // }
}
