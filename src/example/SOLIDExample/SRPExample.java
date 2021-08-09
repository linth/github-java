package example.SOLIDExample;

import example.IoCExample.User;

/**
 * Single reponsibility principle.
 * 單一原則：確保每個class只專注做一件事情
 * 
 * Reference:
 *  - https://www.edureka.co/blog/solid-principles-in-java/
 */
public class SRPExample {
    public static void main(String[] args) {
        
    }
}

/**
 * An example to clarify this principle:
 * Suppose you are asked to implement a UserSetting service wherein the user 
 * can change the settings but before that the user has to be authenticated. 
 * One way to implement this would be:
 */
class UserSettingService {
    public void changeEmail(User user) {
        if (SecurityService.checkAccess(user)) {
            // grant option to change.
        }
    }
}

class SecurityService {
    static boolean checkAccess(User user) {
        // check the access.
        return true;
    }
}