public class Recursive {
    public static <T> void N(T is, T should, String func_name){
        System.out.println("Starting tests for " + func_name + "...");
        if((is.toString()).equals(should.toString())) System.out.println("[OK]");
        else {
            System.out.println("[ERROR]: is: " + is + ", when it should be: " + should);
        }
        System.out.println("Ending tests for " + func_name + "...");
    }

    //Receives a non-negative integer n, and returns the sum of the numbers from 1 to n.
    public static int sum1ToN(int n){
        if(n==0) return 0;
        return n + sum1ToN(n-1);
    }

    //Receives a non-negative integer n, and returns the value n.
    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    //Receives a non-negative integer n and returns the product of all odd numbers from 1 up to it.
    public static int mulOdd(int n){
        if(n==1) return 1;
        if(n%2!=0) return n * mulOdd(n-2);
        else return mulOdd(n-1);
    }

    //Receives a non-negative integer n, and returns the sum of its digits.
    public static int sumDigits(int n){
        if(n<10) return n;
        return (n%10) + sumDigits(n/10);
    }

    //Receives two positive integers, m, n, and returns the remainder of division between them.
    public static int mod(int n, int m){
        if(m>n) return n;
        return mod(n-m, m);
    }

    //Receives two positive integers, m, n, and returns the result of their multiplication.
    public static int mul(int n, int m){
        if(m==0) return 0;
        return n + mul(n, m - 1);
    }

    //Receives two positive integers, m, n, and returns the integer result
    public static int div(int n, int m){
        if(n==0) return 0;
        return n;
    }

    public static int nthItemInSeries(int a1, int d, int n){
        if(n!=1){
            return d + nthItemInSeries(a1, d, n - 1);
        }
        else return a1;

    }

    //Receives two positive integers, a, b, and returns the diff between them. a >= b.
    public static int diff(int a, int b){
        if(a == b) return 0;
        return 1 + diff(a, b+1);
    }

    //Receives a positive integer, num, and returns the number of odd digits in it.
    public static int countOddDigits(int num){
        if(num <= 0 ) return 0;
        if(num%2 != 0) return 1 + countOddDigits(num/10);;
        return countOddDigits(num/10);
    }

    //Given two positive integers, x, y
    //and returns true if y is a multiple of x. Otherwise, false will be returned.
    public static boolean isDividable(int x, int y){
        if(x-y == 0) return true;
        return isDividable(x-y, y);
    }


    public static int reverseNum(int n){
        if(n<=10) return n;
        int bob = ( ((int)Math.pow(10, (("" + n).length()-1)) ) * (n%10)  + reverseNum(n/10));
        return bob;
    }

    //receives a positive integer n. returns the Bikoret digit of the number.
    public static int auditDigit(int n){
        if(n < 10) return n;
        int checked = n%10 + auditDigit(n/10);
        if(checked < 10) return checked;
        return auditDigit(checked);
    }

    //Receives a natural number, num and a digit, digit. The operation will return true if the digit is in num. Otherwise, the operation will return false.
    public static boolean isInNum(int num, int digit){
        if(num%10 == digit) return true;
        if(num <= 0) return false;
        return isInNum(num/10, digit);
    }

    //Receives a non-negative integer n, and returns true if the number is prime. Otherwise, the action will return false.
    public static boolean isPrime(int n){
        if(n==0||n==1) return false;
        return isPrime(n, 2);
    }

    public static boolean isPrime(int n, int counter){
        if(counter >= n) return true;
        if(n%counter == 0) return false;
        return isPrime(n, counter+1);
    }

    //Receives a non-negative integer n and returns true if all even digits of the number are the same. Otherwise, the action will return false.
    public static boolean sameDuality(int n){
        if(n < 10) return true;
        return sameDuality(n/10) == ((n%2==0) == ((n/10)%2==0));
    }

    //Receives a non-negative integer n and returns the total number of ears in the rabbit hole.
    public static int totalEars(int n){
        if(n<=0) return 0;
        if(n%2==0) return totalEars(n-1) + 3;
        return totalEars(n-1) + 2;
    }

    //Receives a non-negative number row, which represents the number of rows in which the triangle was built. The operation will return the amount of stones required to build the triangle.
    public static int numOfBlocks(int row){
        if(row <= 1) return 1;
        return row + numOfBlocks(row-1);
    }

    //Receives a non-negative integer n and returns the sum of the first n terms in the series
    public static double seriesSumSqrt(int n){
        if(n<=1) return 1.0;
        if(n%2==0) return seriesSumSqrt(n-1) - Math.sqrt(n+n-1);
        return seriesSumSqrt(n-1) + n + n-1;
    }

    //Receives a non-negative integer n and returns the sum of the first n terms in the series
    public static int seriesSumPow(int n){
        if(n<=1) return 2;
        if(n%2==0) return seriesSumPow(n-1) + (int)Math.pow(n,2);
        return seriesSumPow(n-1) + n*2;
    }

