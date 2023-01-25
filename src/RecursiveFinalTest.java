import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFinalTest {
    Object expected;
    Object actual;
    RecursiveFinal r = new RecursiveFinal();

    @Test
    void findChar() {
        actual = RecursiveFinal.findChar("Hello!", 'e', 0);
        expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void reverse() {
        actual = RecursiveFinal.reverse("Hello", 0);
        expected = "olleH";
        assertEquals(expected, actual);
    }

    @Test
    void reverse2() {
        actual = RecursiveFinal.reverse("Hello", 0);
        expected = "olleH";
        assertEquals(expected, actual);
    }

//    @Test
//    void alphaBetRange() {
//        actual = RecursiveFinal.alphaBetRange('a', 'c');
//        expected = "abc";
//        assertEquals(expected, actual);
//    }

    @Test
    void shrink() {
        actual = RecursiveFinal.shrink("Hello!");
        expected = "el!";
        assertEquals(expected, actual);
    }

    @Test
    void expend() {
        actual = RecursiveFinal.expend("abc");
        expected = "abbc";
        assertEquals(expected, actual);
    }


    @Test
    void triangle_Q6() {
    }

    @Test
    void triangle_Q7() {
    }

    @Test
    void testTriangle_Q7() {
    }

    @Test
    void sumPrime() {
        int[] arr = new int[11];
        for(int i = 0; i < arr.length; i++) arr[i] = i;
        actual = r.sumPrime(arr);
        expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    void countStr() {
        String[] arr = new String[11];
        for(int i = 0; i < arr.length; i++) arr[i] = "*".repeat(i);
        arr[1] = "***";
        arr[5] = "***";
        actual = r.countStr(arr, 3);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void countHills() {
        double[] arr = new double[]{3.4,2.1,4.15,3,99.1,0};
        actual = r.countHills(arr);
        expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void printEvenPos() {
    }

    @Test
    void testPrintEvenPos() {
    }

    @Test
    void printSmallPair() {
    }

    @Test
    void testPrintSmallPair() {
    }

    @Test
    void maxInArr() {
        int[] arr = new int[]{3,2,4,3,99,999};
        actual = RecursiveFinal.maxInArr(arr, arr.length);
        expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    void testMaxInArr() {
    }

    @Test
    void maxInArr2() {
        int[] arr = new int[]{3,2,4,3,99,999};
        actual = RecursiveFinal.maxInArr2(arr, arr.length);
        expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    void isSorted() {
        int[] arr = new int[11];
        for(int i = 0; i < arr.length; i++) arr[i] = i;
        actual = RecursiveFinal.isSorted(arr);
        expected = true;
        assertEquals(expected, actual);
        int[] arr2 = new int[11];
        int n = 0;
        for(int i = arr2.length-1; i > 0; i--) {
            arr2[n] = i;
            n++;
        }
        actual = RecursiveFinal.isSorted(arr2);
        expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void testIsSorted() {
    }

    @Test
    void equalArries() {
        int[] arr1 = new int[11];
        for(int i = 0; i < arr1.length; i++) arr1[i] = i;
        int[] arr2 = new int[11];
        for(int i = 0; i < arr2.length; i++) arr2[i] = i;

        actual = RecursiveFinal.equalArries(arr1, arr2);
        expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void alphaBetRange() {
    }


    @Test
    void search() {
        int[] arr1 = new int[11];
        for(int i = 0; i < arr1.length; i++) arr1[i] = i;
        actual = RecursiveFinal.search(arr1, 2);
        expected = 2;
        assertEquals(expected, actual);

        actual = RecursiveFinal.search(arr1, 13);
        expected = -1;
        assertEquals(expected, actual);

    }

    @Test
    void testSearch() {
    }

    @Test
    void search2() {
        int[] arr1 = new int[11];
        for(int i = 0; i < arr1.length; i++) arr1[i] = i;
        arr1[7] = 2;
        actual = RecursiveFinal.search(arr1, 2);
        expected = 2;
        assertEquals(expected, actual);

        actual = RecursiveFinal.search(arr1, 13);
        expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void testSearch2() {
    }

    @Test
    void search3() {
        String[] arr1 = new String[11];
        for(int i = 0; i < arr1.length; i++) arr1[i] = "" + i;
        arr1[7] = "2";
        actual = RecursiveFinal.search3(arr1, "2");
        expected = 2;
        assertEquals(expected, actual);

        actual = RecursiveFinal.search3(arr1, "13");
        expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void testSearch3() {
    }

    @Test
    void isPlanidrome() {
        int[] arr1 = new int[]{1, 2, 3, 2, 1};
        actual = RecursiveFinal.isPlanidrome(arr1);
        expected = true;
        assertEquals(expected, actual);
        arr1 = new int[]{1, 2, 3, 2};
        actual = RecursiveFinal.isPlanidrome(arr1);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void testIsPlanidrome() {
    }

    @Test
    void isSeries() {
        int[] arr1 = new int[]{1, 2, 3, 4};
        actual = RecursiveFinal.isSeries(arr1);
        expected = true;
        assertEquals(expected, actual);

        arr1 = new int[]{1, 1, 2, 3, 5, 8};
        actual = RecursiveFinal.isSeries(arr1);
        expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void testIsSeries() {
    }

    @Test
    void printMulTable() {
    }

    @Test
    void countPrimeNums() {
        int[][] arr1 = new int[11][10];
        for(int y = 0; y < 11; y ++){
            for(int x = 0; x < 10; x++){
                arr1[y][x] = x;
            }
        }

        actual = RecursiveFinal.countPrimeNums(arr1);
        expected = 16;
        assertEquals(expected, actual);

    }

    @Test
    void testCountPrimeNums() {
    }
}