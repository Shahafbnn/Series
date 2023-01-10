import static org.junit.jupiter.api.Assertions.*;

class DateTest {

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
}