    //receives a non-negative integer n. returns the minimum digit in the number.
    public static int minDigit(int n){
        int smallest = n%10;
        while(n > 10){
            n = n/10;
            if(n%10 < smallest) smallest = n%10;
        }
        return smallest;
    }

    public static int minDigitRec(int n){
        if(n < 10) return n;
        int min = minDigitRec(n/10);
        if(min < n%10) return min;
        return n%10;
    }

    //receives a non-negative integer n. The operation will return the minimum digit difference between a pair of adjacent digits in a number
    public static int minDiff(int n){
        if(n<100) return Math.abs(n%10 - n/10%10);
        if(minDiff(n/10) < Math.abs(n%10 - n/10%10)) return minDiff(n/10);
        return Math.abs(n%10 - n/10%10);
    }

    //Accepts a non-negative integer n and returns true if there is a pair of identical contiguous digits in the number. Otherwise, the action will return false.
    public static boolean pairDigits(int n){
        if(n<100) return n%10 == n/10%10;
        if(n%10 == n/10%10 || pairDigits(n/10)) return true;
        return false;
    }

    //Accepts a non-negative integer n and the number digit (an integer) and returns true if digit appears in number n. Otherwise, the action will return false.
    public static boolean digitInNum(int n, int digit){
        if(n<10) return n == digit;
        if(digitInNum(n/10, digit) || n%10 == digit) return true;
        return false;
    }

    //Receives two numbers m,n and returns true if the number of digits in both numbers is the same. Otherwise, the action will return false.
    public static boolean isSameLength(int n, int m){
        if(n==0 && m==0) return true;
        if(n!=0 && m==0) return false;
        if(n==0 && m!=0) return false;
        return isSameLength(n/10, m/10);
    }

    //receives two natural ints, m,n. returns true if the number m is in sequence at number n. It is assumed that the number m is
    public static boolean noNumInside(int n, int m){
        if(n<100) return n==m;
        if(n%100 == m || noNumInside(n/10, m)) return true;
        return false;
    }

    //receives a natural number n. The operation will return true if the value of n is a power of 2. Otherwise, the operation will return false
    public static boolean is2Power(int n){
        if(n==1) return true;
        return is2Power(n,n);
    }

    public static boolean is2Power(int n, int m){
        if(m<=0) return false;
        if(m*m == n || is2Power(n, m-1))return true;
        else if(m*m != n) return false;
        return is2Power(n, m-1);
    }

    //receives a natural int n. returns true if all the digits of the number are sorted in ascending order.
    public static boolean isSortedDigits(int n){
        if(n<100) return (n/10 < n%10);
        return (isSortedDigits(n/10) && n/10%10 < n%10);
    }

    // The answers we did in class:
    /*



    public static int sumDigits(int n){
        if(n==0) return 0;
        return 1 + sumDigits(n/10);
    }



    public static int numDigits(int n){
        if(n==0) return 0;
        return n % 10 + numDigits(n/10);
    }

    public static int reverseNum2(int n){
        int reverse = 0;
        while(n>0){
            reverse = reverse * 10 + 10 % 10;
            n /= 10;
        }
        return reverse;
    }



    public static int reverseNumLiam(int n){
        if (n < 10) return n;
        else return reverseNumLiam(n/10) + n%10 * (int)Math.pow(10, numDigits(n) - 1);
    }

    public static int reverseNum(int n){
        return reverseNum(n, 0);
    }

    public static int reverseNum(int n, int reverse){
        if(n==0) return reverse;
        return reverseNum(n/10, reverse*10 + n%10);

    }

    public static boolean isInNum(int num, int digit){
        if(num==0)return false;
        else if(num%10 * 10 == digit) return true;
        else return isInNum(num/10, digit);
    }

    public static boolean sameDuality(int n){
        if (n < 10) return true;
        if (n % 2 != n/10%2) return false;
        return sameDuality(n/10);
    }

    public static int seriesSumPow(int n){
        if(n==0) return 0;
        boolean even;
        if(n%2==0){
            return n * n + seriesSumPow(n-1);
        }
        else return n * 2 + seriesSumPow(n-1);
    }
    public static int minDigit(int n){
        if (n < 10) return n;
        if ( n%10 < ((n/10)%10) ) return n%10;
        else return minDigit(n/10);
    }

    public static void printRangeDown(int n){
        if(n!=0){
            System.out.print(n + " ");
            printRangeDown(n-1);
        }
        else System.out.println(); // this line is not needed, used esthetically.
    }

    public static void printRangeUp(int n){
        if(n!=0){
            printRangeUp(n-1);
            System.out.print(n + " ");
        }
    }
    */

