package example.TmpExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional 範例
 *  - Optional觀念: 主要使用Optional取代null
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
 *  - https://www.runoob.com/java/java8-optional-class.html
 *  - https://medium.com/@curryyen/%E8%81%8A-java-optional-9a5949ab6dc9
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
        o.nameIsPresent("George");
        o.nameIsPresent("GG");
        o.useEmpty();
        o.useOrElse();
        o.useOrElseThrow();

        o.listInOptional();
    }

    public void nameNotNull() {
        // ! of() 不能塞 null
        String name = "GEORGE";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.get());
    }

    public void nameNullable() {
        // ! ofNullable() 可以塞 null
        String name = null;
        // Optional<String> optName = Optional.of(name); // 使用of會有錯誤
        Optional<String> optName = Optional.ofNullable(name);
        
        // System.out.println(optName.get()); // 因為是null，會出現NoSuchElementException狀況。
        System.out.println(optName);
    }

    public void nameIsPresent(String n) {
        // ! isPresent() 可拿來判斷是否有此物件存在
        String name = n;
        Optional<String> optName = Optional.ofNullable(name);

        if (optName.isPresent()) {
            System.out.println(optName.get());
        } else {
            System.out.println("name value is null.");
        }
    }

    public void useEmpty() {
        String name = null;
        // ! 使用三元運算子 + optional object
        Optional<String> optName = (name == null) ? Optional.empty() : Optional.of(name);

        System.out.println(optName); // optName.get() 因為null, 所以無法抓取到值會有錯誤。
    }

    public void useOrElse() {
        // 取代 if
        // ! orElse() 處理 null 後續動作
        String name = null; 
        Optional<String> optName = Optional.ofNullable(name);
        
        System.out.println(optName.orElse("Name is null."));
    }

    public void useOrElseGet() {
        String name = null;
        Optional<String> optName = Optional.ofNullable(name);

        // ! 可透過 orElseGet，讓null值時多做一些事情
        System.out.println(optName.orElseGet( () -> "what!!! null !!" )); // lambda.
    }

    public void useOrElseThrow() {
        // ! 可透過null值，跳出exception處理
        String name = null;
        Optional<String> optName = Optional.ofNullable(name);

        try {
            System.out.println(optName.orElseThrow( () -> new Exception("what the hell.") ));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // * example for chaining the above functions.
    public void situation1() {
        // TODO: think the process of situation 1.
    }

    public void situation2() {
        // TODO: think the process of situation 2.
    }

    public void listInOptional() {
        // * put list into the optional object.
        List<String> studentList = new ArrayList<>();
        studentList.add("George");
        studentList.add("May");
        studentList.add("HaHa");
        studentList.add("JJ");
        studentList.add("PP");
        studentList.add("John");
        studentList.add("Amy");

        studentList.forEach(s -> {
            System.out.println(s);
        });

        Optional<List<String>> result = Optional.ofNullable(studentList);
        System.out.println(result);
    }

    // TODO: map into optional.
    // TODO: json into optional.
    // TODO: any object or collection into optional.

    // ? THINK: stream, collection, iterable, iterator, ..., etc.
}
