package example.ThreadExample.Concurrency;

public class ConcurrencyTryToSolveIt2 {

    public volatile static int cnt = 0;
    
    public static void main(String[] args) throws InterruptedException {
        task();
    }

    public static void task() throws InterruptedException {
        // 多執行續任務 1
        Thread t1 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                add();
            }
        });

        // 多執行續任務 2
        Thread t2 = new Thread(() -> {
            for (int i=0; i<10000; i++) {
                add();
            }
        });
        
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println("cnt: " + cnt);
    }

    public static synchronized void add() {
        //! 初步看起來需要將統計計算的部分，包裝成一個 function，並增加 synchronized
        cnt += 1;
    }
}
