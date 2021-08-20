package example.ExceptionExample;

import java.util.logging.*;

import example.EnumExample.ColorLogging;

/**
 * SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST.
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1264738568571776
 */

public class loggingExample {
    
    public static void main(String[] args) {
        //! 想一想使用 logging 和 exception 結合

        // Logger logger = Logger.getGlobal();
        Logger logger = Logger.getLogger("loggingTest");
        logger.setLevel(Level.ALL); // Leavel.OFF

        /**
         * Logger 預設的 Handler 是 ConsolerHandler。
         *  - 一個 Logger 可以維護多個 Handler，每個 Handler 可以有自己的訊息等級。
         */
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        
        logger.severe("嚴重資訊...");
        logger.warning("警示資訊...");
        logger.info("一般資訊...");
        logger.config("設定方面資訊...");
        logger.fine("細微的資訊...");
        logger.finer("更細微的資訊...");
        logger.finest("最細微的資訊...");

        logger.log(Level.SEVERE, "嚴重資訊");
        logger.log(Level.WARNING, "警示資訊");
        logger.log(Level.INFO, "一般資訊");
        logger.log(Level.CONFIG, "設定方面資訊");
        logger.log(Level.FINE, "細微的資訊");
        logger.log(Level.FINER, "更細微的資訊");
        logger.log(Level.FINEST, "最細微的資訊");

        // enum.
        System.out.println("High: " + ColorLogging.HIGH);
        System.out.println("MEDIUM: " + ColorLogging.MEDIUM);
        System.out.println("LOW: " + ColorLogging.LOW);
    }
}
