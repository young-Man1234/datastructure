package me.stu.datastructure.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void qSort(){
        int[] data = {2, 4, 7, 8, 1};
        int[] expectRes = {1, 2, 4, 7, 8};
        QuickSort q = new QuickSort();
        q.sort(data, 0, data.length - 1);
        for(int i = 0; i < data.length; i++){
            assertEquals(expectRes[i], data[i]);
        }
    }

}