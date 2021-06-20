package example.ThreadExample;

/**
 * Compared with thread-based and without thread-based.
 */
public class AnimalRacingExample {    
    public static void main(String[] args) {
        // example without using thread.
        AnimalRacingWithoutThread arwt1 = new AnimalRacingWithoutThread("dog");
        AnimalRacingWithoutThread arwt2 = new AnimalRacingWithoutThread("cat");

        // arwt1.run();
        // arwt2.run();

        // example with using thread.
        AnimalRacingWithThread arwt3 = new AnimalRacingWithThread("hourse");
        AnimalRacingWithThread arwt4 = new AnimalRacingWithThread("tiger");
        AnimalRacingWithThread arwt5 = new AnimalRacingWithThread("raibbit");
        AnimalRacingWithThread arwt6 = new AnimalRacingWithThread("lion");

        arwt3.start();
        arwt4.start();
        arwt5.start();
        arwt6.start();
    }
}

/**
 * Without thread. 單一執行緒
 */
class AnimalRacingWithoutThread {
    private String name;

    AnimalRacingWithoutThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println(name + " is running " + i + " circule.");
        }
    }
}

/**
 * With thread. 多執行緒
 */
class AnimalRacingWithThread extends Thread {
    private String name;

    AnimalRacingWithThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0; i<=1000; i++) {
            System.out.println(name + " is running " + i + " circule.");
        }
    }
}

