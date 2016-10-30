package task2;

import java.util.Iterator;
import java.util.Queue;

/**
 * Created by ANTON on 30.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        MyQueue <Integer> queue = new MyQueue<>(5);

        queue.poll();

        queue.offer(1);
        queue.offer(2);

        System.out.println(queue.peek());
        System.out.println(queue.size());

        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        queue.print();


        queue.print();
        queue.clear();
        queue.print();
    }
}
