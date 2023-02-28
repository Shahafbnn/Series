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
            biggest
            if()
        }
    }


}
