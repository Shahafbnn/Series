import com.sun.source.tree.BinaryTree;
import unit4.collectionsLib.BinNode;

public class BinTreeMethods {
    public static <T> int countNodes(BinNode<T> t) {
        if (t == null)
        {
            return 0;
        }
        return 1 + countNodes(t.getLeft()) + countNodes(t.getRight());
    }

    public static <T> int countLeaves(BinNode<T> t) {
        if (t == null)
        {
            return 0;
        }
        if (t.getLeft() == null && t.getRight() == null)
        {
            return 1;
        }
        return countLeaves(t.getRight()) + countLeaves(t.getLeft());
    }

    public static <T> int treeHeight(BinNode<T> t) {
        if (t == null)
        {
            return -1;
        }
        return 1 + Math.max(treeHeight(t.getLeft()), treeHeight(t.getRight()));
    }

    public static <T> int countRightChildren(BinNode<T> t) {
        if (t == null)
        {
            return 0;
        }
        if (t.hasRight())
        {
            return 1 + countRightChildren(t.getLeft()) + countRightChildren(t.getRight());
        }
        return countRightChildren(t.getLeft()) + countRightChildren(t.getRight());
    }

    public static <T> int countEqualChildren(BinNode<T> t) {
        if (t == null)
        {
            return 0;
        }
        if (t.hasRight() && t.hasLeft())
        {
            if (t.getRight().getValue().equals(t.getLeft().getValue()))
            {
                return 1 + countEqualChildren(t.getLeft()) + countEqualChildren(t.getRight());
            }
        }
        return countEqualChildren(t.getLeft()) + countEqualChildren(t.getRight());
    }

    public static int countLessThanParent(BinNode<Integer> t) {
        return countLessThanParent(t, Integer.MIN_VALUE);
    }

    public static int countLessThanParent(BinNode<Integer> t, int prevVal) {
        if (t == null) return 0;
        return Math.max(0, Integer.compare(prevVal, t.getValue())) + countLessThanParent(t.getLeft(), t.getValue()) + countLessThanParent(t.getRight(), t.getValue());
    }

    public static int countNum(BinNode<Integer> t, int num) {
        if (t == null) {
            return 0;
        }
        if (t.getValue() == num) {
            return 1 + countNum(t.getLeft(), num) + countNum(t.getRight(), num);
        }
        return countNum(t.getLeft(), num) + countNum(t.getRight(), num);
    }

    public static <T> int nodesInLevel(BinNode<T> t, int level) {
        if (t == null) {
            return 0;
        }
        if (level == 0) {
            return 1;
        }
        return nodesInLevel(t.getLeft(), level - 1) + nodesInLevel(t.getRight(), level - 1);
    }

    public static int grandpaSum(BinNode<Integer> t) {
        if (t == null) {
            return 0;
        }
        int count = 0;
        if (t.hasRight()) {
            if (t.getRight().hasRight() || t.getRight().hasLeft()) {
                count += t.getValue();
            }
        }
        else if (t.hasLeft()) {
            if (t.getLeft().hasLeft() || t.getLeft().hasRight()) {
                count += t.getValue();
            }
        }
        return count + grandpaSum(t.getRight()) + grandpaSum(t.getLeft());
    }

    public static int sumLevel(BinNode<Integer> t, int level) {
        if (t == null) {
            return 0;
        }
        if (level == 0) {
            return t.getValue();
        }
        return sumLevel(t.getLeft(), level - 1) + sumLevel(t.getRight(), level - 1);
    }

    public static int sumNegative(BinNode<Integer> t) {
        if (t == null) {
            return 0;
        }
        int c = 0;
        if (t.getValue() < 0) {
            c = t.getValue();
        }
        return c + sumNegative(t.getLeft()) + sumNegative(t.getRight());
    }

    public static int findMax(BinNode<Integer> t) {
        if (t == null) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        if (t.hasLeft()) {
            max = findMax(t.getLeft());
        }
        if (t.hasRight()) {
            max = Math.max(findMax(t.getRight()), max);
        }
        max = Math.max(t.getValue(), max);
        return max;
    }

    public static boolean isExist(BinNode<Integer> t, int x) {
        if (t == null) {
            return false;
        }
        if (t.getValue() == x) {
            return true;
        }
        return isExist(t.getRight(), x) || isExist(t.getLeft(), x);
    }

