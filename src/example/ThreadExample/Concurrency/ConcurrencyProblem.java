package example.ThreadExample.Concurrency;

import designPattern.Template.sevenEleven.main;

/**
 * 萬年經典 Concurrency Problem 不一致.
 * 
 * Reference:
 *  - https://medium.com/bucketing/java-concurrency-1-%E5%9C%A8%E9%96%8B%E5%A7%8B%E5%AF%ABcode%E5%89%8D%E5%85%88%E4%BA%86%E8%A7%A3%E4%B8%80%E4%B8%8Bconcurrency%E7%9A%84%E5%9F%BA%E7%A4%8E-8d1a6694eeff
 */
public class ConcurrencyProblem {
    
    public static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {
        //! 當把 多個執行續放在相同的 function內，就會造成資料同步更新上的問題。
        
        // 多執行續任務 1
        Thread t1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                cnt += 1;
            }
        });

        // 多執行續任務 2
        Thread t2 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                cnt += 1;
            }
        });
        
        t1.start();
        t2.start();
        Thread.sleep(2000);

        // 按照開發者的想法cnt最後應該會是20000才對，
        // 但是CPU在計算的時候將資料都佔存在各自的 cache memory中，所以造成不一致的問題。
        System.out.println("cnt: " + cnt);
    }

    public static void singleThread() throws InterruptedException {
        
        // 此方式將兩個 for-loop 寫在同一個 thread 裡面。
        // 缺點：慢
        Thread t1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                cnt += 1;
            }

            for (int i=0; i<10000; i++) {
                cnt += 1;
            }
        });

        t1.start();
        Thread.sleep(2000);
        System.out.println("cnt: " + cnt);
    }
}
