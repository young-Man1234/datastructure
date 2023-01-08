package me.stu.datastructure.stack;

import me.stu.datastructure.Node;

public class LinkedBaseStack implements HmStack{
    private Node head;


    public LinkedBaseStack(){
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null ? true : false;
    }

    @Override
    public void push(String data) {
        Node newNode = new Node(Integer.parseInt(data));
        if(!isEmpty())
            newNode.setNext(head);
        head = newNode;
    }

    @Override
    public String pop() {
        Node rNode = head;
        head = head.getNext();
        return rNode.getData() + "";
    }

    @Override
    public String peek() {
        return head.getData() + "";
    }
}
