public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<Integer>(1);
        LinkedList<Integer> p = new LinkedList<Integer>(2);
        LinkedList<Integer> tail = new LinkedList<Integer>(3);
        head.setNext(p);
        p.setPrev(head);
        p.setNext(tail);
        tail.setPrev(p);
        System.out.println(head);
        System.out.println("buildNumber(head) = " + buildNumber(head));
        System.out.println("getNextest(head).getValue() = " + getNextest(head).getValue());
        System.out.println("getPrevest(tail).getValue() = " + getPrevest(tail).getValue());
        System.out.println("buildReverseNumber2(head) = " + buildReverseNumber2(head));
        System.out.println("buildReverseNumber(head) = " + buildReverseNumber(head));
        System.out.println("buildDecimalNumber(head) = " + buildDecimalNumber(head));
    }

    public static int buildNumber(LinkedList<Integer> list) {
        // @param a two directional int list. assumption: all values represent a digit
        // @return an int number based on the list list
        // null<-1-><-2-><-3->null -> 123
        // n = the length of list, O(n) because we go over list once here.
        LinkedList<Integer> ptr = list;
        int num = 0;
        while(ptr != null){
            num = num * 10 + ptr.getValue();
            ptr = ptr.getNext();
        }
        return num;
    }

    public static <T> LinkedList<T> getNextest(LinkedList<T> list){
        if(!list.hasNext()) return list;
        return getNextest(list.getNext());
    }
    public static <T> LinkedList<T> getPrevest(LinkedList<T> list){
        if(!list.hasPrev()) return list;
        return getPrevest(list.getPrev());
    }

    public static int buildReverseNumber2(LinkedList<Integer> list) {
        // @param a two directional int list. assumption: all values represent a digit
        // @return an int number based on the list list
        // null<-1-><-2-><-3->null -> 123
        // n = the length of list, O(n) because we go over list once here.
        if(list==null) return 0;
        return buildReverseNumber2(list.getNext())*10 + list.getValue();
    }
    public static int buildReverseNumber(LinkedList<Integer> list){
        // @param a two directional int list. assumption: all values represent a digit
        // @return a reversed int number based on the bi list
        // null<-1-><-2-><-3->null -> 321
        // n = length of list, O(n) because we go over list once here.
        if(list == null) return 0;
        return buildReverseNumber(list, 0);
    }

    public static int buildReverseNumber(LinkedList<Integer> list, int count){
        // @param a two directional int list. assumption: all values represent a digit
        // @param int count
        // @return a reversed int number based on the bi list
        if(list == null) return 0;
        return list.getValue()*(int)(Math.pow(10, (double)count)) + buildReverseNumber(list.getNext(), count + 1);
    }



    public static LinkedList<Integer> buildDecimalNumber(LinkedList<Integer> list){
        // @param a two directional int list. assumption: all values represent a digit
        // @return a two directional int list represents a binary value of the decimal number which list represents
        // n = the length of list, O(2n) = O(n) because we go over list once in the buildNumber and once here.
        int num = buildNumber(list);
        LinkedList<Integer> binNum = new LinkedList<Integer>(null);
        LinkedList<Integer> ptr = binNum;
        while(num!=0){
            ptr.setPrev(new LinkedList<Integer>((num%2==0)?0:1));
            ptr.getPrev().setNext(ptr);
            ptr = ptr.getPrev();
            num = num/2;
        }
        binNum.getPrev().setNext(null);
        binNum.setPrev(null);
        return ptr;
    }

    

}

