public class RecursiveFinal {

    //Accepts a string st and a letter and an index i. The operation will return true if letter is in st.
    // Otherwise, the action will return false.
    public static boolean findChar(String st, char letter, int i){
        if(i < st.length()){
            if(st.charAt(i) == letter) return true;
            return findChar(st, letter, i + 1);
        }
        return false;

    }


    //Accepts string st and index i. The operation will return a string that is the opposite of the received string.
    public static String reverse(String st, int i){
        if(i==st.length()-1) return "" + st.charAt(i);
        return "" + reverse(st, i+1) + "" + st.charAt(i);
    }


    public static String reverse2(String st, int i){
        return reverse2(st, i, "");
    }

    public static String reverse2(String st, int i, String res){
       if(res.length()==st.length()) return res;
       return reverse2(st, i+1, res + st.charAt(i));
    }

    //receives two lowercase letters, ch1, ch2,
    //in the a-z field, and displays all the letters in them, including the edges.
    public static void alphaBetRange(char ch1, char ch2){
        if(ch1>=ch2) System.out.print(ch1);
        else {
            System.out.print(ch1);
            alphaBetRange((char) (ch1 + 1), ch2);
        }
    }

    //Accepts a string, st, and returns a string in which every second letter in the original string is deleted.
    public static String shrink(String s){
        return shrink(s, 0);
    }

    public static String shrink(String s, int i){
        if(i>=s.length()) return "";
        if(i%2==0) return shrink(s, i+1);
        else return s.charAt(i) + shrink(s, i+1);
    }

    //accepts a string, st, and returns a string in which every second letter in the original string is duplicated
    public static String expend(String s){
        return expend(s, 0);
    }
    public static String expend(String s, int n){
        if(n > s.length() - 1) return "";
        if(n==s.length()-1) {
            if((n+1)%2==0) return "" + s.charAt(n) + "" + s.charAt(n);
            return "" + s.charAt(n);
        }

        if((n+1)%2==0) return(s.charAt(n) + "" + s.charAt(n) + expend(s, n+1));
        else return "" + s.charAt(n) + expend(s, n+1);
    }

    public static void triangle_Q6(int n){
        if(n <= 0) return;
        System.out.println("*".repeat(n));
        triangle_Q6(n-1);
    }

    public static void triangle_Q7(int n){
        triangle_Q7(n, 1);
    }

    public static void triangle_Q7(int n, int n2){
        if(n2 >= n) return;
        System.out.println("*".repeat(n2));
        triangle_Q7(n, n2 + 1);
    }

    //Receives an array of numbers of int type arr
    // returns the sum of the initial numbers in the array.
    public int sumPrime(int[] arr){
        if(arr.length == 0) return 0;
        int[] arr2 = new int[arr.length-1];
        for(int i = 0; i < arr.length-1; i++) arr2[i] = arr[i];

        if(Recursive.isPrime(arr[arr.length-1])){
            return arr[arr.length-1] + sumPrime(arr2);
        }
        return sumPrime(arr2);
    }

    //Receives an array of strings words and length len representing a natural number
    //returns the amount of strings of length len that exist in the array.
    public int countStr(String[] words, int len){
        if(words.length == 0) return 0;
        String[] arr2 = new String[words.length-1];
        for(int i = 0; i < words.length-1; i++) arr2[i] = words[i];
        if(words[words.length-1].length() == len){
            return 1 + countStr(arr2, len);
        }
        return countStr(arr2, len);
    }

    //Receives an array of doubles
    //returns the amount of "hills" in the array
    public int countHills(double[] nums){
        if(nums.length < 3) return 0;
        double[] arr2 = new double[nums.length-1];
        for(int i = 0; i < nums.length-1; i++) arr2[i] = nums[i];
        if(nums[nums.length-2] > nums[nums.length-1] && nums[nums.length-2] > nums[nums.length-3]) return 1 + countHills(arr2);
        return countHills(arr2);
    }

    public static void printEvenPos(char[] letters){
        printEvenPos(letters, 0);
    }

    public static void printEvenPos(char[] letters, int i){
        if(i > letters.length) return;
        if(i%2==0) System.out.println(letters[i]);
        printEvenPos(letters, i + 1);
    }

    public static void printSmallPair(int[] arr){
        printSmallPair(arr, 0);
    }

