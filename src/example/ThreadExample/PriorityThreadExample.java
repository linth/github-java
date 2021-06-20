package example.ThreadExample;

class ThreadPriority extends Thread {
    ThreadPriority(String name) {
        super(name);
    }

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println(this.getName() + " is running : " + i);
        }
    }
}

/**
 * 使用Thread priority來處理執行緒的優先順序
 */
public class PriorityThreadExample {
    public static void main(String[] args) {
        ThreadPriority rabbit = new ThreadPriority("rabbit");
        ThreadPriority turtle = new ThreadPriority("turtle");
        ThreadPriority tiger = new ThreadPriority("tiger");

        System.out.println("the priority of rabbit is " + rabbit.getPriority());
        System.out.println("the priority of turtle is " + turtle.getPriority());
        System.out.println("the priority of tiger is " + tiger.getPriority());

        // set up the priority of animal.
        rabbit.setPriority(Thread.NORM_PRIORITY);
        turtle.setPriority(Thread.MIN_PRIORITY);
        tiger.setPriority(Thread.MAX_PRIORITY);

        System.out.println("the priority of rabbit is " + rabbit.getPriority());
        System.out.println("the priority of turtle is " + turtle.getPriority());
        System.out.println("the priority of tiger is " + tiger.getPriority());

        rabbit.start();
        turtle.start();
        tiger.start();
    }
}
