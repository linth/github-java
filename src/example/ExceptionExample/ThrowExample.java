package example.ExceptionExample;

public class ThrowExample {
    public static void CheckPassword(String pwd) {
        if (pwd.length()>=5 && pwd.length()<=8) {
            System.out.println("Password is successful: " + pwd);
        } else {
            System.out.println("Password is fail: " + pwd);
            throw new StringIndexOutOfBoundsException("the length of password is not suitable.");
        }
    }

    public static void main(String[] args) {
        String[] pwd = {"123456", "123456789", "1234567"};

        for (int i=0; i<pwd.length; i++) {
            try {
                CheckPassword(pwd[i]);
            } catch (Exception e) {
                System.out.println("Error! " + e.getMessage());
                // e.printStackTrace();
            }
        }
        System.out.println("end of checking password.");
    }
}

/**
 * Throws template example.
 */
class ThrowTemplateExample {
    // 基本架構
    public void commonExample() {
        try {

        } catch (Exception e) {
            // 處理異常
        }
    }

    // 另一種寫法
    public void otherMethodExample() throws ExceptionInInitializerError, Exception {
        // 可能發生異常
    }

    public static void main(String[] args) {
        try {
            ThrowTemplateExample tte = new ThrowTemplateExample();
            tte.otherMethodExample();
        } catch (ExceptionInInitializerError e) {
            // 處理異常
        } catch (Exception e) {
            // 處理異常
        }
    }
}