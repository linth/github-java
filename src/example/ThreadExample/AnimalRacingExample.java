package example.ThreadExample;

/**
 * Compared with thread-based and without thread-based.
 */
public class AnimalRacingExample {    
    public static void main(String[] args) {
        // without thread to run your code.
        // ! 執行會是逐步一個一個執行完，才會接續下個任務。
        noUseThread();

        // use thread to run your code.
        // ! 執行會是同時執行，不知道誰才會先執行完任務。
        useMultiThread();
    }

    public static void noUseThread() {
        // example without using thread.
        AnimalRacingWithoutThread arwt1 = new AnimalRacingWithoutThread("dog");
        AnimalRacingWithoutThread arwt2 = new AnimalRacingWithoutThread("cat");

        arwt1.run();
        arwt2.run();
    }

    public static void useMultiThread() {
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
 * 使用單一執行緒 (Without thread)
 * 
 * ! 請注意單一執行緒跟多執行緒差別: 有繼承 Thread class.
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
 * 使用多執行緒 (With thread)
 * 
 * ! 請注意單一執行緒跟多執行緒差別: 有繼承 Thread class.
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

