import org.junit.jupiter.api.Test;
import unit4.collectionsLib.BinNode;

import static org.junit.jupiter.api.Assertions.*;

class BinTreeMethodsTest {
    Object expected;
    Object actual;

    @org.junit.jupiter.api.Test
    void numOfDays() {
        Date d1 = new Date(7, 2, 2022);
        Date d2 = new Date(8, 1, 2023);
        actual = d1.numOfDays(d2);
        expected = 360 - 30 + 1;
        assertEquals(expected, actual);
    }

    @Test
    void countNodes() {
    }

    @Test
    void countLeaves() {
    }

    @Test
    void treeHeight() {
    }

    @Test
    void countRightChildren() {
    }

    @Test
    void countEqualChildren() {
    }

    @Test
    void countLessThanParent() {
    }

    @Test
    void testCountLessThanParent() {
    }

    @Test
    void countNum() {
    }

    @Test
    void nodesInLevel() {
    }

    @Test
    void grandpaSum() {
    }

    @Test
    void sumLevel() {
    }

    @Test
    void sumNegative() {
    }

    @Test
    void findMax() {
    }

    @Test
    void isExist() {
    }

    @Test
    void isSumTree() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void contains() {
    }

    @Test
    void isAscending() {
    }

    @Test
    void printOdd() {
    }

    @Test
    void printNegative() {
    }

    @Test
    void isLeaf() {
    }

    @Test
    void printLeftLeaves() {
    }

    @Test
    void printMoreThanChild() {
    }

    @Test
    void printNodesInLevel() {
    }

    @Test
    void onePath() {
    }

    @Test
    void isRightLeft() {
    }

    @Test
    void testContains() {
    }

    @Test
    void common() {
    }

    @Test
    void check() {
    }

    @Test
    void wordFromRoot() {
    }

    @Test
    void printAll1() {
    }

    @Test
    void printAll() {
    }

    @Test
    void isRightLeft2() {
        BinNode<Integer> n1 = new BinNode<Integer>(1);
        actual = BinTreeMethods.isRightLeft2(n1);
        expected = true;
        assertEquals(expected, actual);
    }
}