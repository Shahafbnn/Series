import java.util.Scanner;
public class IntListUsefulMethods {
    public static Scanner scnr = new Scanner(System.in);

    public static IntNode getListInput(){
        System.out.println("Please Enter a number:");
        IntNode last = new IntNode(scnr.nextInt());

        for(int i = 0; i < 3; i++){

            System.out.println("Please Enter a number:" + "(" + i + "out of 4)");
            last = new IntNode(scnr.nextInt(), last);
        }
        return last;
    }

    public static IntNode build1toNList(int num){
        IntNode last = null;
        for(int i = num; i > 0; i--){
            last = new IntNode(i, last);
        }
        return last;
    }


    public static IntNode build1toNListReverse(int num){
        IntNode last = new IntNode(1);
        for(int i = 2; i <= num; i++){
            last = new IntNode(i, last);
        }
        return last;

    }

    public static IntNode build1toNListReverseRec(int num){
        if(num==0) return null;
        return new IntNode(num, build1toNListReverseRec(num-1));
    }

    public static IntNode buildSequentialList(int n1, int n2){
        IntNode last = null;
        for(int i = n2; i >= n1; i--){
            last = new IntNode(i, last);
        }
        return last;
    }

    public static IntNode buildIntListFromString(String s){
        String[] parts = s.split(",");
        IntNode node = new IntNode(Integer.parseInt(parts[0]));
        IntNode last = null;
        for(int i = parts.length - 1; i >= 0; i--){
            last = new IntNode(Integer.parseInt(parts[i]), last);
        }
        return last;
    }

    public static int count(IntNode IN){
        if(IN.getNext() == null) return 1;
        return 1 + count(IN.getNext());
    }

    public static int sumRec(IntNode IN){
        if(IN.getNext() == null) return IN.getValue();
        return IN.getValue() + sumRec(IN.getNext());
    }

    public static void printListRec(IntNode IN){ //Used overloading.
        printListRec(IN, true);
    }

    public static void printListRec(IntNode IN, boolean started){
        if(started) {
            System.out.print("[" + IN.getValue() + ",");
            printListRec(IN.getNext(), false);
            return;
        }
        if(IN.getNext() == null){
            System.out.print(IN.getValue() + "]" + "\n");
            return;

        }
        System.out.print("" + IN.getValue() + ",");
        printListRec(IN.getNext(), false);
        return;

    }

    public static IntNode removeNum(IntNode list, int num){
        list = new IntNode(0,list); //adding a dummy node...
        IntNode ptr = list;
        boolean found = false;
        IntNode p = ptr.getNext();;
        while(ptr.getNext() != null && !found){
            p = ptr.getNext();
            if(p.getValue() == num) found = true;
            else ptr = ptr.getNext();
        }

        if(found){
            ptr.setNext(p.getNext());
            p.setNext(null);
            return list.getNext();
        }

        return null;
    }

    public static IntNode removeNegative(IntNode list){
        IntNode last = list;
        while(last != null){
            if(last.getValue() < 0) list = removeNum(list, last.getValue());
            last = last.getNext();
        }
        return list;
    }

    public static IntNode removeNegativeMenny(IntNode list) {
        list = new IntNode(0, list);
        IntNode ptr = list, next;
        while (ptr.getNext() != null) {
            next = ptr.getNext();
            if (next.getValue() < 0) {
                ptr.setNext(next.getNext());
                next.setNext(null);
            }
            else {
                ptr = next;
            }
        }
        return list.getNext();
    }

    public static int lastMember(IntNode IN){
        IntNode last = IN;
        while(last.getNext() != null){
            last = last.getNext();
        }
        return last.getValue();
    }
    public static int lastMemberRec(IntNode IN){
        if(IN.getNext() == null) return IN.getValue();
        return lastMemberRec(IN.getNext());
    }

    public static int countEvenNodes(IntNode IN){
        if(IN.getNext() == null){
            if(IN.getValue()%2==0) return 1;
            return 0;
        }
        if(IN.getValue()%2==0) return 1 + countEvenNodes(IN.getNext());
        return countEvenNodes(IN.getNext());
    }

    public static void printBiggerPrec(IntNode IN){
        if(IN.getNext() == null) return;
        if(IN.getValue() > IN.getNext().getValue()){
            System.out.print(IN.getValue());
            printBiggerPrec(IN.getNext());
            return;
            }
        printBiggerPrec(IN.getNext());
        return;
    }

    public static double listAvg(IntNode IN){
        IntNode last = IN;
        double av= 0;
        int i = 0;
        while(last != null){
            i++;
            av = av + last.getValue();
            last = last.getNext();
        }
        return av/i;
    }








    public static IntNode revList(){
        IntNode list = null;
        System.out.println("Enter a num: ");
        int num = scnr.nextInt();
        while(num!=999){
            list = new IntNode(num, list);
            System.out.println("Enter another num: ");
            num = scnr.nextInt();
        }
        return list;
    }

    public static IntNode revListRecInput(int n){
        if(n==0) return null;
        int num = scnr.nextInt();
        IntNode list = revListRecInput(n-1);
        list = new IntNode(num, list);
        return list;
    }

    public static int maxVal(IntNode list){
        //when yousa not doin a recursive function yousa got to keep a node
        IntNode ptr = list.getNext(); // the getNext is because we assume the list is longer than 1
        IntNode max = list;
        while(ptr != null){
            if(ptr.getValue() > max.getValue()) max = ptr;
            ptr = ptr.getNext();
        }
        return max.getValue();
    }

    public static int maxValRec(IntNode list){
        if(list == null) return Integer.MIN_VALUE;
        return Math.max(list.getValue(), maxValRec(list.getNext()));
    }

    public static IntNode revListRec(int n){ // n is the length of the list
        if(n==0)return null;
        int num = scnr.nextInt();
        return new IntNode(num, revListRec(n-1));
    }

    public static IntNode revListRec2(int n){
        if(n==0) return null;
        int num=scnr.nextInt();
        IntNode list = revListRec2(n-1);
        list = new IntNode(num, list);
        return list;
    }



}
