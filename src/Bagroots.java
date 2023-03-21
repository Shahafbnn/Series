import unit4.collectionsLib.BinNode;

public class Bagroots {

    //http://blog.csit.org.il/UpLoad/FilesUpload/t205_11.pdf Question 4.
    public static void leaves(BinNode<Integer> t , Queue<Integer> q)
    {
        if(q==null) q = new Queue<Integer>();
        if(t!=null)
        {
            leaves(t.getRight(), q);
            leaves(t.getLeft(), q);
            if (!t.hasRight() && !t.hasLeft()) q.insert(t.getValue());
        }

    }
    public static boolean leavesEqual(BinNode<Integer> t1, BinNode<Integer> t2){
        Queue<Integer> q1 = new Queue<Integer>();
        leaves(t1, q1);
        Queue<Integer> q2 = new Queue<Integer>();
        leaves(t2, q2);
        while(!q1.isEmpty() || !q2.isEmpty()){
            if(!q1.remove().equals(q2.remove())) return false;
        }
        return q1.isEmpty() && q2.isEmpty();
    }

    //https://meyda.education.gov.il/sheeloney_bagrut/2012/6/HEB/899205.pdf Question 3.
    class RealSet{
        RealSet(){}
        public int size(){
            return -1;
        }
        public void insert(double num){}
        public void remove(double num){}
        public double findBiggest(){
            return -1;
        }
    }
    public RealSet clone(RealSet rs){
        RealSet rsCloned = new RealSet();
        RealSet temp = new RealSet();
        double biggest;
        while(rs.size() > 0){
            biggest = rs.findBiggest();
            rsCloned.insert(biggest);
            temp.insert(biggest);
            rs.remove(biggest);
        }
        while(temp.size() > 0){
            biggest = temp.findBiggest();
            rs.insert(biggest);
            temp.remove(biggest);
        }
        return rsCloned;
    }

    public RealSet buildNeg(RealSet rs){
        RealSet temp = clone(rs);
        RealSet negs = new RealSet();
        double biggest;
        while(temp.size() > 0){
            biggest = temp.findBiggest();
        }
        return rs; // FOR NOW SO I WONT SEE ERRORS
    }

    // https://meyda.education.gov.il/sheeloney_bagrut/2013/6/HEB/899205.pdf Question n. 3
    public class BiStone{
        private int side1; //Numbers 0-6
        private int side2; //Numbers 10-16

        public BiStone(int side1, int side2){
            this.side1 = side1;
            this.side2 = side2;
        }

        public int getSide1() {
            return side1;
        }

        public void setSide1(int side1) {
            this.side1 = side1;
        }

        public int getSide2() {
            return side2;
        }

        public void setSide2(int side2) {
            this.side2 = side2;
        }

        public boolean equalSides(){
            return side1 == side2%10;
        }
    }

    public class Stones{
        private BiStone[] stones;
        public Stones(){
            int counter = 0;
            stones = new BiStone[49];
            for(int i = 0; i <= 6; i++){
                for(int j = 0; j <= 16; j++){
                    stones[counter++] = new BiStone(i, j);
                }
            }
        }
    }

    public static Node<Integer> ex3b(Integer num, Node<Integer> lst){
        boolean[] arr = new boolean[num];
        for(int i = 0; i < arr.length; i++) arr[i] = false;
        Node<Integer> ptr = lst;
        while(ptr != null){
            arr[ptr.getValue()] = true;
            ptr = ptr.getNext();
        }

        Node<Integer> newLst = new Node<Integer>(0);
        Node<Integer> last = newLst;
        for(int i = 1; i < arr.length; i++){
            if(!arr[i]){
                last.setNext(new Node<Integer>(i));
                last = last.getNext();
            }
        }
        return newLst.getNext();
    }

    //https://meyda.education.gov.il/sheeloney_bagrut/2010/6/HEB/899205.pdf Question number 2.
    public static class RangeNode{
        private int from;
        private int to;

        public RangeNode(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        @Override
        public String toString() {
            return "{" + from + ", " + to + '}';
        }
    }
    public static Node<RangeNode> createRangeList (Node<Integer> sourceList){
        Node<Integer> ptr = sourceList;
        Node<RangeNode> ranges = new Node<RangeNode>(null); // creating a dummy.
        Node<RangeNode> rangesHead = ranges;

        rangesHead.setNext(new Node<RangeNode>(new RangeNode(ptr.getValue(), ptr.getValue())));
        rangesHead = rangesHead.getNext();
        ptr = ptr.getNext();

        while(ptr!=null){
            if(rangesHead.getValue().getTo() + 1 == ptr.getValue()) {
                rangesHead.getValue().setTo(ptr.getValue());
            }
            else
            {
                rangesHead.setNext(new Node<RangeNode>(new RangeNode(ptr.getValue(), ptr.getValue())));
                rangesHead = rangesHead.getNext();
            }
            ptr = ptr.getNext();
        }
        if(ranges.getNext() == null) return ranges;
        return ranges.getNext(); //removing the dummy.
    }

    //code from the internet to convert an array to Node
    public static Node<Integer> arrayToNode(int[] a){
        Node<Integer> succ = null;
        Node<Integer> n = null;
        for (int i = a.length-1; i >= 0; i--) {
            n = new Node<Integer>(a[i], succ );
            succ = n;
        }
        return n;
    }
    public static void main(String[] args) {
        //3 4 5 12 19 20 100 101 102 103 104 null
        //3 5 12 12 19 20 100 104 null
        Node<Integer> beforeList = arrayToNode(new int[]{3, 4, 5, 12, 19, 20, 100, 101, 102, 103, 104});
        System.out.println(beforeList);
        System.out.println(createRangeList(beforeList));
    }
}
