import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueMethodsTest {

    Object actual;
    Object expected;

    @Test
    void length() {

    }

    @Test
    void lenR() {
    }

    @Test
    void testLenR() {
    }

    @Test
    void isSorted() {
    }

    @Test
    void isIdentical() {
    }

    @Test
    void isSimilar() {
    }

    @Test
    void toNumber() {
    }

    @Test
    void bigNumber() {
    }

    @Test
    void maxValue() {
    }

    @Test
    void search() {
    }

    @Test
    void searchRec() {
    }

    @Test
    void testSearchRec() {
    }

    @Test
    void specialPairs() {
    }

    @Test
    void sort() {
        Queue<Integer> q = new Queue<>();
        q.insert(6);
        q.insert(1);
        q.insert(3);
        q.insert(8);
        q.insert(9);
        q.insert(2);
        QueueMethods.sort(q);

        actual = q.toString();
        expected = "[1, 2, 3, 6, 8, 9]";
        assertEquals(expected, actual);

    }
}