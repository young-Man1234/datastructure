package me.stu.datastructure;

public class Node {
    private Node next;
    private int data;

    public Node(){
        this.next = null;
    }

    public Node(int data){
        this.data = data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node nd){
        this.next = next;
    }

    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
}
