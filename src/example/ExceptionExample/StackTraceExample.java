package example.ExceptionExample;

/**
 * ! (重要!!)
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

        Job job2 = new Job();
        job2.executeTask();
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

// TODO: create a function to receive the string message and change color.
class MessageException {
    public static String warning(String msg) {
        return Color.RED + msg + Color.WHITE;
    }

    public static void general(String msg) {
        // return Color.BLUE + msg + Color.WHITE; 
        System.out.println(Color.PURPLE + msg + Color.WHITE);
    }
}

class Job extends Block {
    /**
     * 使用串接方式 + 堆疊追蹤 讓debug知道錯誤在那邊，縮小trace bug範圍。
     * 
     * @return
     * @throws Exception
     */
    public String process() throws Exception {
        try {
            MessageException.general("starting to execute process.");
            step1()
                .step2()
                .step3();
            MessageException.general("ending to execute process.");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            // throw new Exception(Color.RED + "[process4 function 的 exception]" + Color.WHITE);
            throw new Exception(MessageException.warning("[process4 function 的 exception]"));
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

    @Override
    public void doTask() {
        MessageException.general("starting the doTask.");

        step4()
            .step5()
            .step6();

        MessageException.general("ending doTask.");
    }

    public Job step4() {
        System.out.println(Color.BLUE + "execute step4..." + Color.WHITE);
        return this;
    }

    public Job step5() {
        System.out.println(Color.BLUE + "execute step5..." + Color.WHITE);
        return this;
    }

    public Job step6() {
        System.out.println(Color.BLUE + "execute step6..." + Color.WHITE);
        return this;
    }
}

// TODO: 是否可以建立一個 class 專心處理 try-catch 的架構? 
// TODO: using interface class, abstract class.

class Block {
    public void doTask() {
        // do something.
    }

    public void executeTask() throws Exception {
        try {
            doTask();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Block error.");
        }
    }

    // TODO: add notimplement error exception.
}