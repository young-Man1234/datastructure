package me.stu.datastructure.stack;

public class ArrBaseStack implements HmStack{
    private int topIndex;
    private String[] arr;
    private static final int MAXSIZE = 100;

    public ArrBaseStack(){
        topIndex = -1;
        arr = new String[MAXSIZE];
    }

    public boolean isEmpty(){
        return this.topIndex < 0 ? true : false;
    }

    public void push(String data){
        topIndex++;
        arr[topIndex] = data;
    }

    public String pop(){
        String data = arr[topIndex];
        topIndex--;
        return data;
    }

    public String peek(){
        return arr[topIndex];
    }

}
