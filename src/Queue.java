public class Queue<T> {
    private Node<T> head; //queue head
    private Node<T> tail; //queue tail
    public Queue(){
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }

    // insert x to end of queue
    public void insert(T x){
        if(isEmpty()) {
            this.head = new Node<T>(x);
            this.tail = head;
        }
        else {
            this.tail.setNext(new Node<T>(x));
            this.tail = this.tail.getNext();
        }
    }

    //return the item at queue top
    public T head(){
        if(!this.isEmpty()) return this.head.getValue();
        else {
            System.out.println("head: The queue is empty, null returned");
            return null;
        }
    }

    //remove item at queue top
    public T remove(){
        if(!isEmpty()){
            Node<T> remove = head;
            head = head.getNext();
            remove.setNext(null);
            return remove.getValue();
        }
        System.out.println("head: The queue is empty, null returned");
        return null;
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        String result = "[";
        Node<T> ptr = head;
        // Going over every value in the Queue.
        while(ptr != null){
            result += ptr.getValue() + ", ";
            ptr = ptr.getNext();
        }
        result = result.substring(0, result.length()-2)  + "]";
        return result;
    }

}
