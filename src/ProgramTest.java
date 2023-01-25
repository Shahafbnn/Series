import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    Object expected;
    Object actual;

    @org.junit.jupiter.api.Test
    void sum1ToN() {
        actual = Recursive.sum1ToN(5);
        expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        actual = Recursive.factorial(6);
        expected = 720;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mulOdd() {
        actual = Recursive.mulOdd(5);
        expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumDigits() {
        actual = Recursive.sumDigits(1234);
        expected = 10;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mod() {
        actual = Recursive.mod(5, 4);
        expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mul() {
        actual = Recursive.mul(4, 5);
        expected = 20;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void reverseNum() {
        actual = Recursive.reverseNum(1234);
        expected = 4321;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void diff() {
        actual = Recursive.diff(12, 3);
        expected = 9;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countOddDigits() {
        actual = Recursive.countOddDigits(1742);
        expected = 2;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isDividable() {
        actual = Recursive.isDividable(10, 5);
        expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void auditDigit() {
        actual = Recursive.auditDigit(869419);
        expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isInNum() {
        actual = Recursive.isInNum(80,7);
        expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        actual = Recursive.isPrime(21);
        expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sameDuality() {
        actual = Recursive.sameDuality(35917);
        expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void totalEars() {
        actual = Recursive.totalEars(2);
        expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void numOfBlocks() {
        actual = Recursive.numOfBlocks(6);
        expected = 21;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void seriesSumSqrt() {
        actual = Recursive.seriesSumSqrt(2);
        expected = -0.7320508075688772;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void seriesSumPow() {
        actual = Recursive.seriesSumPow(3);
        expected = 12;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minDigit() {
        actual = Recursive.minDigit(546173);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void minDigitRec() {
        actual = Recursive.minDigitRec(546173);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void minDiff() {
        actual = Recursive.minDiff(19638);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void pairDigits() {
        actual = Recursive.pairDigits(12345);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void digitInNum() {
        actual = Recursive.digitInNum(12342, 3);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isSameLength() {
        actual = Recursive.isSameLength(13421, 98567);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void noNumInside() {
        actual = Recursive.noNumInside(1981 , 19);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void is2Power() {
        actual = Recursive.is2Power(1025);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isSortedDigits() {
        actual = Recursive.isSortedDigits(1234);
        expected = true;
        assertEquals(expected, actual);
    }
}