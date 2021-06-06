package example.ExceptionExample;

import java.util.logging.*;

/**
 * testExample
 */
public class colorLoggingExample {

    public static void main(String[] args) {
        
        ProcessJob pj = new ProcessJob();
        pj.all();
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

    public void all() {
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
}