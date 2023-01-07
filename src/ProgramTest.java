import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {
    Object expected;
    Object actual;

    @org.junit.jupiter.api.Test
    void sum1ToN() {
        actual = Program.sum1ToN(5);
        expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        actual = Program.factorial(6);
        expected = 720;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mulOdd() {
        actual = Program.mulOdd(5);
        expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumDigits() {
        actual = Program.sumDigits(1234);
        expected = 10;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mod() {
        actual = Program.mod(5, 4);
        expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mul() {
        actual = Program.mul(4, 5);
        expected = 20;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void reverseNum() {
        actual = Program.reverseNum(1234);
        expected = 4321;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void diff() {
        actual = Program.diff(12, 3);
        expected = 9;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void countOddDigits() {
        actual = Program.countOddDigits(1742);
        expected = 2;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isDividable() {
        actual = Program.isDividable(10, 5);
        expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void auditDigit() {
        actual = Program.auditDigit(869419);
        expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isInNum() {
        actual = Program.isInNum(80,7);
        expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isPrime() {
        actual = Program.isPrime(21);
        expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sameDuality() {
        actual = Program.sameDuality(35917);
        expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void totalEars() {
        actual = Program.totalEars(2);
        expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void numOfBlocks() {
        actual = Program.numOfBlocks(6);
        expected = 21;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void seriesSumSqrt() {
        actual = Program.seriesSumSqrt(2);
        expected = -0.7320508075688772;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void seriesSumPow() {
        actual = Program.seriesSumPow(3);
        expected = 12;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minDigit() {
        actual = Program.minDigit(546173);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void minDigitRec() {
        actual = Program.minDigitRec(546173);
        expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void minDiff() {
        actual = Program.minDiff(19638);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void pairDigits() {
        actual = Program.pairDigits(12345);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void digitInNum() {
        actual = Program.digitInNum(12342, 3);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isSameLength() {
        actual = Program.isSameLength(13421, 98567);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void noNumInside() {
        actual = Program.noNumInside(1981 , 19);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void is2Power() {
        actual = Program.is2Power(1025);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void isSortedDigits() {
        actual = Program.isSortedDigits(1234);
        expected = true;
        assertEquals(expected, actual);
    }
}