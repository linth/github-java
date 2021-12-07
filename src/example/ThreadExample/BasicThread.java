package example.ThreadExample;

/**
 * Thread basic concept. (Java多執行緒教學)
 * 
 * Reference:
 *  - https://tw511.com/20/203/7948.html
 *  - https://tw511.com/20/205/7979.html
 */
public class BasicThread {
    public static void main(String[] args) {
        // example for get thread name and id.
        BasicThread bt = new BasicThread();
        bt.basic_example();

        // run a simple thread.
        RunThreadExample rhe = new RunThreadExample("FirstOneThread");
        rhe.start();
        System.out.println("the default thread name: " + rhe.getName());

        bt.createNThread(3);
    }

    public void basic_example() {
        // TODO: make sure that the currentThread().
        Thread thread = Thread.currentThread();
        System.out.println("Thread 名稱: " + thread.getName());
        thread.setName("TheMainThread"); // 可以改 thread 名稱
        System.out.println("The thread name: " + thread.getName());
        System.out.println("The thread ID: " + thread.getId());
    }

    public void createNThread(int n) {
        // generate n threads.
        try {
            if (n > 0) {
                for (int i=0; i<n; i++) {
                    RunThreadExample rhe = new RunThreadExample("Thread " + i);
                    System.out.println("Thread number " + i + ": " + rhe.getName() + "; id: " + rhe.getId());
                    rhe.run();
                }
            }
        } catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
    }

    // TODO: what's next?
    // * create n threads, and then run different programs with different threads.
}

/**
 * 建立一個新的thread，會採用預設名稱。
 */
class RunThreadExample extends Thread {
    RunThreadExample(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread is running..." + " (thread name: " + this.getName() + "; thread id: " + this.getId() + ")");
    }
}