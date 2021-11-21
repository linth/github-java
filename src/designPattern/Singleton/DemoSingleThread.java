package designPattern.Singleton;

/**
 * Singleton 單例模式 + single thread 範例
 * 
 * Reference:
 *  - https://refactoringguru.cn/design-patterns/singleton/java/example
 */
public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + 
        "\n" + "If you see different values, then 2 singletons were created (booo!!)" + 
        "\n\n" + "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
