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
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2016/06/singleton-pattern.html
 */
public class Singleton {

    private static Singleton sInstance;

    // 可宣告成員變數

    private Singleton() {
        // 建構式宣告為 private, 這樣只有在 Singleton 內使用。
    }

    public static Singleton getInstance() {
        if (sInstance == null) {
            sInstance = new Singleton();
        } 
        return sInstance;
    }
}