    public static void printSmallPair(int[] arr, int i){
        if(arr[i] > arr[i+1]) System.out.println(arr[i]);
        printSmallPair(arr, i+1);
    }

    //Receives an array of numbers of integer type arr and array size len and returns the maximum value of the array
    public static int maxInArr(int[] arr, int len){
        return maxInArr(arr, len, 0);
    }
    public static int maxInArr(int[] arr, int len, int max){
        if(len<=0) return max;
        //if(len==1) return Math.max(max, arr[len-1]);
        return maxInArr(arr, len-1, Math.max(max, arr[len-1]));

    }

    public static int maxInArr2(int[] arr, int len){
        if(len<=0) return Integer.MIN_VALUE;
        return Math.max(maxInArr2(arr, len-1), arr[len-1]);
    }

    public static boolean isSorted(int[] arr){
        return isSorted(arr, 0);
    }

    //Gets an array of numbers of integer type arr.
    //returns true if the array is sorted in ascending order. Otherwise, returns false.
    public static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1) return true;
        return ( (isSorted(arr, i + 1)) && (arr[i] < arr[i+1]) );
    }

    //Receives two arrays of int type arr1, arr2.
    //returns true if the two arrays are exactly the same. Otherwise, returns false.
    public static boolean equalArries(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;
        return equalArries(arr1, arr2, 0);
    }

    public static boolean equalArries(int[] arr1, int[] arr2, int i){
        if(i>=arr1.length) return true;
        if(arr1[i] != arr2[i]) return false;
        return equalArries(arr1, arr2, i+1);
    }

    //Receives an array of ints arr and an int value x. The operation will return the position of the first value of x in the arr array.
    //if its value does not exist, the operation will return the value -1.
    public static int search(int[] arr, int x){
        return search(arr, x, 0);
    }

    public static int search(int[] arr, int x, int i){
        if(i >= arr.length) return -1;
        if(arr[i]==x) return i;
        return search(arr, x, i+1);
    }

    public static int search2(int[] arr, int x){
        return search2(arr, x, arr.length);
    }

    public static int search2(int[] arr, int x, int i){
        if(i <= 0) return -1;
        if(arr[i]==x) return i;
        return search2(arr, x, i-1);
    }

    public static int search3(String[] arrSt , String st){
        return search3(arrSt, st, 0);
    }

    public static int search3(String[] arr, String x, int i){
        if(i >= arr.length) return -1;
        if(arr[i].equals(x)) return i;
        return search3(arr, x, i+1);
    }

    //Receives an array of digits (0-9) arr.
    //returns true if the array is a palindrome. Otherwise, returns false.
    public static boolean isPlanidrome(int[] arr){
        if(arr.length==1) return true;
        return isPlanidrome(arr, 0, arr.length-1);
    }

    public static boolean isPlanidrome(int[] arr, int left, int right){
        if(left==right) return true;
        if(arr[left] != arr[right]) return false;
        return isPlanidrome(arr, left+1, right-1);
    }

    //Receives an array of ints arr.
    //returns true if the members of the array are from a series. Otherwise, returns false.
    public static boolean isSeries(int[] arr){
        if(arr.length<=1)return false;
        return isSeries(arr,0);
    }

    public static boolean isSeries(int[] arr, int i){
        if(i==arr.length-2) return true;
        return ((arr[i+1] - arr[i]) == (arr[i+2] - arr[i+1])) && isSeries(arr, i+1);
    }

    //Receives two parameters, representing a row number, row, and a column number, col.
    //prints the multiplication table up to 100.
    public static void printMulTable(int row, int col){
        if(col==0) return;
        int temp = col;
        for(; temp < 0; temp--){
            if(temp*row < 100) System.out.println(temp*row);
        }
        printMulTable(row, col-1);
    }

    public static int countPrimeNums(int[][] arr){
        return countPrimeNums(arr,0,0);
    }

    public static int countPrimeNums(int[][] arr, int y, int x){
        if(y >= arr.length) return 0;
        if(x >= arr[y].length) countPrimeNums(arr, y+1, 0);
        System.out.println("y: " + y + ", x: " + x);
        if(Recursive.isPrime(arr[y][x])) return 1 + countPrimeNums(arr, y, x+1);
        return countPrimeNums(arr, y, x+1);
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
        for(int j = 0; j < arr.length-1; j+1){
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
//        for(int j = 0; j < arr.length-1; j+1){
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



}
