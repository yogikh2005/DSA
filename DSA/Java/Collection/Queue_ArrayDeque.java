
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_ArrayDeque
{
    public static void main(String[] args) {
        
        Deque<Integer> queue = new ArrayDeque<>();
        
        queue.offer(11);
        queue.offerFirst(21);
        queue.offerLast(51);

        System.out.println(queue);

        queue.pollLast();
        System.out.println(queue);

        queue.pollFirst();

        System.out.println(queue);

        System.out.println(queue.size());

        System.err.println(queue.peek());
        System.err.println(queue.peekFirst());
        System.err.println(queue.peekLast());
        
    }
}
