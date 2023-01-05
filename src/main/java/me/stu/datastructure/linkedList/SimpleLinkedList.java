package me.stu.datastructure.linkedList;


import me.stu.datastructure.Node;

public class SimpleLinkedList implements HmLinkedList{

    //단일 연결리스트 구현 시 사용
    Node head;
    //원형 연결리스트 구현 시 사용
    Node before;
    Node cur;

    public SimpleLinkedList(){
        head = new Node();
        head.setNext(null);
        before = null;
        cur = null;
    }

    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        Node pred = head;

        while(pred.getNext() != null && sortList(pred, data))
            pred = pred.getNext();

        newNode.setNext(pred.getNext());
        pred.setNext(newNode);
    }
    @Override
    public void showAllData(){
        Node pred = head.getNext();
        while(pred != null){
            System.out.println(pred.getData());
            pred = pred.getNext();
        }
    }
    @Override
    public int removeData(int data) {
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

    @Override
    public Node getNode(int data) {
        return null;
    }

    private Boolean sortList(Node nd, int data2){
        if(nd.getNext().getData() < data2)
            return true;
        else
            return false;
    }



}
