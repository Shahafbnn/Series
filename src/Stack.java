public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(T x){
        this.head = new Node<>(x, this.head);
    }

    public T top(){
        return head.getValue();
    }

    public T pop(){
        T val = head.getValue();
        Node<T> remove = head;
        head = head.getNext();
        remove.setNext(null);
        return val;
    }


    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        String result = "[";
        Node<T> ptr = head;
        // Going over every value in the stack.
        while(ptr != null){
            result += ptr.getValue() + ", ";
            ptr = ptr.getNext();
        }
        result = result.substring(0, result.length()-2)  + "]";
        return result;
    }

}
