package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void searchTest()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        int search = list.search(10);
        assertEquals(search,2);

    }

    @Test
    void getTest()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
       Object get = list.get(0);
       assertEquals(get , 5);

    }

    @Test
    void sizeTest()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
       int size = list.size();
      assertEquals(size , 3);

    }



}
