package example.ThreadExample;

/**
 * Daemon Thread: 主要是被用來確保執行續提供服務，如：垃圾回收執行續。
 *  - 當Daemon屬性是 true，表示希望某個執行緒在非Daemon執行緒都結束後也跟著終止
 *  - 當Daemon屬性是 false，表示主執行續會等待執行續結束，在結束工作。
 */
public class DaemonExample {
    public static void main(String[] args) {
        NewDaemon nd1 = new NewDaemon();
        NewDaemon nd2 = new NewDaemon();

        nd1.setDaemon(true);
        // nd1.setDaemon(false);
        nd1.start();
        nd2.start();
    }
}

class NewDaemon extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Starting...");

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("[InterruptedException] " + e);
            } catch (Exception e) {
                System.out.println("[Exception] " + e);
            }
        } else {
            System.out.println("non-Daemon Starting...");
            System.out.println("non-Daemon Ending...");
        }
    }
}
