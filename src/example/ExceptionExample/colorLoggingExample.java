package example.ExceptionExample;

import java.util.logging.*;

/**
 * testExample
 */
public class colorLoggingExample {

    public static void main(String[] args) throws Exception {
        
        try {
            //! 使用串接 + logging方式，無法有效bug error追蹤。
            ProcessJob pj = new ProcessJob();
            pj.all();

            //! 使用串接 + try-catch堆疊，可提供bug error追蹤!
            ProcessJob pj2 = new ProcessJob();
            pj2.all2();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("[main function 的 exception]");
        }
    }
}


/**
 * ProcessJob
 */
class ProcessJob {
    public Logger logger;
    private int number = -1;

    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";
    public static final String PURPLE = "\u001B[35m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String BLACK = "\u001B[0m";

    public ProcessJob initLogging() {
        this.logger = Logger.getLogger("ProcessJob");
        this.logger.setLevel(Level.ALL);
        return this;
    }

    public ProcessJob process1() {
        logger.info(GREEN + "execute process1()..." + WHITE);
        logger.info("end of process1()...");
        return this;
    }

    public ProcessJob process2() {
        try {
            if (number >= 0) {
                logger.info(GREEN + "execute process2()..." + WHITE);
                logger.info("end of process2()...");
            } else {
                logger.warning(RED + "execute process2()..." + WHITE);
                throw new Exception(RED + "the value of number is less than 0." + WHITE);
            }
        } catch(Exception e) {
            logger.severe(RED + "something wrong." + WHITE);
        }
        return this;
    }

    public ProcessJob process3() {
        logger.info(GREEN + "execute process3()..." + WHITE);
        logger.info("end of process3()...");
        return this;
    }

    /**
     * 使用串接方式 + 堆疊追蹤 讓debug知道錯誤在那邊，縮小trace bug範圍。
     * 
     * @return
     * @throws Exception
     */
    public String process4() throws Exception {
        try {
            step1().step2().step3();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(RED + "[process4 function 的 exception]" + WHITE);
        }
    }

    public ProcessJob step1() throws Exception {
        try {
            System.out.println(BLUE + "execute step1..." + WHITE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(RED + "step 1 function 的 exception" + WHITE);
        }
        return this;
    }

    public ProcessJob step2() throws Exception {
        try {
            boolean res = true;
            System.out.println(BLUE + "execute step2..." + WHITE);

            if (res == true) {
                throw new Exception(PURPLE + "執行時候發生錯誤!!!" + WHITE);
            } else {
                // pass.
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(RED + "step 2 function 的 exception" + WHITE);
        }
        return this;
    }

    public ProcessJob step3() throws Exception {
        try {
            System.out.println(BLUE + "execute step3..." + WHITE);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(RED + "step 3 function 的 exception" + WHITE);
        }
        return this;
    }

    public void all() throws Exception {
        // this.initLogging();
        // this.process1();
        // this.process2();
        // this.process3();

        // 使用 chain 概念
        this.initLogging()
            .process1()
            .process2()
            .process3();
    }

    public void all2() throws Exception {
        try {
            process4();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(RED + "[all2 function 的 exception]" + WHITE);
        }
    }
}