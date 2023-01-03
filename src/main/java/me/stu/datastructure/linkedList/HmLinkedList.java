package me.stu.datastructure.linkedList;


import me.stu.datastructure.Node;

public class HmLinkedList {
    Node head;
    Node before;
    Node cur;

    public HmLinkedList(){
        head = new Node();
        head.setNext(null);
        before = null;
        cur = null;
    }

    public void addHmLinkedList(int data){
        Node newNode = new Node(data);
        Node pred = head;

        while(pred.getNext() != null && sortList(pred, data))
            pred = pred.getNext();

        newNode.setNext(pred.getNext());
        pred.setNext(newNode);
    }

    public void showAllData(){
        Node pred = head.getNext();
        while(pred != null){
            System.out.println(pred.getData());
            pred = pred.getNext();
        }


    }

    public int removeData(int data){
        before = head;
        cur = head.getNext();
        while(cur != null){
            if(cur.getData() == data) {
                before.setNext(cur.getNext());
                break;
            }
            else{
                before = cur;
                cur = cur.getNext();
            }
        }
        return cur.getData();
    }

    private Boolean sortList(Node nd, int data2){
        if(nd.getNext().getData() < data2)
            return true;
        else
            return false;
    }



}
