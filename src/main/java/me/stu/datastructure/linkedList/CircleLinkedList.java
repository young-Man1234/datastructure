package me.stu.datastructure.linkedList;


import me.stu.datastructure.Node;

public class CircleLinkedList implements HmLinkedList{

    Node tail;

    Node cur;

    Node before;

    public CircleLinkedList(){
        tail = null;
    }


    @Override
    public void add(int data) {
        Node newNode = new Node(data);

        if(tail != null){
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
        }else{
            newNode.setNext(newNode);
        }

        tail = newNode;
    }

    @Override
    public void showAllData() {
        if(tail == null){
            System.out.println("List가 비었습니다 !!!");
            return;
        }
        cur = tail.getNext();
        do{
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
        while(cur != tail.getNext());

    }

    @Override
    public int removeData(int data) {
        cur = tail.getNext();
        before = tail;

        int result = 0;

        while(cur.getData() != data){
            before = cur;
            cur = cur.getNext();
            if(cur == tail.getNext()){
                throw new NullPointerException("해당 Data는 존재하지 않습니다.");
            }
        }

        if(cur != tail)
            before.setNext(cur.getNext());
        else{
            tail = before;
            tail.setNext(cur.getNext());
        }

        return result;
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
