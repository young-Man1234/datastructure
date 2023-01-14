package me.stu.datastructure.heap;

import java.util.Comparator;

public class Heap implements Comparator<String> {

    //배열 기반으로 힙을 구현
    private HeapElem[] heapArr;

    //힙에 저장된 데이터의 개수
    //배열의 1번 인덱스부터 데이터를 저장하기 때문에 numOfData는 가장 마지막에 저장된 데이터의 인덱스
    private int numOfdata;

    public Heap(int heapSize) {
        this.heapArr = new HeapElem[heapSize + 1];
        this.numOfdata = 0;
    }

    public void addData(String data){
        int newDataIDX = numOfdata + 1;
        HeapElem newData = new HeapElem(data);
             //새롭게 저장되는 데이터는 마지막 인덱스에 위치함
        while(newDataIDX != 1){
            if(compare(newData.getData(), heapArr[getParentIDX(newDataIDX)].getData()) < 0)
                break;

            heapArr[newDataIDX] = heapArr[getParentIDX(newDataIDX)];
            newDataIDX = getParentIDX(newDataIDX);
        }

        heapArr[newDataIDX] = newData;
        numOfdata++;
    }



    public HeapElem removeData(){
        int childIdx;
        int parentIDX = 1;
        HeapElem delElem = heapArr[1];
        HeapElem lastElem = heapArr[numOfdata];

        while((childIdx = getHighPriorityChildIDX(parentIDX)) != 0){

            if(compare(lastElem.getData(), heapArr[childIdx].getData()) > 0)
                break;

            heapArr[parentIDX] = heapArr[childIdx];
            parentIDX = childIdx;
        }

        heapArr[parentIDX] = lastElem;
        numOfdata--;
        return delElem;
    }


    private int getHighPriorityChildIDX(int pIdx){
        if(getLeftIDX(pIdx) > numOfdata)
            return 0;
        else if(getLeftIDX(pIdx) == numOfdata)
            return getLeftIDX(pIdx);
        else{
            if(compare(heapArr[getLeftIDX(pIdx)].getData(), heapArr[getRightIDX(pIdx)].getData()) > 0){
                return getLeftIDX(pIdx);
            }else{
                return getRightIDX(pIdx);
            }
        }
    }

    private int getLeftIDX(int pIdx){
        //왼쪽 자식 노드의 인덱스 값 = 부모 노드 인덱스 값 * 2
        return pIdx * 2;
    }

    private int getRightIDX(int pIdx){
        //오른쪽 자식 노드의 인덱스 값 = 부모 노드 인덱스 값 * 2 + 1
        return pIdx * 2 + 1;
    }

    private int getParentIDX(int cIdx){
        //부모 노드의 인덱스 값 = 자식 노드 인덱스 / 2
        return cIdx / 2;
    }


    public boolean isEmpty(){
        return numOfdata == 0 ? true : false;
    }


    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
