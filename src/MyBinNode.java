public class MyBinNode<T> {
    private T value;
    private MyBinNode<T> left;
    private MyBinNode<T> right;
    public MyBinNode(T value, MyBinNode<T> left, MyBinNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyBinNode<T> getLeft() {
        return left;
    }

    public void setLeft(MyBinNode<T> left) {
        this.left = left;
    }

    public MyBinNode<T> getRight() {
        return right;
    }

    public void setRight(MyBinNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        /*if(right == null & left == null) return  "----".repeat(getLeftDescendence(this)) + value + "\n" + "x" + ",----" + "x" + "\n";
        else if(right == null) return  "----".repeat(getLeftDescendence(this)) + value + "\n" + left + ",----" + "x" + "\n";
        else if(left == null) return  "----".repeat(getLeftDescendence(this)) + value + "\n" + "x" + ",----" + right + "\n";
        else */ //str =  "----".repeat(getLeftDescendence(this)) + value + "\n" + left + ",----" + right + "\n";
        return "TEST";
    }

    public String toString(String[] str) {
        //return toString(str, n++);
        return "";
    }


    public int getChildren(){
        int n = 0;
        if(left != null) n++;
        if(right != null) n++;
        return n;
    }


    public int getDescendence(){
        return 2;
    }

    public int getLeftDescendence(MyBinNode<T> bn){
        if(bn.left == null) return 0;
        return 1 + getLeftDescendence(bn.left);
    }

    public int getRightDescendence(MyBinNode<T> bn){
        if(bn.right == null) return 0;
        return 1 + getRightDescendence(bn.left);
    }
}
