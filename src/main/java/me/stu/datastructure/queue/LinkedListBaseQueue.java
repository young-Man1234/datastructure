package me.stu.datastructure.queue;

import me.stu.datastructure.node.Node;

public class LinkedListBaseQueue implements HmQueue{
    private Node front;
    private Node tail;

    @Override
    public boolean isEmpty() {
        return front == null && tail == null ? true : false;
    }

    @Override
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public int deQueue() {
        int data = front.getData();
        front = front.getNext();
        if(front == null)
            tail = null;
        return data;
    }

    @Override
    public int peek() {
        return front.getData();
    }
}
