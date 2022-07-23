/**
 * multi-catch example from Bruce Eckel.
 * 
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://OnJava8.com for more book information.
 * 
 * Reference:
 *  - https://github.com/BruceEckel/OnJava8-Examples/blob/master/exceptions/MultiCatch.java
 */

package example.ExceptionExample.exceptions;

public class MultiCatch {
    
    void x() throws Except1, Except2, Except3, Except4 {}
    void process() {}
    void f() {
        try {
            x();
        } catch(Except1 | Except2 | Except3 | Except4 e) {
            process();
        }
    }
}
