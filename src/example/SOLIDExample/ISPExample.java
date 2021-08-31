package example.SOLIDExample;

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

        d.startEngine();
        d.greeting();
        d.closeEngine();
        // 最好的實作方式：介面隔離原則，額外多定義interface class.
        e.enableDebugMode();
    }
}

/**
 * 建立兩個 class: driver 和 engineer 
 */
interface Car {
    void startEngine();
    void closeEngine();
    void greeting();
    // void enableDebugMode(); // 由 DebugMode class 去定義
}

interface DebugMode {
    void enableDebugMode();
}

class driver implements Car {
    public void startEngine() {
        System.out.println("啟動車子！");
    }

    public void closeEngine() {
        System.out.println("關閉車子！");
    }

    public void greeting() {
        System.out.println("歡迎搭車！");
    }

    // public void enableDebugMode() {
    //     System.out.println("錯誤，無權存取！");
    // }
}

/**
 * 定義完 interface class 後，由要實作的class 多重繼承後實作。
 */
class engineer implements Car, DebugMode {
    public void startEngine() {
        System.out.println("啟動車子！");
    }

    public void closeEngine() {
        System.out.println("關閉車子！");
    }

    public void greeting() {
        System.out.println("歡迎搭車！");
    }

    public void enableDebugMode() {
        System.out.println("啟動工程模式！");
    }
}

