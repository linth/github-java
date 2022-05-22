package designPattern.Singleton.SingleUser;

/**
 * Singleton design pattern - 「雙重檢查上鎖」(double-checked locking)
 * 
 * 上面程式碼是例用 JVM 在載入此類別時，就馬上建立唯一的獨體物件。
 * JVM 保證在任何執行緒存取 sInstance 之前會先建立物件。
 * 但假如在建立物件時需要比較大的 loading 時，此方法也不適用，
 * 因此還可以改為使用「雙重檢查上鎖」(double-checked locking) 的方式：
 * 
 * Reference:
 *  - http://corrupt003-design-pattern.blogspot.com/2016/06/singleton-pattern.html
 */
public class SingletonSecondImp {
    
    // 利用 volatile，可以保證此變數值是一致的。
    private volatile static SingletonSecondImp sInstance;

    private SingletonSecondImp() {

    }

    public static SingletonSecondImp getInstance() {
        // 第一次建立物件才會完整執行此段程式
        if (sInstance == null) {
            synchronized(SingletonSecondImp.class) {
                // 進入同步區後再檢查一次，還是 null 才建立實體。
                if (sInstance == null) {
                    sInstance = new SingletonSecondImp();
                }
            }
        }
        return sInstance;
    }

}
