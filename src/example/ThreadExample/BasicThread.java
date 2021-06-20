package example.ThreadExample;

/**
 * Thread basic concept.
 */
public class BasicThread {
    public void basic_example() {
        Thread thread = Thread.currentThread();
        System.out.println("The thread name: " + thread.getName());
        thread.setName("TheMainThread");
        System.out.println("The thread name: " + thread.getName());
        System.out.println("The thread ID: " + thread.getId());
    }
    public static void main(String[] args) {
        // example for get thread name and id.
        BasicThread bt = new BasicThread();
        bt.basic_example();

        // run a simple thread.
        RunThreadExample rhe = new RunThreadExample("FirstOneThread");
        rhe.start();
        System.out.println("the default thread name: " + rhe.getName());
    }
}

/**
 * 建立一個新的thread，會採用預設名稱。
 */
class RunThreadExample extends Thread {
    RunThreadExample(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread is running...");
    }
}