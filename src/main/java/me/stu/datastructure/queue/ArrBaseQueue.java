package me.stu.datastructure.queue;
/*
     배열의 크기는 4 데이터는 3개만 저장할 수 있다.
     == 개선 방안(아직 구현되지 않음) ==
     배열의 크기를 사용자가 직접 입력하여 큐의 크기를 직접 지정할 수 있어야 한다
 */
public class ArrBaseQueue implements HmQueue{
    private int front;
    private int tail;
    private static final int QSIZE = 4;
    private int[] arr;

    public ArrBaseQueue(){
        arr = new int[QSIZE];
        front = 0;
        tail = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == tail ? true : false;
    }

    @Override
    public void enQueue(int data) {
        tail++;
        arr[tail] = data;
    }

    @Override
    public int deQueue() {
        front++;
        return arr[front];
    }

    @Override
    public int peek() {
        return arr[front + 1];
    }
}
