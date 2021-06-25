package example.ThreadExample;

/**
 * 同步
 *  - Process synchronization
 *  - Thread synchronization
 *      - 相互排斥 mutual exclusive
 *          - 同步方法 sync method
 *          - 同步區塊 sync block
 *          - 靜態同步 static sync
 *      - 執行緒間的通信 inter-thread communication
 */
public class SyncStaticMethodExample {
    public static void main(String[] args) {
        //! 如果同步應用在靜態方法，鎖住的資源就是類別，而不是物件。
        JobThread1 t1 = new JobThread1();
        JobThread2 t2 = new JobThread2();
        JobThread3 t3 = new JobThread3();

        t1.start();
        t2.start();
        t3.start();
    }
}

class DemoSyncStaticMethod {
    synchronized static void printDemo(int n) {
        for (int i=1; i<=5; i++) {
            System.out.println("output: " + i*n);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        } 
    }
}

class JobThread1 extends Thread {
    public void run() {
        DemoSyncStaticMethod.printDemo(10);
    }
}

class JobThread2 extends Thread {
    public void run() {
        DemoSyncStaticMethod.printDemo(100);
    }
}

class JobThread3 extends Thread {
    public void run() {
        DemoSyncStaticMethod.printDemo(1000);
    }
}