    public static boolean isSumTree(BinNode<Integer> t) {
        if (t == null) {
            return true;
        }
        boolean isSum = isSumTree(t.getLeft()) && isSumTree(t.getRight());
        if (!isSum) {
            return false;
        }
        if (!t.hasLeft() && !t.hasRight()) {
            return true;
        }
        int sum = 0;
        if (t.hasLeft()) {
            if (t.getLeft().hasLeft() || t.getLeft().hasRight()) {
                sum += t.getLeft().getValue() * 2;
            }
            else {
                sum += t.getLeft().getValue();
            }
        }
        if (t.hasRight()) {
            if (t.getRight().hasLeft() || t.getLeft().hasRight()) {
                sum += t.getRight().getValue() * 2;
            }
            else {
                sum += t.getRight().getValue();
            }
        }
        return sum == t.getValue();
    }

    public static <T> boolean equals(BinNode<T> t1, BinNode<T> t2) {
        if (t1 == null)
            return t2 == null;
        else if (t2 == null)
            return false;
        return t1.getValue().equals(t2.getValue()) && equals(t1.getLeft(), t2.getLeft()) && equals(t1.getRight(), t2.getRight());
    }

    public static <T> boolean contains(BinNode<T> t1, BinNode<T> t2) {
        return equals(t1, t2) || contains(t1.getRight(), t2) || contains(t1.getLeft(), t2);
    }

    public static boolean isAscending(BinNode<Integer> t) {
        if (t == null) return false;
        if (!t.hasLeft() && !t.hasRight()) return true;
        if (t.hasLeft())
            if (t.getValue() > t.getLeft().getValue())
                return false;
        if (t.hasRight())
            if (t.getValue() > t.getLeft().getValue())
                return false;
        return isAscending(t.getLeft()) || isAscending(t.getRight());
    }

    public static void printOdd(BinNode<Integer> t) {
        if (t != null) {
            if (t.getValue() % 2 == 1) {System.out.println(t.getValue());}
            printOdd(t.getRight());
            printOdd(t.getLeft());
        }
    }

    public static void printNegative(BinNode<Integer> t) {
        if (t != null) {
            if (t.getValue() < 0) {System.out.println(t.getValue());}
            printNegative(t.getLeft());
            printNegative(t.getRight());
        }
    }

    public static <T> boolean isLeaf(BinNode<T> t) {
        return t != null && !t.hasRight() && !t.hasLeft();
    }

    public static void printLeftLeaves(BinNode<Integer> t) {
        if (t != null) {
            if (isLeaf(t.getLeft())) System.out.println(t.getLeft().getValue());
            printLeftLeaves(t.getLeft());
            printLeftLeaves(t.getRight());
        }
    }

    public static void printMoreThanChild(BinNode<Integer> t) {
        if (t != null) {
            final int max = findMax(t);
            if (t.getValue() == max) {
                System.out.println(max);
            }
            printMoreThanChild(t.getLeft());
            printMoreThanChild(t.getRight());
        }
    }

    public static <T> void printNodesInLevel(BinNode<T> t, int level) {
        if (t != null) {
            if (level == 0) {
                System.out.println(t.getValue());
            }
            else if (level > 0) {
                printNodesInLevel(t.getLeft(), level - 1);
                printNodesInLevel(t.getRight(), level - 1);
            }
        }
    }

    public static boolean onePath(BinNode<Integer> t) {
        if (t == null) return false;
        return onePath(t, t.getValue());
    }

    private static boolean onePath(BinNode<Integer> t, int prev) {
        if (t == null) {
            return false;
        }
        if (t.getValue() != prev) {
            return false;
        }
        if (!t.hasRight() && !t.hasLeft()) {
            return true;
        }
        return onePath(t.getLeft(), prev) || onePath(t.getRight(), prev);
    }

    public static <T> boolean isRightLeft(BinNode<T> t) {
        if (t == null) return true;
        return (!t.hasRight() || t.hasLeft()) && isRightLeft(t.getLeft()) && isRightLeft(t.getRight());
    }

    public static <T extends Comparable<T>> boolean contains(BinNode<T> searchTree, final T val) {
        if (searchTree == null) return false;
        if (searchTree.getValue().compareTo(val) == 0) return true;
        if (searchTree.getValue().compareTo(val) < 0) return contains(searchTree.getLeft(), val);
        return contains(searchTree.getRight(), val);
    }

