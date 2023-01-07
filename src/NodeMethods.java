import java.util.*;
public class NodeMethods {
    public static Scanner input = new Scanner(System.in);

    public static Node <String> createList(){
        Node<String> list = new Node<String>(null);
        Node<String> last = list;
        System.out.println("Enter a string: ");
        String s = input.next();
        while(!s.equals("STOP")){
            Node<String> p = new Node<String>(s);
            last.setNext(p);
            last = last.getNext();
            System.out.println("Enter a string: (type STOP to stop)");
            s = input.next();
        }
        return list.getNext();
    }
    public static <T> int length(Node<T> list){
        int i = 0;
        Node<T> last = list;
        while(list.getNext() != null){
            last = last.getNext();
            i++;
        }
        return i;
    }
    public static int isNumSequentialNumbers(Node<Integer> list){
        final int LIST_LENGTH = length(list);
        int i;
        Node<Integer> last = list;
        int[] arr = new int[LIST_LENGTH];
        for(int y = 0; y < arr.length; y++){
            arr[y] = 0;
        }

        for(i = 0; i < LIST_LENGTH; i++){
            while(last.getNext() != null){
                if(last.getValue() == i) arr[i] += last.getValue();
                last = last.getNext();
            }
        }
        for(int n:arr){
            if(n != 1) return -1;
        }
        return LIST_LENGTH;
    }

    public static IntNode removeNegative(IntNode list) {
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


    public static void removeSequencesOfIdenticalNumbers(Node<Integer> list){
        if(list != null){
            Node<Integer> ptr = list;
            while(ptr.getNext() != null){
                Node<Integer> next = ptr.getNext();
                if(ptr.getValue() == next.getValue()){ //remove next
                    ptr.setNext(next.getNext());
                    next.setNext(null);
                }
                else ptr = ptr.getNext();
            }
        }
    }

    public static boolean contains(Node<Integer> list, int num){
        if(list == null) return false;
        if(list.getValue() == num) return true;
        return contains(list.getNext(), num);
    }

    public static <T> boolean contains(Node<T> list, T value) {
        if (list == null) return false;
        if (value == null) return false;
        if (list.getValue().equals(value)) return true;
        return contains(list.getNext(), value);
    }

    public static Node<Integer> listsUnion(Node<Integer> list1, Node<Integer> list2){
        Node<Integer> ptr2 = list2;
        Node<Integer> inter = new Node<Integer>(0); //dummy node
        Node<Integer> last = inter;

        while(ptr2 != null){
            if(contains(list1, ptr2.getValue())){
                if(!contains(inter, ptr2.getValue())){
                    last.setNext(new Node<Integer>(ptr2.getValue()));
                    last = last.getNext();
                }
            }
            ptr2 = ptr2.getNext();
        }
        return inter.getNext();
    }

    public static Node<Integer> intersection(Node<Integer> list1, Node<Integer> list2){
        //list1 and list2 are sorted without repeats
        Node<Integer> ptr1 = list1, ptr2 = list2;
        Node<Integer> inter = new Node<Integer>(0); //dummy node
        Node<Integer> last = inter;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.getValue() == ptr2.getValue()){
                last.setNext(new Node<Integer>(ptr1.getValue()));
                last = last.getNext();
                ptr1 = ptr1.getNext();
                ptr2 = ptr2.getNext();
            }
            else if(ptr1.getValue() < ptr2.getValue()) ptr1 = ptr1.getNext();
            else ptr2 = ptr2.getNext();
        }
        return inter.getNext();
    }


}
