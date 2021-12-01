package example.StreamExample;

import java.util.function.LongConsumer;
import java.util.stream.LongStream;

/**
 * Reference
 *  - https://mrbird.cc/Java8-parallelStream.html
 */
public class ParallelStreamExample {
    public static void main(String[] args) {
        ParallelStreamExample.test((n) -> LongStream.rangeClosed(1L, n).reduce(0L, Long::sum), 1000L);
        ParallelStreamExample.test((n) -> LongStream.rangeClosed(1L, n).parallel().reduce(0L, Long::sum), 1000L);

        ParallelStreamExample.test((n) -> LongStream.rangeClosed(1L, n).reduce(0L, Long::sum), 1000000000L);
        ParallelStreamExample.test((n) -> LongStream.rangeClosed(1L, n).parallel().reduce(0L, Long::sum), 1000000000L);
    }

    static void test(LongConsumer c, Long n) {
        long start = System.currentTimeMillis();
        c.accept(n);
        long end = System.currentTimeMillis();
        System.out.println("處理時間" + (end - start) + "msc");
    }
}
