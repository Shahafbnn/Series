public class IntNode {
    private int value;
    private IntNode next;

    public IntNode(int value, IntNode next){
        this.value = value;
        this.next = next;
    }

    public IntNode(int value){
        this.value = value;
        this.next = null;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public IntNode getNext(){
        return next;
    }

    public String toString(){
        return value + "-->" + next;
    }
}