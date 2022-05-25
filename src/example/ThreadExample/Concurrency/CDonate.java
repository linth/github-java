package example.ThreadExample.Concurrency;

public class CDonate {
    private static int sum = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i=0; i<3; i++) {
                add(100);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0; i<3; i++) {
                add(100);
            }
        });

        t1.start();
        t2.start();

        // CPerson p1 = new CPerson();
        // CPerson p2 = new CPerson();

        // p1.start();
        // p2.start();
    }

    public synchronized static void add(int n) {
        int tmp = sum;
        tmp = tmp + n;

        try {
            Thread.sleep((int)(1000 * Math.random()));
        } catch(InterruptedException e) {
            System.out.println(e.toString());
        }

        sum = tmp;
        System.out.println("捐款總額= "+sum);
    }
}

class CPerson extends Thread {

    public void run() {
        for (int i=1; i<=3; i++) {
            CDonate.add(100);
        }
    }
}

