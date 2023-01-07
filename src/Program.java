import java.sql.Array;
import java.util.*;
public class Program {
    public static Scanner input = new Scanner(System.in);
    public static <T> void N(T is, T should, String func_name){
        System.out.println("Starting tests for " + func_name + "...");
        if((is.toString()).equals(should.toString())) System.out.println("[OK]");
        else {
            System.out.println("[ERROR]: is: " + is + ", when it should be: " + should);
        }
        System.out.println("Ending tests for " + func_name + "...");
    }

    public static int sum1ToN(int n){
        if(n==0) return 0;
        return n + sum1ToN(n-1);
    }

    public static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);
    }

    public static int mulOdd(int n){
        if(n==1) return 1;
        if(n%2!=0) return n * mulOdd(n-2);
        else return mulOdd(n-1);
    }

    public static int sumDigits(int n){
        if(n<10) return n;
        return (n%10) + sumDigits(n/10);
    }

    public static int mod(int n, int m){
        if(m>n) return n;
        return mod(n-m, m);
    }

    public static int mul(int n, int m){
        if(m==0) return 0;
        return n + mul(n, m - 1);
    }

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

    public static int diff(int a, int b){
        if(a == b) return 0;
        return 1 + diff(a, b+1);
    }

    public static int countOddDigits(int num){
        if(num <= 0 ) return 0;
        if(num%2 != 0) return 1 + countOddDigits(num/10);;
        return countOddDigits(num/10);
    }

    public static boolean isDividable(int x, int y){
        if(x-y == 0) return true;
        return isDividable(x-y, y);
    }

    public static int reverseNum(int n){
        if(n<=10) return n;
        int bob = ( ((int)Math.pow(10, (("" + n).length()-1)) ) * (n%10)  + reverseNum(n/10));
        return bob;
    }

    public static int auditDigit(int n){
        if(n < 10) return n;
        int checked = n%10 + auditDigit(n/10);
        if(checked < 10) return checked;
        return auditDigit(checked);
    }

    public static boolean isInNum(int num, int digit){
        if(num%10 == digit) return true;
        if(num <= 0) return false;
        return isInNum(num/10, digit);
    }

    public static boolean isPrime(int n){
        if(n==0||n==1) return false;
        return isPrime(n, 2);
    }

    public static boolean isPrime(int n, int counter){
        if(n > counter) return false;
        if(n%counter == 0) return true;
        return isPrime(n, counter+1);
    }

    public static boolean sameDuality(int n){
        if(n < 10) return true;
        return sameDuality(n/10) == ((n%2==0) == ((n/10)%2==0));
    }

    public static int totalEars(int n){
        if(n<=0) return 0;
        if(n%2==0) return totalEars(n-1) + 3;
        return totalEars(n-1) + 2;
    }

    public static int numOfBlocks(int row){
        if(row <= 1) return 1;
        return row + numOfBlocks(row-1);
    }

    public static double seriesSumSqrt(int n){
        if(n<=1) return 1.0;
        if(n%2==0) return seriesSumSqrt(n-1) - Math.sqrt(n+n-1);
        return seriesSumSqrt(n-1) + n + n-1;
    }

    public static int seriesSumPow(int n){
        if(n<=1) return 2;
        if(n%2==0) return seriesSumPow(n-1) + (int)Math.pow(n,2);
        return seriesSumPow(n-1) + n*2;
    }

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

    public static int minDiff(int n){
        if(n<100) return Math.abs(n%10 - n/10%10);
        if(minDiff(n/10) < Math.abs(n%10 - n/10%10)) return minDiff(n/10);
        return Math.abs(n%10 - n/10%10);
    }

    public static boolean pairDigits(int n){
        if(n<100) return n%10 == n/10%10;
        if(n%10 == n/10%10 || pairDigits(n/10)) return true;
        return false;
    }

    public static boolean digitInNum(int n, int digit){
        if(n<10) return n == digit;
        if(digitInNum(n/10, digit) || n%10 == digit) return true;
        return false;
    }

    public static boolean isSameLength(int n, int m){
        if(n==0 && m==0) return true;
        if(n!=0 && m==0) return false;
        if(n==0 && m!=0) return false;
        return isSameLength(n/10, m/10);
    }

    public static boolean noNumInside(int n, int m){
        if(n<100) return n==m;
        if(n%100 == m || noNumInside(n/10, m)) return true;
        return false;
    }

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


    public static String printNode(IntNode chain){
        IntNode pos = chain;
        String str = "";
        while(pos != null){
            str = str + pos.toString();
            pos = pos.getNext();
        }
        return str;
    }
    public static int maxVal(IntNode chain){
        int max = Integer.MIN_VALUE;
        IntNode pos = chain;
        while(pos != null){
            if(pos.getValue()>max) max = pos.getValue();
            pos = pos.getNext();
        }
        return max;
    }
    public static double avarageList(IntNode chain){
        int avarage = 0;
        IntNode pos = chain;
        double i = 0;
        while(pos != null){
            i+= 1;
            avarage = avarage + pos.getValue();
            pos = pos.getNext();
        }
        if(i==0) return 0;
        return ((double)avarage/i);

    }

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
        N(isPrime(21), false, "isPrime");
        N(sameDuality(35917), true, "sameDuality");
        N(totalEars(2), 5, "totalEars");
        N(numOfBlocks(6), 21, "numOfBlocks");
        N(seriesSumSqrt(2), -0.7320508075688772, "seriesSumSqrt");
        N(seriesSumPow(3), 12, "seriesSumPow");
        N(minDigit(546173), 1, "minDigit");

    }

    public static void intNodeTests(){
        IntNode IN1 = new IntNode(3);
        IntNode IN2 = new IntNode(1, IN1);
        IntNode IN3 = new IntNode(5, IN2);
        IntNode IN4 = new IntNode(2, IN3);
        N(maxVal(IN4), 5, "maxVal");
        N(avarageList(IN4), 2.75, "avarageList");
        N("" + IntListUsefulMethods.build1toNList(10), "1-->2-->3-->4-->5-->6-->7-->8-->9-->10-->null", "IntListUsefulMethods.build1toNList");
        N("" + IntListUsefulMethods.build1toNListReverse(10), "10-->9-->8-->7-->6-->5-->4-->3-->2-->1-->null", "IntListUsefulMethods.build1toNListReverse");
        N("" + IntListUsefulMethods.build1toNListReverseRec(10), "10-->9-->8-->7-->6-->5-->4-->3-->2-->1-->null", "IntListUsefulMethods.build1toNListReverseRec");
        N("" + IntListUsefulMethods.buildSequentialList(3,6), "3-->4-->5-->6-->null", "IntListUsefulMethods.buildSequentialList");
        N("" + IntListUsefulMethods.buildIntListFromString("1,2,3,4,5"), "1-->2-->3-->4-->5-->null", "IntListUsefulMethods.buildIntListFromString");
        N(IntListUsefulMethods.count(IN4), 4, "IntListUsefulMethods.count");
        N(IntListUsefulMethods.sumRec(IN4), 11, "IntListUsefulMethods.sumRec");
        IntListUsefulMethods.printListRec(IN4);
        N(IntListUsefulMethods.lastMember(IN4), 3, "IntListUsefulMethods.lastMember");
        N(IntListUsefulMethods.lastMemberRec(IN4), 3, "IntListUsefulMethods.lastMemberRec");
        N(IntListUsefulMethods.countEvenNodes(IN4), 1, "IntListUsefulMethods.countEvenNodes");
        IntListUsefulMethods.printBiggerPrec(IN4);
        System.out.println("\n");
        N(IntListUsefulMethods.listAvg(IN4), 2.75, "IntListUsefulMethods.listAvg");
        IntNode INc = new IntNode(3);
        IntNode INb = new IntNode(-6, INc);
        IntNode INa = new IntNode(12, INb);
        IntNode list = new IntNode(-2, INa);
        System.out.println("List Before: " + list);
        System.out.println("List After: " + IntListUsefulMethods.removeNegative(list));
        N("" + IntListUsefulMethods.removeNegative(list), "2-->2-->null", "IntListUsefulMethods.removeNegative");


    }

    public static void cubeTests(){
        Cube c1 = new Cube();
        Cube c2 = new Cube(15, "Red");
        Cube c3 = new Cube(c2);
        N(c2.getColor(), "Red", "Cube.getColor()");
        N(c2.getLength(), 15, "Cube.getLength()");
        N(c2.getVolume(), 3375, "Cube.getLength()");
        N(c2.getSurface(), 225, "Cube.getSurface()");



    }

    public static void StackTests(){}

    public static Node<Integer> KToEnd(Node<Integer> ls, int k){
        Node<Integer> last = ls;
        Node<Integer> bigger = null;
        while(last.getNext() != null){
            if(last.getNext().getValue() > k && bigger == null) bigger = last;
            else last = last.getNext();
        }
        if(bigger != null){
            bigger.setNext(bigger.getNext().getNext());
            bigger.getNext().setNext(null);
            last.setNext(bigger);
        }

        return ls;
    }

    public class Range{
        private int low;
        private int high;

        public Range(int low, int high){
            this.low = low;
            this.high = high;
        }
        public int getLow(){return this.low;}
        public void setLow(int low){this.low = low;}
        public int getHigh(){return this.high;}
        public void setHigh(int high){this.high = high;}
    }

    private static boolean inRange(Range r, int n){
        return n >= r.getLow() && n <= r.getHigh();
    }

    public static class BiList{
        private Node<Integer> lst1;
        private Node<Integer> lst2;

        public BiList(){
            this.lst1 = null;
            this.lst2 = null;
        }

        public Node<Integer> getLst1(){return this.lst1;}
        public void setLst1(Node<Integer> lst1){this.lst1 = lst1;}
        public Node<Integer> geLst2(){return this.lst2;}
        public void setLst2(Node<Integer> lst2){this.lst2 = lst2;}
    }
    public Node<Integer> sort(Node<Integer> list){
        Node<Integer> last = list;
        int n;
        while(last.getNext() != null){
            if(last.getValue() > last.getNext().getValue()) {
                n = last.getNext().getValue();
                last.getNext().setValue(last.getValue());
                last.setValue(n);
            }
            last = last.getNext();
        }
        return list;
    }

    public BiList generateBilist(Node<Integer> lst){
        Node<Integer> sorted = sort(lst);
        Node<Integer> first = new Node<Integer>(sorted.getValue());
        Node<Integer> last = first;
        BiList bilist = new BiList();
        for(int i = 0; i < NodeMethods.length(sorted)/2; i++){
            last.setNext(sorted.getNext());
            last = last.getNext();
            sorted = sorted.getNext();
        }
        bilist.setLst1(first);

        first = new Node<Integer>(sorted.getValue());
        for(int i = 0; i < NodeMethods.length(sorted)/2; i++){
            last.setNext(sorted.getNext());
            last = last.getNext();
            sorted = sorted.getNext();
        }
        bilist.setLst2(first);
        return bilist;
    }

    public static BiList generateBiListMenny(Node<Integer> lst){ // i didnt finish it
        int n = NodeMethods.length(lst);
        BiList bi = new BiList();
        for(int i = 0; i < n; i++){
            if(n/2 == 69420){ // not really
                n = n * 420;//not really
            }
        }
        return null;//not really
    }

    public static boolean isIncluded(Node<Integer> list1, Node<Range> list2){
        Node<Integer> ptr1 = list1;
        Node<Range> ptr2 = list2;
        while(ptr1 != null && ptr2 != null){
            if(inRange(ptr2.getValue(), ptr1.getValue())) ptr1 = ptr1.getNext();
            else ptr2 = ptr2.getNext();
        }
        return ptr1 == null;
    }

    public static void NodeTests(){
        Node<String> list = null;
        Node<Integer> Node4 = new Node<Integer>(3);
        Node<Integer> Node3 = new Node<Integer>(1, Node4);
        Node<Integer> Node2 = new Node<Integer>(5, Node3);
        Node<Integer> Node1 = new Node<Integer>(2, Node2);
        N(NodeMethods.length(Node1), 4, "NodeMethods.length");
    }

    public static void main(String[] args) {
        //recTests();
        //intNodeTests();
        //cubeTests();
        //NodeTests();


//        N( findChar("Hello", 'o', 0), true, "findChar");
//        N(reverse("Hello", 0), "olleH", "reverse");
//        System.out.println("alphaBetRange: ");
//        alphaBetRange('a', 'd');
//        N(expand("Hello"), "Heelllo", "expand");
//        System.out.println("triangle_Q6:");
//        triangle_Q6(5);
//        double[] arr = {3,8,7,4,5,4,4};
//        N(countHills(arr), 2, "countHills");
//        int[] arr1 = {-1,8,-5,0,-6,4,4};
//        N(countNeg(arr1, arr1.length), 3, "countNeg");
//        int[][] arr2 = {
//                {6, 1, 6},
//                {6, 6, 6, 6},
//                {6,2}};
//        N(countPrimeNums(arr2), 3, "countPrimeNums");

        }
    }
