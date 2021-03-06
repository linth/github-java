/**
 * AlwayFinally example from Bruce Eckel.
 * 
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://OnJava8.com for more book information.
 * 
 * Reference:
 *  - https://github.com/BruceEckel/OnJava8-Examples/blob/master/exceptions/AlwaysFinally.java
 */
package example.ExceptionExample.exceptions;

class FourException extends Exception {}

public class AlwaysFinally {
    
    public static void main(String[] args) {
        
        System.out.println("Entering first try block");

        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}

/* Output:
Entering first try block
Entering second try block
finally in 2nd try block
Caught FourException in 1st try block
finally in 1st try block
*/