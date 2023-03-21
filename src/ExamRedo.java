import unit4.collectionsLib.BinNode;

public class ExamRedo {

    //question n. 3
    public static int countVal(int[] arr, int val){return -1;}
    public static int maxX(int[] a){
        int max = 1;
        while(countVal(a, max) == max) max++;
        return max-(max!=1?1:0);
    }

    //question n. 5
    public static boolean isGrandFather(BinNode<Integer> t){
        return ((t.hasLeft() && (t.getLeft().hasLeft() || t.getLeft().hasRight())) || t.hasRight() && (t.getRight().hasLeft() || t.getRight().hasRight()));
    }

    public static Node<Integer> grandFather(BinNode<Integer> t){
        return grandFather(t, null);
    }
    public static Node<Integer> grandFather(BinNode<Integer> t, Node<Integer> list){
        if(t==null) return list;
        if(isGrandFather(t)) list = new Node<Integer>(t.getValue(), list);
        list = grandFather(t.getLeft(), list);
        list = grandFather(t.getRight(), list);
        return list;
    }

    //question n. 6
    class FamilyType{
        private String seq;
        private int count;
        public FamilyType(String seq){
            this.seq = seq;
            this.count = 0;
        }
        public void inc(){this.count++;}
    }

//    class Happy{
//        private BinNode<FamilyType> t;
//        public Happy(String s){
//            this.t = new BinNode<Happy>(new FamilyType((s)));
//        }
//    }
}
