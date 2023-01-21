public class LongNumbers {
    private Node<Integer> num1;
    private Node<Integer> num2;

    public LongNumbers(Node<Integer> num1, Node<Integer> num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Node<Integer> getNum1() {
        return num1;
    }

    public void setNum1(Node<Integer> num1) {
        this.num1 = num1;
    }

    public Node<Integer> getNum2() {
        return num2;
    }

    public void setNum2(Node<Integer> num2) {
        this.num2 = num2;
    }

    public <T> int length(Node<T> node){
        int i = 0;
        while(node != null){
            i++;
            node = node.getNext();
        }
        return i;
    }

    public Node<Integer> biggerNum(){
        int num1Length = length(num1);
        int num2Length = length(num2);
        Node<Integer> temp1 = num1;
        Node<Integer> temp2 = num2;


        if(num1Length > num2Length) return num1;
        if(num2Length > num1Length) return num2;
        while(temp1 != null || temp2 != null){
            if(temp1.getValue() > temp2.getValue()) return num1;
            if(temp2.getValue() > temp1.getValue()) return num2;
            temp1 = temp1.getNext();
            temp2 = temp2.getNext();
        }
        return null;
    }

    public Node<Integer> combine(){
        int num1Length = length(num1);
        int num2Length = length(num2);
        Node<Integer> temp1 = num1;
        Node<Integer> temp2 = num2;
        
        int minLength = Math.min(num1Length, num2Length);
        int maxLength = Math.max(num1Length, num2Length);
        Node<Integer> biggerNum = biggerNum();
        Node<Integer> combined = biggerNum;
        Node<Integer> ptr = combined;

        int i;
        Node<Integer> smallerNum = num1;
        if(biggerNum == num1) smallerNum = num2;

        while(ptr!=null){
            if(length(smallerNum) == length(ptr)){
                ptr.setValue(ptr.getValue() + smallerNum.getValue());
                smallerNum = smallerNum.getNext();
            }
            ptr = ptr.getNext();
        }
        return combined;
    }

}
