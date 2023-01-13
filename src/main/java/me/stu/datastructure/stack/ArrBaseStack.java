package me.stu.datastructure.stack;

public class ArrBaseStack implements HmStack{
    private int topIndex;
    private String[] arr;

    public ArrBaseStack(int size){
        topIndex = -1;
        arr = new String[size];
    }

    public boolean isEmpty(){
        return this.topIndex < 0 ? true : false;
    }

    public void push(String data){
        topIndex++;
        arr[topIndex] = data;
    }

    public String pop(){

        if(isEmpty())
            return "스택이 비었습니다.";

        String data = arr[topIndex];
        arr[topIndex] = null;
        topIndex--;
        return data;
    }

    public String peek(){
        return arr[topIndex];
    }

}
