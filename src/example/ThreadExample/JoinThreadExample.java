package example.ThreadExample;

public class JoinThreadExample {
    public static void main(String[] args) {
        Threadjoin tj1 = new Threadjoin("task 1");
        Threadjoin tj2 = new Threadjoin("task 2");
        Threadjoin tj3 = new Threadjoin("task 3");
        Threadjoin tj4 = new Threadjoin("task 4");

        tj1.start();
        tj4.start();

        try {
            tj1.join();
            tj4.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        tj2.start();
        tj3.start();
    }
}

class Threadjoin extends Thread {

    Threadjoin(String name) {
        super(name);
    }

    public void run() {
        for (int i=0; i<=5; i++) {
            try {
                sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(this.getName() + " is running : " + i);
        }
    }
}