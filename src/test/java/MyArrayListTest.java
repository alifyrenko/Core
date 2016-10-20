import org.junit.Before;
import org.junit.Test;
import task1.InsertType;
import task1.MyArrayList;

import static org.junit.Assert.*;

/**
 * Created by ANTON on 18.10.2016.
 */

public class MyArrayListTest {

    MyArrayList myArrayList;
    int size;

    @Before
    public void init() {
        myArrayList = new MyArrayList();
        size = myArrayList.size();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAdd() throws Exception {
        myArrayList.add(10,5);
    }

    @Test
    public void testAdd1() throws Exception {
        myArrayList.add(3,5);
        assertTrue(myArrayList.get(3) == 5);
        assertTrue(myArrayList.get(0) == 6);
        assertTrue(myArrayList.size() == size+1);
    }

    @Test
    public void testAdd2() throws Exception {
        myArrayList.add(10, InsertType.BEGIN);
        assertTrue(myArrayList.get(0)==10);
        assertTrue(myArrayList.get(2)==12);
        assertTrue(myArrayList.size() == size+1);
    }

    @Test
    public void testRemove() throws Exception {
        myArrayList.remove((Integer) 4);
        assertTrue(myArrayList.get(0)==-3);
        assertTrue(myArrayList.size() == size-1);
    }

    @Test
    public void testRemove1() throws Exception {
        myArrayList.remove(5);
        assertTrue(myArrayList.get(0)==-5);
        assertTrue(myArrayList.size() == size-1);
    }


}