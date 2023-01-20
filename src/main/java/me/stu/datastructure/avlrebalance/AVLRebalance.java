package me.stu.datastructure.avlrebalance;

import me.stu.datastructure.binarysearchtree.BinarySearchTree;
import me.stu.datastructure.btree.Btree;
import me.stu.datastructure.node.BtreeNode;

public class AVLRebalance {
    private Btree bt;
    public AVLRebalance() {
        this.bt = new Btree();
    }

    public BtreeNode rebalance(BtreeNode root){
        int hdiff = getHeightDiff(root);
        //1보다 크다면 LL || LR 상태
        if(hdiff > 1){
            if(getHeightDiff(bt.getLeftSubTree(root)) > 0)
                root = rotateLL(root);
            else
                root = rotateLR(root);
        }

        // 0 보다 작다면 RR || RL 상태
        if(hdiff < -1){
            if(getHeightDiff(bt.getRightSubTree(root)) < 0)
                root = rotateRR(root);
            else
                root = rotateRL(root);
        }

        return root;
    }


    //Test를 위해 public
    public int getHeightDiff(BtreeNode btn){
        int lsh;
        int rsh;

        if(btn == null)
            throw new NullPointerException("트리가 비어있음");

        lsh = getHeight(bt.getLeftSubTree(btn));
        rsh = getHeight(bt.getRightSubTree(btn));

        return lsh - rsh;
    }

    private int getHeight(BtreeNode bn) {
        int leftH;
        int rightH;

        if(bn == null)
            return 0;

        leftH = getHeight(bt.getLeftSubTree(bn));
        rightH = getHeight(bt.getRightSubTree(bn));

        if(leftH > rightH)
            return leftH + 1;
        else
            return rightH + 1;
    }
    //LL회전 메서드
    private BtreeNode rotateLL(BtreeNode btn){

        BtreeNode pNode;
        BtreeNode cNode;

        pNode = btn;
        cNode = bt.getLeftSubTree(btn);

        changeLeftSubTree(pNode, bt.getRightSubTree(cNode));
        changeRightSubTree(cNode, pNode);

        return cNode;
    }
    //RR회전
    private BtreeNode rotateRR(BtreeNode btn){

        BtreeNode pNode;
        BtreeNode cNode;

        pNode = btn;
        cNode = bt.getRightSubTree(btn);

        changeRightSubTree(pNode, bt.getLeftSubTree(cNode));
        changeLeftSubTree(cNode, pNode);

        return cNode;
    }

    private void changeRightSubTree(BtreeNode cNode, BtreeNode pNode) {
        bt.changeRightSubTree(cNode, pNode);
    }
    private void changeLeftSubTree(BtreeNode pNode, BtreeNode rightSubTree) {
        bt.changeLeftSubTree(pNode, rightSubTree);
    }

    private BtreeNode rotateLR(BtreeNode btn){
        BtreeNode pNode = btn;
        BtreeNode cNode = bt.getLeftSubTree(btn);

        changeLeftSubTree(pNode, rotateRR(cNode));
        return rotateLL(pNode);
    }

    private BtreeNode rotateRL(BtreeNode btn){
        BtreeNode pNode = btn;
        BtreeNode cNode = bt.getLeftSubTree(btn);

        changeRightSubTree(pNode, rotateLL(cNode));
        return rotateRR(pNode);
    }

}
