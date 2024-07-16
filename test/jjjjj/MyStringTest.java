package jjjjj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {
    @Test
    public void     test() {
        MyString myString = new MyString('a', 'b', 'c');
        assertEquals(myString,new MyString('a', 'b', 'c'))                                  ;
    }
}