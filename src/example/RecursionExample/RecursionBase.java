package example.RecursionExample;

import java.util.Scanner;

/**
 * Recursion 範例
 * 
 * Reference:
 *  - https://openhome.cc/Gossip/JavaGossip-V1/RecursionMethod.htm
 */
public class RecursionBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入兩個數字:");

        System.out.println("m = ");
        int m = scanner.nextInt();
        System.out.println("n = ");
        int n = scanner.nextInt();
        System.out.println("GCD: " + gcd(m, n));
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