    /*
    public static boolean findChar(String st, char letter, int i){
        if(i < st.length()){
            if(st.charAt(i) == letter) return true;
            return findChar(st, letter, i + 1);
        }
        return false;

    }

    public static String reverse(String st, int i){
        if(i<st.length()){
            return("" + reverse(st, i+1) + st.charAt(i));
        }
        else return "";
    }
    public static String reverse(String st){
        if(st.length() == 0) return "";
        return st.charAt(st.length() - 1) + reverse(st.substring(0, st.length() - 1));
    }

    public static void alphaBetRange(char ch1, char ch2){
        if(ch1>=ch2) System.out.print(ch1);
        else {
            System.out.print(ch1 + " ");
            alphaBetRange((char) (ch1 + 1), ch2);
        }
    }

    public static String expand(String st){
        if(st.length() <= 1) return st;
        return ("" + st.charAt(0) + st.charAt(1) + st.charAt(1) + expand(st.substring(2)));
    }

    public static String expand2(String st){
        return expand2(st, 1, "");
    }

    public static String expand2(String st, int i, String expanded){
        if(i >= st.length()) return expanded;
        if(i == st.length() -1)  return expanded + st.charAt(i);
        return expand2(st, i + 2, expanded + st.charAt(i-1) + st.charAt(i) + st.charAt(i));

    }

    public static void triangle_Q6(int n){
        if(n==0) System.out.println("");
        else {
            System.out.println("*".repeat(n));
            triangle_Q6(n - 1);
        }
    }

    public static boolean isPrime(int n){
        return isPrime(n,2);
    }

    public static boolean isPrime(int n, int i){
        if(i>Math.sqrt(n)) return true;
        if(n%i==0) return false;
        return isPrime(n, i+1);
    }

    public static int sumPrime(int[] arr, int i){
        if(i==arr.length) return 0;
        if(isPrime(arr[i])) return arr[i] + sumPrime(arr, i+1);
        return sumPrime(arr, i+1);
    }

    public static int countHills(double[] arr){
        if(arr.length<3) return 0;
        double[] arr1 = new double[arr.length-1];
        for(int j = 0; j < arr.length-1; j++){
            arr1[j] = arr[j+1];
        }
        if(arr[1]>arr[0] && arr[1]>arr[2]){
            return 1 + countHills(arr1);
        }
        return countHills(arr1);

    }

//    public static int maxInArr2(int[] arr, int len){
//        // i decided that len will be the max number's location in the arr
//        if(arr.length==1) return arr[0];
//        if(arr.length == len) len = 0;
//        if(arr[arr.length-1] > len){}
//    }
//    public static int maxInArr3(int[] arr, int len){
//        if(arr.length==1) return arr[0];
//        if(arr[0] > arr[1]){}
//        int[] arr1 = new int[arr.length-1];
//        for(int j = 0; j < arr.length-1; j++){
//            if(j==0) arr1[0] = arr[0];
//            else arr1[j] = arr[j+1];
//        }
//    }

    public static int maxInArr(int[] arr, int len){
        if(len==1) return arr[0];
        return Math.max(arr[len-1], maxInArr(arr, len-1));
    }

    public static int countNeg(int[] arr, int len){
        if(len <= 0) return 0;
        if(arr[len-1] < 0) return 1 + countNeg(arr, len-2);
        return countNeg(arr, len-2);
    }


    public static int countPrimeNums(int[][] arr){
        return countPrimeNums(arr, 0, 0);
    }

        public static int countPrimeNums(int[][] arr, int x, int y){
        if(y >= arr.length-1) return 0;
        if(x >= arr[y].length-1) {
            y = y+1;
            x = 0;
        }
        if(isPrime(arr[y][x])) return 1 + countPrimeNums(arr, x+1, y);
        return countPrimeNums(arr, x+1, y);


    }


     */




    public static void recTests(){
        N(sum1ToN(5), 15, "sum1ToN");
        N(factorial(6), 720, "factorial");
        N(mulOdd(5), 15, "mulOdd");
        N(sumDigits(1234), 10, "sumDigits");
        N(mod(5, 4), 1, "mod");
        N(mul(4, 5), 20, "mul");
        N(reverseNum(1234), 4321, "reverseNum");
        int[] a = {-5, -5};
        N(diff(12, 3), 9, "diff");
        N(countOddDigits(1742), 2, "countOddDigits");
        N(isDividable(10, 5), true, "isDividable");
        N(reverseNum(1234), 4321, "reverseNum");
        N(auditDigit(869419), 1, "auditDigit");
        N(isInNum(80,7), false, "isInNum");
        N(isPrime(11), true, "isPrime");
        N(isPrime(8), false, "isPrime");
        N(isPrime(9), false, "isPrime");
        N(sameDuality(35917), true, "sameDuality");
        N(totalEars(2), 5, "totalEars");
        N(numOfBlocks(6), 21, "numOfBlocks");
        N(seriesSumSqrt(2), -0.7320508075688772, "seriesSumSqrt");
        N(seriesSumPow(3), 12, "seriesSumPow");
        N(minDigit(546173), 1, "minDigit");
    }

    public static void main(String[] args) {
        recTests();
    }
}
