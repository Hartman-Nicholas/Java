import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {


    @Test
    void getTime () {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        list.get(9999);
        long elapsedNanos = System.nanoTime() - startTime;
        System.out.println(elapsedNanos);

    }

    @Test
    void add() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        String expected = "ArrayList(1,2,3)";
        assertEquals(expected, list.toString());

    }

    @Test
    void get_EmptyList() throws ArrayIndexOutOfBoundsException {
        ArrayList list = new ArrayList();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> list.get(2));
    }

    @Test
    void get_OutOfBounds() throws ArrayIndexOutOfBoundsException {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> list.get(3));
    }
    @Test
    void get() throws ArrayIndexOutOfBoundsException {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        int expected = 3;
        assertEquals(expected, list.get(2));
    }

    @Test
    void getSize() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        int expected = 3;
        assertEquals(expected, list.getSize());
    }

    @Test
    void getSize_Empty() {
        ArrayList list = new ArrayList();
        int expected = 0;
        assertEquals(expected, list.getSize());
    }

    @Test
    void remove() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        String expected = "ArrayList(1,3)";
        assertEquals(expected, list.toString());

    }

    @Test
    void remove_EmptyList() {
        ArrayList list = new ArrayList();
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> list.remove(0));
    }

    @Test
    void remove_OutOfBounds() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> list.remove(4));
    }


    @Test
    void find() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        int expected = 2;
        assertEquals(expected, list.find(3));
    }

    @Test
    void find_NotFound() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        int expected = -1;
        assertEquals(expected, list.find(5));
    }

    @Test
    void find_EmptyList() {
        ArrayList list = new ArrayList();
        int expected = -1;
        assertEquals(expected, list.find(5));
    }

    @Test
    void subList() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        String expected = "ArrayList(3,4,5,6)";

        assertEquals(expected, list.subList(2,5).toString());

    }

    @Test
    void subList_SameIndex() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        String expected = "ArrayList(3)";

        assertEquals(expected, list.subList(2,2).toString());

    }

    @Test
    void subList_OutOfBounds() throws ArrayIndexOutOfBoundsException{
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> list.subList(4,10));
    }

    @Test
    void testToString() {
        ArrayList list = new ArrayList();


        String expected = "ArrayList()";
        assertEquals(expected, list.toString());
    }
}