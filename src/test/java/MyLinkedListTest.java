import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 2/24/17.
 */
public class MyLinkedListTest {

    MyLinkedList<Object> testLinkList;
    Object a, b, c;

    @Before
    public void setUp() {
        testLinkList = new MyLinkedList<>();
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
    }

    @Test
    public void addTest() throws Exception {
        testLinkList.add(a);
        assertEquals(1, testLinkList.size());
    }

    @Test
    public void removeTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        testLinkList.remove(a);
        assertEquals(1, testLinkList.size());
    }

    @Test
    public void containsTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        assertTrue(testLinkList.contains(a));
        assertTrue(testLinkList.contains(b));

    }

    @Test
    public void findTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        testLinkList.add(c);
        assertEquals(1, testLinkList.find(b));
        Object d = new Object();
        assertEquals(-1, testLinkList.find(d));
    }

    @Test
    public void sizeTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        assertEquals(2, testLinkList.size());

        testLinkList.add(c);
        assertEquals(3, testLinkList.size());
    }

    @Test
    public void getTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        testLinkList.add(c);
        assertEquals(b, testLinkList.get(1));
    }

    @Test
    public void copyTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        MyLinkedList<Object> testLinkList2 = testLinkList.copy();
        assertEquals(a, testLinkList2.get(0));
        assertEquals(b, testLinkList2.get(1));

    }

    @Test
    public void sortTest() throws Exception {
        testLinkList.add(c);
        testLinkList.add(b);
        testLinkList.add(a);
        testLinkList.sort();
        assertEquals(a, testLinkList.get(0));
        assertEquals(b, testLinkList.get(1));
        assertEquals(c, testLinkList.get(2));
    }

    @Test
    public void reverseTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(c);
        testLinkList.add(b);
        testLinkList.reverse();
        assertEquals(b, testLinkList.get(0));
        assertEquals(c, testLinkList.get(1));
        assertEquals(a, testLinkList.get(2));
    }

    @Test
    public void sliceTest() throws Exception {
        testLinkList.add(a);
        testLinkList.add(b);
        testLinkList.add(c);
        MyLinkedList<Object> testLinkList2 = testLinkList.slice(0,2);
        assertEquals(a, testLinkList.get(0));
        assertEquals(b, testLinkList.get(1));
    }

}