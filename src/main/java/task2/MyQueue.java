package task2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by ANTON on 29.10.2016.
 */
public class MyQueue<E> implements Queue<E> {

    private int num = 0;
    private int capacity;

    private Object[] elements;
    private static final int MIN_INITIAL_CAPACITY = 8;

    public MyQueue() {
        elements = new Object[MIN_INITIAL_CAPACITY];
        capacity = MIN_INITIAL_CAPACITY;
    }

    public MyQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public void print() {
        if (elements == null) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("========================================");
    }


    @Override
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException();
        }

        if (num <= capacity - 1) {
            elements[num] = e;
            num++;
        } else {
            for (int i = 0; i < capacity - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[capacity - 1] = e;
        }
        return false;
    }


    @Override
    public E poll() {
        if(num==0){
            throw new IndexOutOfBoundsException("Queue is empty - nothing to delete");
        }
        E temp;
        Object[] newArray = new Object[capacity - 1];
        temp = (E) elements[0];
        for (int i = 0; i < capacity - 1; i++) {
            newArray[i] = elements[i + 1];
        }
        elements = newArray;
        num--;
        return temp;
    }


    @Override
    public void clear() {
        elements = null;
        num = 0;
    }

    @Override
    public E peek() {
        if (num == 0) {
            System.out.println("Queue is empty");
        }
        return (E) elements[num-1];
    }


    @Override
    public E element() {
        if (num == 0) {
            System.out.println("Queue is empty");
        }
        return (E) elements[0];
    }


    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int size() {
        return num;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

}
