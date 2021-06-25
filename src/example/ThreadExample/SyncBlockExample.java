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
public class SyncBlockExample {
    public static void main(String[] args) {
        // example for sync block.
        exampleWithSyncBlock();
    }

    public static void exampleWithSyncBlock() {
        DemoSyncBlock demo = new DemoSyncBlock();

        JobThreadFirst jt1 = new JobThreadFirst(demo);
        JobThreadSecond jt2 = new JobThreadSecond(demo);

        jt1.start();
        jt2.start();
    }
}

class DemoSyncBlock extends DemoProblemWithoutSync {
    public void printDemo(int n) {
        //! sync block.
        synchronized(this) {
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
}
