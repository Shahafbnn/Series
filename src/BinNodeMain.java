import unit4.binTreeCanvasLib.BinTreeCanvas;
import unit4.binTreeUtilsLib.*;
import unit4.collectionsLib.BinNode;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class BinNodeMain {

    public static void main(String[] args) {
        BinNodeMethods bnm = new BinNodeMethods();
        BinNode<Integer> b1 = new BinNode<Integer>(new BinNode<Integer>(new BinNode<Integer>(null, 4, null), 2, null), 1 ,new BinNode<Integer>(new BinNode<Integer>(null, 5, null), 3,new BinNode<Integer>(null, 6, null)));
        System.out.println(b1);

        BinNode<Integer> t = BinTreeUtils.buildRandomTree(20, 1, 3);
        BinTreeCanvas.addTree(t);
        BinTreeCanvas.treeDrawInOrder();

        System.out.println("countNodes: " + BinNodeMethods.countNodes(t));
        System.out.println("countLeaves: " + BinNodeMethods.countLeaves(t));
        System.out.println("heightTree: " + BinNodeMethods.heightTree(t));
        System.out.println("countRightNodes: " + BinNodeMethods.countRightNodes(t));
        System.out.println("countChildrenEqual: " + BinNodeMethods.countChildrenEqual(t));
        System.out.println("countNodesBiggerThanParent(t) = " + BinNodeMethods.countNodesBiggerThanParent(t));
        System.out.println("countNodesEqualToNum(t, 1) = " + BinNodeMethods.countNodesEqualToNum(t, 1));
        System.out.println("bnm.sumGrandparents(t) = " + bnm.sumGrandparents(t));

//        try {
//            TimeUnit.MINUTES.sleep(2);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        exit(1);
    }
}
