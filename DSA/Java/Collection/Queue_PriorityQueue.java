import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue
{
    public static void main(String[] argv)
    {
        // default behavior ->  Integer ->less value ->high priority->minHeap
        //maxHeap (a,b)->b-a
        
        Queue<Integer> pq =  new PriorityQueue<>((a,b)->b-a);
        
        pq.offer(21);
        pq.offer(11);
        pq.offer(51);

        System.err.println(pq);
        System.err.println(pq.poll());
        System.err.println(pq);

    
    }

}