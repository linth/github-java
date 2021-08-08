package example.InterfaceExample;

import java.util.List;

public class InterfaceExtendExample {
    public static void main(String[] args) {
        
    }
}

/**
 * Reference:
 *  - https://matthung0807.blogspot.com/2017/12/java-serviceinterface.html
 */
class UserInfo {

}

class UserController {
    private UserService userService;

    public List<UserInfo> queryUser() {
        return this.queryFromDatabase();
    }

    public List<UserInfo> queryFromXml() {
        return userService.queryFromXml();  // xml.
    }

    public List<UserInfo> queryFromDatabase() {
        return userService.queryFromDatabase(); // DB.
    }

    public List<UserInfo> queryFromJSON() {
        return userService.queryFromJSON(); // JSON.
    }
}

class UserService {
    public List<UserInfo> queryFromXml() {
        // search from xml.
    }

    public List<UserInfo> queryFromDatabase() {
        // search from DB.
    }

    public List<UserInfo> queryFromJSON() {
        // search from JSON.
    }
}


/**
 * Using the Interface class.
 */
interface UserService2 {
    public List<UserInfo> query();
}

class UserServiceXmlImpl implements UserService2 {
    @Override
    public List<UserInfo> query() {
        // from xml.
    }
}

class UserServiceDatabaseImpl implements UserService2 {
    @Override
    public List<UserInfo> query() {
        // from DB.
    }
}
 
class UserServiceJSONImpl implements UserService2 {
    @Override
    public List<UserInfo> query() {
        // from JSON.
    }
}

class UserController2 {
    private UserService userService;

    public List<UserInfo> queryUser() {
        return userService.query();
    }    
}