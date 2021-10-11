package example.JavaCollectionExample;

import java.util.LinkedList;

/**
 * Stack class
 * 
 * Reference:
 *  - https://www.geeksforgeeks.org/stack-class-in-java/
 *  - https://beginnersbook.com/java-collections-tutorials/
 */
public class StackExample {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();

        for(int i=10; i<100; i+=10) {
            stack.addLast(i);
            System.out.println("stack: " + stack);
        }

        int loop = stack.size();

        for(int i=1; i<=loop; i++) {
            System.out.println(stack.removeLast());
            System.out.println("stack: " + stack);
        }
    }
}
