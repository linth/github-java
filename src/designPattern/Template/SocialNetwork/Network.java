package designPattern.Template.SocialNetwork;

/**
 * abstract class network.
 * 
 * Reference:
 *  - https://refactoring.guru/design-patterns/template-method/java/example
 * 
 */
public abstract class Network {
    protected String userName;
    protected String password;

    public Network() {

    }

    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            // send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
