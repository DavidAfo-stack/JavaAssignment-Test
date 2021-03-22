import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectListTest {
    private ObjectList objectList;
    private Object obj1, obj2, obj3;

    @BeforeEach
    void setUp() {
        /**
         * create object list and add objects to the list
         */
        objectList = new ObjectList(3);
        objectList.add(obj1);
        objectList.add(obj2);
        objectList.add(obj3);
    }

    @AfterEach
    void tearDown() {
        objectList = null;
    }
    /**
     * this tests for the isEmpty method in the object list class
     */
    @Test
    void isEmpty() {
        assertFalse(objectList.isEmpty());
    }
    /**
     * this tests for the isFull method in the object list class
     */
    @Test
    void isFull() {
        assertTrue(objectList.isFull());
    }
    /**
     * this tests for the getTotal method in the object list class
     */
    @Test
    void getTotal() {
        assertEquals(3, objectList.getTotal());
    }
    /**
     * this tests for the remove method in the object list class
     */
    @Test
    void remove() {
        assertTrue(objectList.remove(3));
    }
}