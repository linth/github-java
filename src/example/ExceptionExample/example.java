package example.ExceptionExample;

/**
 * Error exception.
 * 
 * TODO: Next issues: What kinds of exception for java or list them?
 * 
 * Reference:
 *  - https://www.liaoxuefeng.com/wiki/1252599548343744/1264734349295520
 */
public class example {
    public static void main(String[] args) {
        int number = 10;
        int zero = 0;

        try {
            // example ex = new example();            
            // System.out.println("the result: " + ex.process());
            // the same.
            System.out.println("the result: " + division(number, zero));            
        } catch (BaseException e) {
            System.out.println("base exceptiion: " + e);
        } catch (ArithmeticException e) {
            System.out.println("defined error. error message: " + e);
        } catch (Exception e) {
            System.out.println("general error. " + e);
        } finally {
            System.out.println("ending the process.");
        }

        try {
            division2(10, 0);
        } catch(NrBaseException e) {
            System.out.println("NrBaseException Error Information: " + e + "; Error Message: " + e.message);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public int process() {
        int molecular = 10; int Denominator = 0;
        return division(molecular, Denominator);
    }

    public static int division(int molecular, int Denominator) {
        return molecular / Denominator;
    } 

    public static int division2(int molecular, int Denominator) {
        // we defined a new custom exception to show it.
        throw new NrDataException("data exception");
    } 
}
