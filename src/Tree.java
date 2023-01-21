public class Tree {
    private String name;
    private Tree parent;
    private Tree leftChild;
    private Tree rightChild;

    public Tree(String name, Tree parent, Tree leftChild, Tree rightChild){
        this.name = name;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    public Tree(String name){
        this.name = name;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree getParent() {
        return parent;
    }

    public void setParent(Tree parent) {
        this.parent = parent;
    }

    public Tree getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Tree leftChild) {
        this.leftChild = leftChild;
    }

    public Tree getRightChild() {
        return rightChild;
    }

    public void setRightChild(Tree rightChild) {
        this.rightChild = rightChild;
    }

    public int getChildren(){
        int n = 0;
        if(leftChild != null) n++;
        if(rightChild != null) n++;
        return n;
    }
}
