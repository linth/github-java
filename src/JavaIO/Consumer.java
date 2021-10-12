package JavaIO;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

public class Consumer {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Consumer");

        try{
            Socket socket = new Socket("127.0.0.1",8080);
            socket.getOutputStream().write("向服务器发数据".getBytes());
            socket.close();
        } catch(IOException e) {
            logger.warning(e.toString());
        }
    }
}
