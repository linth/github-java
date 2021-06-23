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
public class SynchExample {
    public static void main(String[] args) {
        // example without sync.
        // exampleWithoutSync();

        // example with sync.
        exampleWithSync();
    }

    public static void exampleWithoutSync() {
        DemoProblemWithoutSync demo = new DemoProblemWithoutSync();

        JobThreadFirst jt1 = new JobThreadFirst(demo);
        JobThreadSecond jt2 = new JobThreadSecond(demo);

        jt1.start();
        jt2.start();
    }

    /**
     * 所謂同步，就是可以讓某執行緒在使用記憶體資源時，同時鎖住資源讓其他執行緒無法改動。
     */
    public static void exampleWithSync() {
        DemoProblemWithoutSync demo = new DemoProblemWithoutSync();

        FirstThreadWithSync ftws = new FirstThreadWithSync(demo);
        SecondThreadWithSync stws = new SecondThreadWithSync(demo);

        ftws.start();
        stws.start();
    }
}

class DemoProblemWithoutSync {
    /**
     * 未使用sync方式
     * @param n
     */
    public void printDemo(int n) {
        for (int i=1; i<=5; i++) {
            System.out.println("output: " + i*n);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * 使用sync方式
     * @param n
     */
    public synchronized void printDemoWithSync(int n) {
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

class JobThreadFirst extends Thread {
    DemoProblemWithoutSync demo;

    JobThreadFirst(DemoProblemWithoutSync demo) {
        this.demo = demo;
    }

    public void run() {
        demo.printDemo(10);
    }
}

class JobThreadSecond extends Thread {
    DemoProblemWithoutSync demo;

    JobThreadSecond(DemoProblemWithoutSync demo) {
        this.demo = demo;
    }

    public void run() {
        demo.printDemo(100);
    }
}

class FirstThreadWithSync extends JobThreadFirst {

    FirstThreadWithSync(DemoProblemWithoutSync demo) {
        super(demo);
    }

    public void run() {
        demo.printDemoWithSync(10);
    }
}

class SecondThreadWithSync extends JobThreadSecond {

    SecondThreadWithSync(DemoProblemWithoutSync demo) {
        super(demo);
    }

    public void run() {
        demo.printDemoWithSync(100);
    }
}