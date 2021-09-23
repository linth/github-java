package example.ExceptionExample;

/**
 * 使用串連 + try-catch 方式去堆疊追蹤 bug error。
 * 
 * TODO: 需要使用 debug = true/false 來開關 debug (How to disable stack trace?)
 * 
 * Reference:
 *  - https://openhome.cc/Gossip/JavaEssence/StackTrace.html
 */
public class StackTraceExample {
    public static void main(String[] args) throws Exception {
        //! 可以減少一些部必要的try-catch地方，如：main。

        // try {
        //     Job job = new Job();
        //     job.process();
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     throw new Exception(Color.RED + "main exception" + Color.WHITE);
        // }

        Job job = new Job();
        job.process();
    }
}

class Color {
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
    public static final String PURPLE = "\u001B[35m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String BLACK = "\u001B[0m";
}

class Job {
    /**
     * 使用串接方式 + 堆疊追蹤 讓debug知道錯誤在那邊，縮小trace bug範圍。
     * 
     * @return
     * @throws Exception
     */
    public String process() throws Exception {
        try {
            step1().step2().step3();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(Color.RED + "[process4 function 的 exception]" + Color.WHITE);
        }
    }

    public Job step1() throws Exception {
        try {
            System.out.println(Color.BLUE + "execute step1..." + Color.WHITE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(Color.RED + "step 1 function 的 exception" + Color.WHITE);
        }
        return this;
    }

    public Job step2() throws Exception {
        try {
            boolean res = true;
            System.out.println(Color.BLUE + "execute step2..." + Color.WHITE);

            if (res == true) {
                throw new Exception(Color.PURPLE + "執行時候發生錯誤!!!" + Color.WHITE);
            } else {
                // pass.
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(Color.RED + "step 2 function 的 exception" + Color.WHITE);
        }
        return this;
    }

    public Job step3() throws Exception {
        try {
            System.out.println(Color.BLUE + "execute step3..." + Color.WHITE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(Color.RED + "step 3 function 的 exception" + Color.WHITE);
        }
        return this;
    }
}