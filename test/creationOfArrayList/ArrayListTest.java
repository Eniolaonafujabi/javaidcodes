package creationOfArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    public void testThatTheArrayListIsEmpty() {
        MyArrayList list = new MyArrayList();
        assertTrue(list.arrayListIsEmpty());
    }
    @Test
    public void testThatTheArrayListCanAdd_andSizeIsOne() {
        MyArrayList list = new MyArrayList();
        assertTrue(list.arrayListIsEmpty());
        list.add("t");
        assertEquals(1, list.size());
    }
    @Test
    public void testThatTheArrayListCanAdd_andCheckTheElement() {
        MyArrayList list = new MyArrayList();
        list.add("t");
        assertEquals(list.get(0),"t");
    }
    @Test
    public void testThatTheArrayListCanAdd_andCheckTheLastElement() {
        MyArrayList list = new MyArrayList();
        list.add("t");
        list.add("l");
        assertEquals(list.get(0),"t");
    }
    @Test
    public void testThatTheArrayListCanAdd_andGetElement() {
        MyArrayList list = new MyArrayList();
        list.add("t");
        list.add("l");
        assertEquals(list.get(1),"l");
    }
}