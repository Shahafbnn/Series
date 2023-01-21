import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueMethodsTest {
    Object expected;
    Object actual;

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
    void isSquence() {
    }

    @Test
    void countSequence() {
    }

    @Test
    void reverseQ() {
        Queue<Integer> q1 = Main.makeQueue(12345);
        Queue<Integer> q2 = Main.makeQueue(54321);

        actual = QueueMethods.reverseQ(q1).toString();
        expected = q2.toString();
        assertEquals(expected, actual);
    }

    @Test
    void merge() {
        Queue<Integer> q1 = Main.makeQueue(13579);
        Queue<Integer> q2 = Main.makeQueue(12456);

        actual = QueueMethods.merge(q1, q2).toString();
        expected = Main.makeQueue(12345679).toString();
        assertEquals(expected, actual);
    }

    @Test
    void movePos() {
        Queue<Integer> q1 = Main.makeQueue(new int[] {-6, -3, 2, 11, -7, 8, 9});
        Queue<Integer> q2 = Main.makeQueue(new int[] {-6, -3, -7, 8, 9, 2, 11});
        QueueMethods.movePos(q1);
        actual = q1.toString();
        expected = "[-7, 8, 9, -6, -3, 2, 11]";
        assertEquals(expected, actual);
    }

    @Test
    void mergeFAILED() {
    }

    @Test
    void movePosFAILED() {
    }

    @Test
    void createSeries() {
        Queue<Integer> q1 = Main.makeQueue(13579);
        actual = QueueMethods.createSeries(q1).toString();
        expected = "a0=1, d=2, size=5";
        assertEquals(expected, actual);
    }
}