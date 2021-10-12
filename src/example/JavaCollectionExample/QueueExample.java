package example.JavaCollectionExample;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Queue:
 *  - 把資料加入queue的動作稱為 enqueue
 *  - 把資料取得queue的動作稱為 dequeue
 * 
 * Reference:
 *  - https://beginnersbook.com/2017/08/queue-interface-in-java-collections/
 *  - https://beginnersbook.com/java-collections-tutorials/
 */
public class QueueExample {   
    public static void main(String[] args) {
        LinkedListQueueExample lq = new LinkedListQueueExample();
        lq.run();
    }

    public void BasicQueueExample() {
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

/**
 * 
 *          ----------
 *         |  Queue   |
 *          ----------
 *          ＾       ＾
 *          |        |
 *         /          \ 
 *        /             \
 *  ----------          -------------
 * |LinkedList|        |PriorityQueue|
 *  ----------          -------------
 */
class LinkedListQueueExample {
    public void run() {
        Queue<String> q1 = new LinkedList<>();

        q1.add("Rick");
        q1.add("Maggie"); 
        q1.add("Glenn");
        q1.add("Negan");
        q1.add("Daryl");

        q1.forEach(s -> { System.out.println(s); });

        // remove the first element from the Queue.
        q1.remove();
        System.out.println("------");

        q1.forEach(s -> { System.out.println(s); });

        // return head is the first element of Queue.
        System.out.println("element: " + q1.element());

        // this removes and returns the head of the Queue. 
        // Returns null if the Queue is empty.
        System.out.println("poll: " + q1.poll());

        // it works same as element() method,
        // however it returns null if the Queue is empty.
        System.out.println("peek: " + q1.peek());
        
    }
}

class PriorityQueueExample {
    public void run() {
        Queue<String> q2 = new PriorityQueue<>();
    }
}