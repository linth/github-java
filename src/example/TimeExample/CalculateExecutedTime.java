package example.TimeExample;

/**
 * Timer
 * 
 * Reference:
 *  - https://www.gushiciku.cn/pl/gpRL/zh-tw
 */
public class CalculateExecutedTime {

    // public interface Visitor {
    //     int doJob(int a, int b);
    // }
    public static void main(String[] args) {
        // Timer.code(() -> {
        //     for1000();
        // });

        Timer.code(() -> {
            for10000();
        });
    }

    public static void for1000() {
        for(int i=0; i<1000; i++) {
            System.out.println(i);
        }
    }

    public static void for10000() {
        for(int i=0; i<10000; i++) {
            System.out.println(i);
        }
    }

    public static void executedTime() {
        Visitor visitor = new Visitor() {
            public int doJob(int a, int b) {
                return a + b;
            }
        };

        System.out.println(visitor.doJob(10, 20));
    }
}

interface Visitor {
    int doJob(int a, int b);
}


class Timer {
    public static void code(Runnable block) {
        long start = System.currentTimeMillis();
        try {
            block.run();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println("Time taken: " + (end - start) / 1.0e4);
        }
    }

    // public static void contextLoad7() {
    //     // TODO: 結合Hutool library.
    //     TimeInterval timer = DateUtil.timer();

    //     long interval = timer.interval(); //花費毫秒數
    //     System.out.println("interval = " + interval);

    //     long intervalRestart = timer.intervalRestart(); //返回花費時間，並重置開始時間
    //     System.out.println("intervalRestart = " + intervalRestart);

    //     long intervalMinute = timer.intervalMinute(); //花費分鐘數
    //     System.out.println("intervalMinute = " + intervalMinute);
    // }
}