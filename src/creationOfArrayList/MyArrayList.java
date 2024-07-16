package creationOfArrayList;

import java.util.ArrayList;

public class MyArrayList implements MyList {
    private String element;
    private int size;

    public boolean arrayListIsEmpty() {
        return true;
    }
    public int size() {
        return size;
    }
    public void add(String element) {
        this.element = element;
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(String element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(String element) {
        return false;
    }

    public String get(int index) {
        return element;
    }
    public String get(String element) {
        return element;
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}