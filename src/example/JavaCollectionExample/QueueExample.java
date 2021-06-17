package example.JavaCollectionExample;

import java.util.LinkedList;

/**
 * Queue:
 *  - 把資料加入queue的動作稱為 enqueue
 *  - 把資料取得queue的動作稱為 dequeue
 */
public class QueueExample {   
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i=10; i<=50; i+=10) {
            queue.add(i);
            System.out.println("queue: " + queue);
        }

        int loop = queue.size();

        for (int i=1; i<=loop; i++) {
            System.out.println("dequeue: index = [" + i + "] " + queue.removeFirst());
            System.out.println("queue: " + queue);
        }
    }
}
