package designPattern.Singleton;

import java.security.cert.PKIXBuilderParameters;

/**
 * Singleton 單例模式範例
 * 
 * Reference:
 *  - https://refactoringguru.cn/design-patterns/singleton/java/example
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
