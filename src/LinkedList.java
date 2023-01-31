public class LinkedList<T> {
    private T value;
    private LinkedList<T> prev;
    private LinkedList<T> next;

    public LinkedList(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    public LinkedList(LinkedList<T> prev, T value, LinkedList<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
    public T getValue() { return value; }
    public LinkedList<T> getPrev() { return prev; }
    public LinkedList<T> getNext() { return next; }

    public boolean hasPrev() { return prev != null; }
    public boolean hasNext() { return next != null; }

    public void setValue(T value) { this.value = value; }
    public void setPrev(LinkedList<T> prev) { this.prev = prev; }
    public void setNext(LinkedList<T> next) { this.next = next; }

    public String toString() {
        if(!hasPrev()) return  "null<-" + this.value + "->" + next;
        return "<-" + this.value + "->" + next;
    }
}