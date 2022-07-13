package example.DataTypeExample;

import java.io.Console;

public class BaseExample {
    private float height = 178.3f; // 32位元 （-3.4e+38 ~ 3.4e+38）
    private float weight = 77.12F;
    
    private double numberDouble = 5.222222222d; // 64位元 （-1.79e+308 ~ 1.79e+308）
    private double avergeNumber = 2.55;

    private int math = 99;
    private char engWord = 'a';

    private boolean isBoy = false;

    private String description = "Hi, my name is George.";

    private final double PI = 3.14159; // 不能改變內容

    public static void main(String[] args) {
        System.out.println("hello");
    }
}


