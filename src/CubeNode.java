public class CubeNode {
    private Cube cube;
    private CubeNode next;

    public CubeNode(Cube cube) {
        this.cube = cube;
        this.next = null;
    }

    public CubeNode(Cube cube, CubeNode cNode) {
        this.cube = cube;
        this.next = cNode;
    }

    public Cube getValue() {
        return this.cube;
    }

    public CubeNode getNext() {
        return this.next;
    }

    public void setNext(CubeNode next){
        this.next = next;
    }
}