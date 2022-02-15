package designPattern.Template.SocialNetwork;

/**
 * Facebook 
 * 
 * Reference:
 *  - https://refactoring.guru/design-patterns/template-method/java/example
 */
public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public boolean logIn(String userName, String password) {
        for (int i=0; i<this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePossted = true;
        if (messagePossted) {
            System.out.println("Message: " + new String(data) + " was posted on Facebook.");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User: " + userName + " was logged out from Facebook.");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while(i<10) {
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
