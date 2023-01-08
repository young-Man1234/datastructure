package me.stu.datastructure;

public class Node {
    private Node next;
    private int data;

    private Node prev;

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
        this.next = nd;
    }

    public void setPrev(Node nd){
        this.prev = nd;
    }

    public int getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }
}
