package game.concrete;

/**
 * override 覆寫則是相同名稱方法/相同返回值
 * overload
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1260454256258656
 */

import game.abs.Person;

public final class Man extends Person {
    // 使用final class將無法讓其他class繼承下去
    
    public Man() {

    }

    public Man(String n, int b) {
        super(n, b);
    }

    @Override
    public void showHello() {
        System.out.println("This is Man showHello()...");
    }

    public void show() {
        System.out.println("Do not any input argument for show()...");
    }

    public void show(String s) {
        // Overload.
        System.out.println("Have input argument: (string) " + s + " for show()...");
    }
    
    public void show(int a) {
        // Overload.
        System.out.println("Have input argument: (int) " + a + " for show()...");
    }
}
