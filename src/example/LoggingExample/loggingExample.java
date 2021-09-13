package example.LoggingExample;

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
        // ! 想一想使用 logging, color 和 exception 結合
        // ! 思考 logging 日誌跟 system.out.println 差別
        // ! 思考 logging 日誌、DB、Exception之間的關係

        // Logger logger = Logger.getGlobal();
        Logger logger = Logger.getLogger("loggingTest");
        logger.setLevel(Level.ALL); // Leavel.OFF

        /**
         * Logger 預設的 Handler 是 ConsolerHandler。 - 一個 Logger 可以維護多個 Handler，每個 Handler
         * 可以有自己的訊息等級。
         */
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.SEVERE);
        logger.addHandler(consoleHandler);

        logger.severe(Color.ANSI_RED + " 嚴重資訊..." + Color.ANSI_RESET);
        logger.warning(Color.ANSI_YELLOW + "警示資訊..." + Color.ANSI_RESET);
        logger.info(Color.ANSI_CYAN + "一般資訊..." + Color.ANSI_RESET);
        logger.config(Color.ANSI_BLUE + "設定方面資訊..." + Color.ANSI_RESET);
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

class Color {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m"; // 深藍色
    public static final String ANSI_CYAN = "\u001B[36m"; // 淡藍色
}