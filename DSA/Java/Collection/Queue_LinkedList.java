
import java.util.LinkedList;
import java.util.Queue;


public class Queue_LinkedList
{
    public static void main(String[] argv)
    {
        Queue<Integer>queue = new LinkedList<>();

        queue.offer(11);
        queue.offer(21);
        queue.offer(51);

        System.out.println(queue);

        System.out.println("Removing "+queue.poll());

        System.out.println(queue);
        
        System.out.println("Peeek "+queue.peek());


    }

}