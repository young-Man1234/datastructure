package me.stu.datastructure.sort;

import me.stu.datastructure.heap.Heap;
import me.stu.datastructure.heap.HeapElem;

public class HeapSort {

    Heap h;

    public HeapSort(int strLen){
        this.h = new Heap(strLen);
    }

    public HeapSort(Heap h){
        this.h = h;
    }

    public String[] heapSort(String[] strArr){
        String[] result = new String[strArr.length];

        for(int i = 0; i < strArr.length; i++){
            h.addData(strArr[i]);
        }

        for(int i = 0; i < result.length; i++){
            HeapElem heapElem = h.removeData();
            result[i] = heapElem.getData();
        }

        return result;
    }



}
