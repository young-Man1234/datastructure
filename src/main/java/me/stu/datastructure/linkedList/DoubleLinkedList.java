package me.stu.datastructure.linkedList;

import me.stu.datastructure.Node;

public class DoubleLinkedList implements HmLinkedList{

    private Node head;
    private Node cur;


    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        if(head != null){
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }
    @Override
    public void showAllData() {
        cur = head;

        while(cur != null){
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
    }
    @Override
    public int removeData(int data) {
        cur = head;
        while(cur.getData() != data){
            cur = cur.getNext();
            if(cur.getNext() == null)
                throw new NullPointerException("해당 데이터는 없습니다.");
        }
        if(cur == head)
            head = cur.getNext();
        else{
            cur.getNext().setPrev(cur.getPrev());
            cur.getPrev().setNext(cur.getNext());
        }


        return cur.getData();
    }

    @Override
    public Node getNode(int data) {
        cur = head;
        while(cur.getData() != data){
            cur = cur.getNext();
            if(cur.getNext() == null)
                throw new NullPointerException("해당 데이터는 없습니다.");
        }
        return cur;
    }
}
