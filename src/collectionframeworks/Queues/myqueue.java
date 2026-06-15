package collectionframeworks.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class myqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
        q.offer(4);
        q.offer(5);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        System.out.println(q.poll());
        System.out.println(q.peek());
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.peek());
    }
}
