package task1;

import java.util.ArrayList;
import java.util.List;

import static task1.InsertType.*;

/**
 * Created by ANTON on 17.10.2016.
 */
public class MyArrayList {

    private List<Integer> myList = new ArrayList<Integer>();

    public MyArrayList() {
        for (int i = 1; i <= 10; i++) {
            myList.add(i);
        }
    }

    public void add(int index, Integer element) {
        if (index > myList.size() - 1) {
            throw new IndexOutOfBoundsException("ERROR: Index exceeds number of elements in arrayList");
        }

        for (int i = 0; i < myList.size(); i++) {
            myList.set(i, myList.get(i) + element);
        }
        myList.add(index, element);
    }

    public void add(Integer element, InsertType type) {
        if (type.equals(BEGIN)) {
            if (!myList.isEmpty()) {
                myList.add(0, element);
                for (int i = 1; i < myList.size(); i++) {
                    myList.set(i, element + myList.get(i));
                }
            }
        } else if (type.equals(END)) {
            myList.add(element);
            for (int i = 0; i < myList.size() - 1; i++) {
                myList.set(i, element + myList.get(i));
            }
        }
    }

    public void remove(int index) {
        if (index > myList.size() - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int myValue = myList.get(index);
            myList.remove(index);
            for (int i = 0; i < myList.size(); i++) {
                myList.set(i, myList.get(i) - myValue);
            }
        }
    }

    public void remove(Integer value) throws Exception {
        if (!myList.contains(value)) {
            throw new Exception("Element '" + value + "' doesn't exist");
        } else {
            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i) == value) {
                    myList.remove(i);
                } else {
                    myList.set(i, myList.get(i) - value);
                }
            }
        }
    }

    public int get(int index) {
        if (index > myList.size() - 1) {
            throw new IndexOutOfBoundsException("ERROR: Index exceeds number of elements in arrayList");
        }
        return myList.get(index);
    }

    public int size() {
        return myList.size();
    }

    public void print() {
        myList.stream().forEach(p -> System.out.println(p));
    }
}
