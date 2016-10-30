package task2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ANTON on 30.10.2016.
 */
public class MyQueueTest {

    int capacity = 3;
    MyQueue<Integer> myQueue = new MyQueue<>(capacity);

    @Test
    public void offerTest1() throws Exception {
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        assertTrue(myQueue.peek() == 4);
    }

    @Test
    public void offerTest2() throws Exception {
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        assertTrue(myQueue.element() == 2);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void pollTest1() throws Exception {
       myQueue.poll();
    }

    @Test
    public void pollTest2() throws Exception {
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.poll();
        assertTrue(myQueue.size()== 1);
    }

    @Test
    public void clear() throws Exception {
        myQueue.offer(1);
        myQueue.offer(1);
        myQueue.offer(1);
        myQueue.offer(1);

        myQueue.clear();

        assertTrue(myQueue.size()==0);
    }

}