package me.stu.datastructure.btree;

import me.stu.datastructure.node.BtreeNode;

public class Btree {
    public BtreeNode getLeftSubTree(BtreeNode main){
        return main.getLeft();
    }

    public BtreeNode getRightSubTree(BtreeNode main){
        return main.getRight();
    }

    public void makeLeftSubTree(BtreeNode main, BtreeNode sub){
        main.setLeft(sub);
    }

    public void makeRightSubTree(BtreeNode main, BtreeNode sub){
        main.setRight(sub);
    }


    public void inorderTraverse(BtreeNode main){
        if(main == null){
            return;
        }
        inorderTraverse(main.getLeft());
        action(main);
        inorderTraverse(main.getRight());
    }

    public void preOrderTraverse(BtreeNode main){
        if(main == null){
            return;
        }
        action(main);
        preOrderTraverse(main.getLeft());
        preOrderTraverse(main.getRight());
    }

    public void postOrderTraverse(BtreeNode main){
        if(main == null){
            return;
        }
        postOrderTraverse(main.getLeft());
        postOrderTraverse(main.getRight());
        action(main);
    }

    public void changeLeftSubTree(BtreeNode main, BtreeNode sub){
        main.setLeft(sub);
    }

    public void changeRightSubTree(BtreeNode main, BtreeNode sub){
        main.setRight(sub);
    }

    public BtreeNode removeLeftSubTree(BtreeNode main){
        BtreeNode delNode = null;
        if(main != null){
            delNode = main.getLeft();
            main.setLeft(null);
        }
        return delNode;
    }

    public BtreeNode removeRightSubTree(BtreeNode main){
        BtreeNode delNode = null;
        if(main != null){
            delNode = main.getRight();
            main.setRight(null);
        }
        return delNode;
    }

    /*
        현재는 단순히 데이터를 출력하는 로직
        원하는 로직으로 바꿔주면 됨
     */
    public void action(BtreeNode main){
        System.out.println(main.getData());
    }
}
