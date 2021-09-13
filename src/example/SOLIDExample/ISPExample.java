package example.SOLIDExample;

import java.util.logging.Logger;

/**
 * 介面隔離原則 (Interface Segregation Principle)
 *  - 一個類別不應該被強迫實作一個它不需要的方法
 * 
 * Reference:
 *  - https://ithelp.ithome.com.tw/articles/10248688
 */
public class ISPExample {
    public static void main(String[] args) {
        driver d = new driver();
        engineer e = new engineer();
        // ! enableDebugMode 這個功能本來只專屬工程人員使用，不開放給一般駕駛使用。
        // ! 但是因為Car的介面有這個，所以駕駛不得不實作這個功能，然後丟出錯誤。
        // d.enableDebugMode();
        // e.enableDebugMode();

        // 基本簡單寫法
        d.startEngine();
        d.greeting();
        d.closeEngine();

        // function chain寫法
        d.startEngine()
            .greeting()
            .closeEngine();

        // 最好的實作方式：介面隔離原則，額外多定義interface class.
        e.enableDebugMode();

        // function chain寫法
        e.enableDebugMode()
            .startEngine()
            .greeting()
            .closeEngine();
            
    }
}

/**
 * 建立兩個 class: driver 和 engineer 
 */
interface Car {
    Car startEngine();
    Car closeEngine();
    Car greeting();
    // driver enableDebugMode(); // 由 DebugMode class 去定義
}

interface DebugMode {
    DebugMode enableDebugMode();
}

class driver implements Car {
    Logger logger = Logger.getLogger("Car");
    
    public driver startEngine() {
        logger.info("啟動車子！");
        return this;
    }

    public driver closeEngine() {
        logger.info("關閉車子！");
        return this;
    }

    public driver greeting() {
        logger.info("歡迎搭車！");
        return this;
    }

    // public driver enableDebugMode() {
    //     System.out.println("錯誤，無權存取！");
    //     logger.info("錯誤，無權存取！");
    // }
}

/**
 * 定義完 interface class 後，由要實作的class 多重繼承後實作。
 */
class engineer implements Car, DebugMode {
    Logger logger = Logger.getLogger("Engineer");

    public engineer startEngine() {
        logger.info("啟動車子！");
        return this;
    }

    public engineer closeEngine() {
        logger.info("關閉車子！");
        return this;
    }

    public engineer greeting() {
        logger.info("歡迎搭車！");
        return this;
    }

    public engineer enableDebugMode() {
        logger.info("啟動工程模式！");
        return this;
    }
}

