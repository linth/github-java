package example.ExceptionExample;

import java.util.Scanner;

/**
 * Three errors:
 *  - syntax error
 *  - semantic error
 *  - runtime error
 */
public class SimpleExceptionExample {
    public static void main(String[] args) {
        SimpleExceptionExample s = new SimpleExceptionExample();
        // s.TypingErrorInput();

        ErrorExceptionExample eee = new ErrorExceptionExample();
        // eee.NullExample();
        // eee.NotNumberExample();
        eee.OutOfRangeExample();
    }

    public void divisionIsZero() {
        // 除數為0的異常
        System.out.println("result: " + division(6, 2));
        System.out.println("result: " + division(8, 0));
        System.out.println("result: " + division(9, 4));
    }

    public void TypingErrorInput() {
        // 輸入錯誤異常
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the random number: ");
        x = scanner.nextInt();

        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int division(int x, int y) {
        return x / y;
    }
}

/**
 * NullPointerException
 * NumberFormatException
 * StringIndexOutOfBoundsException
 */
class ErrorExceptionExample {
    public void NullExample() {
        String s = null;
        System.out.println(s.length());
    }

    public void NotNumberExample() {
        String s = "Taipei";
        int x = Integer.parseInt(s);
    }

    public void OutOfRangeExample() {
        String s = "JJ";
        char c = s.charAt(3);
    }
}

/**
 * Throwable 異常類別
 *  - Error類別
 *  - Exception類別
 */

/**
 * Error類別
 *  - OutOfMemoryError
 *  - VirtualMachineError
 *  - StackOverflowError
 */

/**
 * Exception類別
 *  - Unchecked Exception 非檢查異常
 *      - 異常皆是發生在runtime階段
 *  - Checked Exception 檢查異常
 *      - runtime階段意外的異常，如：IOException, SQLException, ..., etc.
 */

/**
 * 所有異常的 parents class: Throwable
 *  - String getMessage()
 *  - String toString()
 *  - void printStackTrace()
 */