/**
 * AutoCloseable
 * 
 * An object that may hold resources (such as file or socket handles) 
 * until it is closed. The close() method of an AutoCloseable object 
 * is called automatically when exiting a try-with-resources block for 
 * which the object has been declared in the resource specification header. 
 * 
 * This construction ensures prompt release, avoiding resource exhaustion 
 * exceptions and errors that may otherwise occur.
 * 
 * Reference:
 *  - https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html
 */
package example.ExceptionExample.exceptions;


class Reporter implements AutoCloseable {

    String name = getClass().getSimpleName();

    Reporter() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}


class First extends Reporter {}
class Second extends Reporter {}


public class AutoCloseableDetails {
    public static void main(String[] args) {
        try (
            First f = new First();
            Second s = new Second();
        ) {
            
        }
    }
}

/* Output:
 
Creating First
Creating Second
Closing Second 
Closing First

 */

// TODO: 使用 autocloseable 有什麼作用?  執行完馬上釋放資源?