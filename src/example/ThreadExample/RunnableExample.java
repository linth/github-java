package example.ThreadExample;

/**
 * 賽馬例子實作 thread
 * 
 * Reference
 *  - https://litotom.com/java-thread-runnable/
 *  - https://litotom.com/java-threading-3-horses/
 */
public class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        // racing 1
        // racing1();

        // racing 2
        // racing2();

        // 
        sleepThreadExample();
    }

    /**
     * 賽馬比賽1
     */
    public static void racing1() {
        HourseRacing hr1 = new HourseRacing("Hourse 1");
        HourseRacing hr2 = new HourseRacing("Hourse 2");
        HourseRacing hr3 = new HourseRacing("Hourse 3");

        Thread t1 = new Thread(hr1);
        Thread t2 = new Thread(hr2);
        Thread t3 = new Thread(hr3);

        t1.start();
        t2.start();
        t3.start();
        System.out.println("main executing ending.");
    }

    /**
     * 賽馬比賽2: using join()
     * 
     * Reference
     *  - https://litotom.com/java-threading-3-horses/
     */
    public static void racing2() {
        // 希望 "main executing ending." 執行後顯示
        HourseRacing h1 = new HourseRacing("Hourse 1");
        HourseRacing h2 = new HourseRacing("Hourse 2");
        HourseRacing h3 = new HourseRacing("Hourse 3");

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        Thread t3 = new Thread(h3);

        t1.start();
        t2.start();
        t3.start();

        try {
            //! 使用join() 可確保 3 threads 執行完成後，才會執行 main執行續結束!!
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println("執行續被中斷!!");
        }
        System.out.println("main執行續結束!!");
    }

    public static void racing3() {
        for(int i=0; i<4; i++) {

        }
    }

    /**
     * 每3秒顯示一行資料
     * 
     * Reference
     *  - https://matthung0807.blogspot.com/2017/09/java-threadsleep.html
     * 
     * @throws InterruptedException
     */
    public static void sleepThreadExample() throws InterruptedException {
        String messages[] = {
            "→ bluewinds:我在香港迪士尼有遇到邱淑貞 和她坐同艘船~搞到最後 我   11/02 21:11",
            "推 FackPtt:  就射出來了                                       11/02 21:12",
            "→ bluewinds:們都在看她 沒有人聽解說人員講話~~她本人人超好~~一聽  11/02 21:12",
            "推 ZBeta:    就射出來了                                       11/02 21:13",
            "→ bluewinds:到我們是台灣來的 就很開心的和我們合照~~後來去廁所又  11/02 21:12",
            "→ sephen:   射出來了                                          11/02 21:13"
        };

        for(int i=0; i<messages.length; i++) {
            System.out.println(messages[i]);
            Thread.sleep(3000);
        }
    }
}

class HourseRacing implements Runnable {
    private String name;

    HourseRacing(String name) {
        this.name = name;
    }

    public void run() {
        for (int i=0; i<=3; i++) {
            System.out.println(name + " is runing " + i + " round.");
        }
    }
}
