package designPattern.Template.SocialNetwork;

import designPattern.Template.SocialNetwork.*;
// import designPattern.Template.SocialNetwork.Network;
// import designPattern.Template.SocialNetwork.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Template design pattern example.
 * 
 * Reference:
 *  - https://refactoring.guru/design-patterns/template-method/java/example
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;

        System.out.println("Input user name: ");
        String userName = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        // enter the message.
        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("\n Choose social network for posting message. \n" + "1 - Facebook\n" + "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
