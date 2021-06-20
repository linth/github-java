package example.ThreadExample;

class A implements Runnable {
    public void run() {
        System.out.println("A is running.");
    }
}

public class SimpleRunnableExample {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
    }
}
