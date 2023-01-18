package me.stu.datastructure.binarysearchtree;

import me.stu.datastructure.btree.Btree;
import me.stu.datastructure.node.BtreeNode;

public class BinarySearchTree {

    //이진 탐색 트리를 구성할 Node
    BtreeNode root;
    Btree btree;

    public BinarySearchTree(){
        this.btree = new Btree();
    }

    //해당 Node의 데이터를 반환
    public void getNodeData(){
        btree.preOrderTraverse(root);
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

    //이진 탐색 트리에서 탐색을 진행하고 해당 Node를 반환
    public BtreeNode searchNodeData(int sData){
        return null;
    }
}
