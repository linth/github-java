package designPattern.Singleton.SingleUser;

/**
 * Singleton design pattern
 * 
 * 遊戲使用者登入只能一個。
 * 
 * 看名稱就很好理解的設計模式，就是只能有一個且是唯一實體的物件。
 * 有些時候最好讓物件只能有一個以避免程式出錯，例如負責處理使用者登入的物件，
 * 假如不是獨體模式的話，登入物件就可能有多個，使用者就可能同時登入很多次。
 * 
 * [重要!] 不要讓別人能用 new 來建立物件，也就是建構子不能宣告為 public。
 * 因為其他人不能使用 private 建構子
 * 
 * TODO: 可以使用 vscode template 快速產生 low-level code.
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2016/06/singleton-pattern.html
 */
public class SingletonFirstImprove {
    
    // 考慮效能問題。只有第一次要 new 物件時才需要同步，這樣寫的話，每次要取得物件都要同步。故可改寫
    private static SingletonFirstImprove sInstance = new SingletonFirstImprove();

    private SingletonFirstImprove() {
        // 建構式宣告為 private, 這樣只有在 Singleton 內使用。
    }

    public static synchronized SingletonFirstImprove getInstance() {
        // 執行緒的角度來看就可以知道，是有可能產生多個物件的，解決方法也不難，在 getInstance() 加上 synchronized。

        if (sInstance == null) {
            sInstance = new SingletonFirstImprove();
        } 
        return sInstance;
    }
}
