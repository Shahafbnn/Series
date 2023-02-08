import unit4.collectionsLib.BinNode;

public class BinNodeMethods {
    public static<T> int countNodes(BinNode<T> t){
        if(t==null) return 0;
        return 1 + countNodes(t.getLeft()) + countNodes(t.getRight());
    }
    public static<T> int countLeaves(BinNode<T> t) {
        if(t==null) return 0;
        if(t.getLeft() == null && t.getRight() == null) return 1 + countLeaves(t.getLeft()) + countNodes(t.getRight());
        return countLeaves(t.getLeft()) + countLeaves(t.getRight());
    }

    public static<T> int heightTree(BinNode<T> t){
        if(t==null) return -1;
        return 1 + Math.max(heightTree(t.getLeft()), heightTree(t.getRight()));

    }
    public static<T> int countRightNodes(BinNode<T> t){
        if(t==null) return 0;
        if(t.getRight() != null) return 1 + countRightNodes(t.getRight()) + countRightNodes(t.getLeft());
        return countRightNodes(t.getRight()) + countRightNodes(t.getLeft());
    }

    public static<T> int countChildrenEqual(BinNode<T> t){ // failed
        if(t==null) return 0;
        if(!t.hasLeft() && !t.hasRight()) return 0;
        if(t.getLeft() == null) return countChildrenEqual(t.getRight());
        if(t.getRight() == null) return countChildrenEqual(t.getLeft());
        return (t.getLeft().getValue().equals(t.getRight().getValue()) ? 1 : 0) + countChildrenEqual(t.getLeft()) + countChildrenEqual(t.getRight());
    }
    public static <T> int countEqualChildren(BinNode<T> t) {
        if (t == null) return 0;
        if (t.hasRight() && t.hasLeft())
        {
            if (t.getRight().getValue().equals(t.getLeft().getValue()))
            {
                return 1 + countEqualChildren(t.getLeft()) + countEqualChildren(t.getRight());
            }
        }
        return countEqualChildren(t.getLeft()) + countEqualChildren(t.getRight());
    }

    public static int countNodesBiggerThanParent(BinNode<Integer> t){
        if(t==null) return 0;
        if(t.getLeft() == null && t.getRight() == null) return 0;
        if(t.getLeft() == null) return countNodesBiggerThanParent(t.getRight()) + ((t.getValue() > t.getRight().getValue()) ? 1 : 0);
        if(t.getRight() == null) return countNodesBiggerThanParent(t.getLeft()) + ((t.getValue() > t.getLeft().getValue()) ? 1 : 0);
        return countNodesBiggerThanParent(t.getLeft()) +  countNodesBiggerThanParent(t.getRight()) + ((t.getValue() > t.getLeft().getValue()) ? 1 : 0) + ((t.getValue() > t.getRight().getValue()) ? 1 : 0);
    }

    public static<T> int countNodeInLevel(BinNode<T> t, int level){
        if(t==null) return 0;
        if(level == 0) return 1;
        return countNodeInLevel(t.getLeft(), level-1) + countNodeInLevel(t.getRight(), level-1);
    }

    public static<T> int countNodesEqualToNum(BinNode<T> t, int num){
        if(t==null) return 0;
        if(t.getValue().equals(num)) return 1 + countNodesEqualToNum(t.getLeft(), num) + countNodesEqualToNum(t.getRight(), num);
        return countNodesEqualToNum(t.getLeft(), num) + countNodesEqualToNum(t.getRight(), num);
    }

    public static<T> int sumGrandparents(BinNode<Integer> t){ //failed
        if(t.getLeft() == null && t.getRight() == null) return 0;
        if(t.getLeft() == null) return sumGrandparents(t.getRight()) + t.getValue() * (t.getRight().getLeft() != null ? 1 : 0) + t.getValue() * (t.getRight().getRight() != null ? 1 : 0);
        if(t.getRight() == null) return sumGrandparents(t.getLeft()) + t.getValue() * (t.getLeft().getRight() != null ? 1 : 0) + t.getValue() * (t.getLeft().getLeft() != null ? 1 : 0);
        return sumGrandparents(t.getLeft()) + sumGrandparents(t.getRight()) + t.getValue() * (t.getLeft().getRight() != null ? 1 : 0) + t.getValue() * (t.getLeft().getLeft() != null ? 1 : 0) + t.getValue() * (t.getRight().getLeft() != null ? 1 : 0) + t.getValue() * (t.getRight().getRight() != null ? 1 : 0);

    }

    public static int findMax(BinNode<Integer> t){
        if(t==null) return Integer.MIN_VALUE;
        int maxL = findMax(t.getLeft());
        int maxR = findMax(t.getRight());
        return Math.max(t.getValue() , Math.max(maxL, maxR));

    }

    public static<T> boolean isExist(BinNode<T> t, int num){
        return countNodesEqualToNum(t, num) > 0;
    }


    }
