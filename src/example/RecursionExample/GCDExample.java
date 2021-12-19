package example.RecursionExample;

import java.util.Scanner;

/**
 * 最大公因數 (GCD): 介紹遞迴的原理
 *  - 遞迴 (Recursive) 是程式中包含自我呼叫 (self-calling)
 * 
 * TODO: Recursive 和 Iterative 的比較?
 * 
 * Recursive 的優缺
 *  - 優：程式碼較為精簡、區域 (暫存) 變數較少、佔用的儲存空間較少
 *  - 缺：程式執行的時間較長、較無效率、需要額外的 Stack 支持
 * 
 * Iterative 的優缺
 *  - 優：程式執行的時間較短 (不用額外處理 push/pop)、不需額外的 Stack 支持
 *  - 缺：程式碼較冗長、區域 (暫存) 變數較少、佔用的儲存空間較大
 * 
 * Reference:
 *  - https://kopu.chat/2017/08/19/%E9%81%9E%E8%BF%B4-recursive-%E4%BB%8B%E7%B4%B9%E8%88%87%E7%B6%93%E5%85%B8%E9%A1%8C%E5%9E%8B/
 */
public class GCDExample {
    public static void main(String[] args) {
        int a, b, result;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type two intger numbers:");

            System.out.println("first numbers:");
            a = scanner.nextInt();
            System.out.println("second numbers:");
            b = scanner.nextInt();
        }

        System.out.println(a + "; " + b);
        result = gcd(a, b);
        System.out.println("the result: " + result);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a%b);
        }
    }
}
