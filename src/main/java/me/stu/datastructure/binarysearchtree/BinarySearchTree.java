package me.stu.datastructure.binarysearchtree;

import me.stu.datastructure.avlrebalance.AVLRebalance;
import me.stu.datastructure.btree.Btree;
import me.stu.datastructure.node.BtreeNode;

public class BinarySearchTree {

    //이진 탐색 트리를 구성할 Node
    BtreeNode root;
    Btree btree;

    AVLRebalance rebalance;


    public BinarySearchTree(){
        this.btree = new Btree();
        this.rebalance = new AVLRebalance();
    }

    public Btree getBtree() {
        return btree;
    }

    public BtreeNode getRoot() {
        return root;
    }

    //전위 순회로 데이터 출력
    public void getNodeData(){
        btree.preOrderTraverse(root);
    }

    public void insertRebalanceNode(BtreeNode pRoot, int data){
        if(pRoot == null){
            pRoot = new BtreeNode(data);
        }else if(data < pRoot.getData()){
            insertRebalanceNode(pRoot.getLeft(), data);
            pRoot = rebalance.rebalance(pRoot);
        }else if(data > pRoot.getData()){
            insertRebalanceNode(pRoot.getRight(), data);
            pRoot = rebalance.rebalance(pRoot);
        }else{
            throw new RuntimeException("중복된 값입니다.");
        }
        root = pRoot;
    }
    //이진 탐색 트리에 Node를 저장
    public void insertNodeData(int newData){
        //새로운 노드의 부모노드
        BtreeNode pNode = null;
        //삽입할 노드
        BtreeNode cNode = root;

        if(root == null){
            root = new BtreeNode(newData);
            return;
        }

        while(cNode != null){

            pNode = cNode;

            if(cNode.getData() < newData)
                cNode = btree.getRightSubTree(cNode);
            else
                cNode = btree.getLeftSubTree(cNode);
        }

        if(pNode.getData() < newData)
            btree.makeRightSubTree(pNode, new BtreeNode(newData));
        else
            btree.makeLeftSubTree(pNode, new BtreeNode(newData));



    }


    public void removeNode(int target) {
        //루트 노드를 삭제하는 경우 밑에 있는 3개의 상황에서 더 많은 것을 고려해야 하기 때문에
        //루트 노드를 오른쪽 자식 노드를 하는 가상 루트노드를 만들어서 기능 구현함
        if (root == null)
            return;

        BtreeNode vRootNode = new BtreeNode(-1); //가상 루트 노드
        btree.changeRightSubTree(vRootNode, root);

        BtreeNode pNode = vRootNode;
        BtreeNode cNode = root;
        BtreeNode dNode = null;

        while (cNode != null && cNode.getData() != target) {
            pNode = cNode;
            if (cNode.getData() < target) {
                cNode = btree.getRightSubTree(cNode);
            } else {
                cNode = btree.getLeftSubTree(cNode);
            }
        }

        if (cNode == null) {
            return;
        }

        dNode = cNode;

        //상황:1 삭제하는 노드가 단말 노드인 경우
        if (btree.getLeftSubTree(dNode) == null && btree.getRightSubTree(dNode) == null) {
            if (btree.getLeftSubTree(pNode).equals(dNode))
                btree.removeLeftSubTree(pNode);
            else
                btree.removeRightSubTree(pNode);
            return;
        } else if (btree.getLeftSubTree(dNode) == null || btree.getRightSubTree(dNode) == null) {//상황:2 삭제하는 노드의 자식노드가 하나인 경우
            BtreeNode cdNode;

            if(btree.getLeftSubTree(dNode) != null)
                cdNode = btree.getLeftSubTree(dNode);
            else
                cdNode = btree.getRightSubTree(dNode);

            if(btree.getLeftSubTree(pNode).equals(dNode))
                btree.changeLeftSubTree(pNode, cdNode);
            else
                btree.changeRightSubTree(pNode, cdNode);

            //상황:3 삭제하는 노드의 자식노드가 두개인 경우
            //가정 삭제하는 노드의 오르쪽 노드에서 가장 작은 값의 노드로 대체한다 = 오른쪽 서브트리에서 가장 작은 값을 갖는 노드로 대체한다
        }else{
            BtreeNode mNode = btree.getLeftSubTree(dNode);
            BtreeNode pmNode = null;

            while(btree.getLeftSubTree(mNode) != null){
                pmNode = mNode;
                mNode = btree.getLeftSubTree(mNode);

            }

            if(btree.getLeftSubTree(pmNode).equals(pNode))
                btree.changeLeftSubTree(pNode, btree.getRightSubTree(pmNode));
            else
                btree.changeRightSubTree(pNode, btree.removeRightSubTree(pmNode));

        }

        if(btree.getRightSubTree(vRootNode) != root)
            root = btree.getRightSubTree(vRootNode);

        vRootNode = null;
    }

    //이진 탐색 트리에서 탐색을 진행하고 해당 Node를 반환
    public BtreeNode searchNodeData(int sData){
        return null;
    }
}
