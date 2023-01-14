package me.stu.datastructure.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSortTest(){
        int[] data = {2, 4, 1, 12, 16};
        int[] sortData = {1, 2, 4, 12, 16};
        MergeSort ms = new MergeSort();
        ms.sort(data, 0, 4);


        for(int i = 0; i < data.length; i++){
            assertEquals(sortData[i], data[i]);
        }

    }

}