package example.ThreadExample.Concurrency;

public class ConcurrencyTryToSolveIt {
    
    public static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {
        //! 暫時不確定這些解法是否正確，有錯請糾正，謝謝。

        // [解法 1] 把 thread 分別寫在各 function內
        task1();
        task2();
        Thread.sleep(2000);

        // 按照開發者的想法cnt最後應該會是20000才對，
        // 但是CPU在計算的時候將資料都佔存在各自的 cache memory中，所以造成不一致的問題。
        System.out.println("cnt: " + cnt);
    }

    public static void task1() {
        // 多執行續任務 1
        Thread t1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                cnt += 1;
            }
        });        
        t1.start();
    }

    public static void task2() {
        // 多執行續任務 2
        Thread t2 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                cnt += 1;
            }
        });
        t2.start();
    }
}