    public static Node<Integer> common(BinNode<Integer> t1, BinNode<Integer> t2){ // idk if working,  didnt check
        if(t1 == null) return new Node<>(null);
        Node<Integer> leftNode = common(t1.getLeft(), t2);
        Node<Integer> rightNode = common(t1.getRight(), t2);

        Node<Integer> temp = leftNode;
        while(temp.getNext() != null) temp = temp.getNext();
        temp.setNext(rightNode);

        if(isExist(t2, t1.getValue())){
            return new Node<Integer>(t1.getValue(), leftNode);
        }
        return leftNode;
    }

    /*
    * הפעולה תקבל עץ בינרי t מטיפוס שלם ומספר שלם x . הפעולה תחזיר true אם יש בעץ
צומת שערכו x , אחרת — הפעולה תחזיר false . אם העץ ריק — הפעולה תחזיר false.*/
    public static Node<Integer> check(BinNode<Integer> t1, BinNode<Integer> t2){
        Node<Integer> first = new Node<Integer>(-1);
        //first = check(t1, t2, first);
        return first.getNext();
    }

    //public static Node<Integer> check(BinNode<Integer> t1, BinNode<Integer> t2, BinNode<Integer> list){}


    //https://meyda.education.gov.il/sheeloney_bagrut/2022/6/HEB/899381.pdf question 7
    public static boolean wordFromRoot(BinNode<Character> tree, String str){
        int length = str.length();
        if(str.isEmpty() && tree==null) return true;
        if(str.isEmpty() || tree==null) return false;
        if(!tree.hasLeft() && !tree.hasRight() && ("" + tree.getValue()).equals(str)) return true;
        return str.substring(0,1).equals("" + tree.getValue()) && (wordFromRoot(tree.getLeft(), str.substring(1, length)) || wordFromRoot(tree.getRight(), str.substring(1, length)));
    }

    public static void printAll1(BinNode<Integer> tree){
        if(tree==null){
            return;
        }
        if(tree.hasLeft()){
            System.out.print(tree.getValue());
            printAll1(tree.getLeft());
        }
        if(tree.hasRight()){
            System.out.print(tree.getValue());
            printAll1(tree.getRight());
        }
        if(!tree.hasLeft() && !tree.hasRight()) System.out.println(tree.getValue());
    }

    public static void printAll(BinNode<Integer> countTree) {
        printAll(countTree, 0);
    }

    private static void printAll(BinNode<Integer> countTree, int num) {
        if (countTree != null){
            num = 10 * num + countTree.getValue();
            if (!countTree.hasRight() && !countTree.hasLeft())
                System.out.println(num);
            printAll(countTree.getLeft(), num);
            printAll(countTree.getRight(), num);
        }
    }

    /*https://meyda.education.gov.il/sheeloney_bagrut/2009/6/HEB/899205.pdf - שאלה 2*/
    public static boolean isRightLeft2(BinNode<Integer> tree){
        if(tree==null) return true;
        if(tree.hasRight()){
            if(tree.hasLeft()) return isRightLeft2(tree.getLeft()) && isRightLeft2(tree.getRight());
            return false;
        }
        return isRightLeft2(tree.getLeft());
    }
    

    /*https://meyda.education.gov.il/sheeloney_bagrut/2013/6/HEB/899205.pdf - שאלה 4*/ // SKIPPED

    //https://meyda.education.gov.il/sheeloney_bagrut/2011/6/HEB/899205.pdf - שאלה 4 (להחליף את הדרישה למחסנית עם תור)
    public static void leaves(BinNode<Integer> t, Queue<Integer> s){
        if(t==null) return;
        if(!t.hasLeft() && !t.hasRight()) s.insert(t.getValue());
        leaves(t.getRight(), s);
        leaves(t.getLeft(), s);
    }

    public static boolean equalLeaves(BinNode<Integer> t1, BinNode<Integer> t2){
        Queue<Integer> s1 = new Queue<Integer>();
        leaves(t1, s1);
        Queue<Integer> s2 = new Queue<Integer>();
        leaves(t2, s2);
        boolean isEquals = true;
        while(!s1.isEmpty() || !s2.isEmpty()) {
            isEquals = s1.remove().equals(s2.remove());
        }
        if((s1.isEmpty() && !s2.isEmpty()) || (!s1.isEmpty() && s2.isEmpty())) return false;
        if(s1.isEmpty() && s2.isEmpty()) return isEquals;
        return false;

    }

    //https://meyda.education.gov.il/sheeloney_bagrut/2012/6/HEB/899205.pdf - שאלה 2 (להחליף את הדרישה למחסנית עם תור)











}
