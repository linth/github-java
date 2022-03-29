package example.CallBackExample;

import java.lang.reflect.Method;

/**
 * Callback function
 * 
 * TODO: need to check this example.
 * 
 * Reference:
 *  - https://zhuanlan.zhihu.com/p/348747542
 */
public class CallBackBase {
    public static void main(String[] args) {
        Request request = new Request();
        System.out.println("[Main] open a thread to async request.");

        new Thread(() -> {
            try {
                request.send(Callback.class, Callback.class.getMethod("processResponse"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println("[Main] done, I will do another thing.");
    }
}


class Request {
    public void send(Class clazz, Method method) throws Exception {
        Thread.sleep(3000);

        System.out.println("received the request.");
        method.invoke(clazz.newInstance());
    }
}

class Callback {
    public void processResponse() {
        System.out.println("call back: deal with the response.");
    }
}