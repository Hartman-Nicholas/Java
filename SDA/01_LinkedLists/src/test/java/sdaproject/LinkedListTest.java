package sdaproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

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
    void search_FullList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        int expected = 1;
        assertEquals(list.search(7), expected);
    }

    @Test
    void search_EmptyList() {
        LinkedList list = new LinkedList();

        int expected = -1;
        assertEquals(list.search(7), expected);
    }

    @Test
    void search_NotFound() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        int expected = -1;
        assertEquals(list.search(12), expected);
    }

    @Test
    void get_NotFound() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        assertEquals(list.get(12), null);
    }

    @Test
    void get_FullList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        int expected = 10;
        assertEquals(list.get(2).elem, expected);
    }

    @Test
    void get_EmptyList() {
        LinkedList list = new LinkedList();

        assertEquals(list.get(2), null);
    }

    @Test
    void size_FullList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        int expected = 3;
        assertEquals(list.size(), expected);
    }

    @Test
    void size_EmptyList() {
        LinkedList list = new LinkedList();

        int expected = 0;
        assertEquals(list.size(), expected);
    }

    @Test
    void remove_FullListStart() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        String expected = "LinkedList(7,10)";
        boolean remove = list.remove(5);
        assertEquals(expected, list.toString());
        assertTrue(remove);
    }

    @Test
    void remove_FullListEnd() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        String expected = "LinkedList(5,7)";
        boolean remove = list.remove(10);
        assertEquals(expected, list.toString());
        assertTrue(remove);
    }
    @Test
    void remove_FullListMiddle() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        String expected = "LinkedList(5,10)";
        boolean remove = list.remove(7);
        assertEquals(expected, list.toString());
        assertTrue(remove);
    }

    @Test
    void remove_FullListMissing() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);

        String expected = "LinkedList(5,7,10)";
        boolean remove = list.remove(12);
        assertEquals(expected, list.toString());
        assertFalse(remove);
    }

    @Test
    void remove_EmptyList() {
        LinkedList list = new LinkedList();

        String expected = "LinkedList()";
        boolean remove = list.remove(5);
        assertEquals(expected, list.toString());
        assertFalse(remove);
    }

}