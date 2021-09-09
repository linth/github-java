package example.ThreadExample;

/**
 * 賽馬例子
 * 
 * Reference
 *  - https://litotom.com/java-thread-runnable/
 */
public class SimpleRunnableExample {
    public static void main(String[] args) {
        // 實作Runnable方式
        // A a = new A();
        // Thread t = new Thread(a);
        // t.start();

        // 繼承Thread方式
        // B b = new B("B instance");
        // Thread t2 = new Thread(b);
        // t2.start();

        // 觀察執行續運作和流程
        ThreadSimple ts = new ThreadSimple();
        Thread t3 = new Thread(ts);
        t3.start();
        t3.interrupt();
    }
}

/**
 * 實作Runnable方式
 * 
 * Runnable介面唯一方法就是run()方法
 */
class A implements Runnable {
    public void run() {
        // System.out.println("A is running.");

        for(int i=0; i<1000; i++) {
            System.out.println("A class run function: " + i + " time.");
        }
    }
}

/**
 * 繼承Thread方式
 */
class B extends Thread {
    public B(String name) {
        super(name);
    }

    public void run() {
        int h = 0;

        for(int i=0; i<1000; i++) {
            h++;
            System.out.println(getName() + " : " + h);
        }
    }
}

/** 
 * java.lang.Thread 類別可以讓使用者向作業系統取得額外的執行緒，並在這個執行緒類別中，放入設計師想要做的工作。
 */
class HourseThread extends Thread {
    HourseThread(String name) {
        super(name);
    }

    public void run() {
        int h = 0;

        for(int i=0; i<1000; i++) {
            h++;
            System.out.println(getName() + " : " + h);
        }
    }
}

/**
 * 賽馬例子 example 1: (使用 main 跟 thread 執行)
 */
class Racing {
    public static void main(String[] args) {
        // 使用thread來執行
        //! 如果此block放到 for-loop後面，則會執行完後才會執行thread ?
        HourseThread h2 = new HourseThread("hourse thread 2");
        h2.start();

        // main
        int h1 = 0;
        for(int i=0; i<5000; i++) {
            h1++;
            System.out.println("houre thread 1 : " + h1);
        }
    }
}

/**
 * 賽馬例子 example 2: (使用兩個 thread)
 * 
 * 可以看 package example.ThreadExample 範例
 */
class Racing2 {
    public static void main(String[] args) {
        
    }
}

/**
 * 觀察執行續的流程與運作
 * 
 * Reference
 *  - https://matthung0807.blogspot.com/2017/09/java-threadsleep.html
 */
class ThreadSimple implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("執行緒執行...");
        } catch (Exception e) {
            System.out.println("執行緒中斷了...");
            return;
        }
    }
}