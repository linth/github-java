package example.ThreadExample;

class HourseRacing implements Runnable {
    private String name;

    HourseRacing(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0; i<=1000; i++) {
            System.out.println(name + " is runing " + i + " round.");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        HourseRacing hr1 = new HourseRacing("Hourse 1");
        HourseRacing hr2 = new HourseRacing("Hourse 2");
        HourseRacing hr3 = new HourseRacing("Hourse 3");

        Thread t1 = new Thread(hr1);
        Thread t2 = new Thread(hr2);
        Thread t3 = new Thread(hr3);

        t1.start();
        t2.start();
        t3.start();
    }
}
