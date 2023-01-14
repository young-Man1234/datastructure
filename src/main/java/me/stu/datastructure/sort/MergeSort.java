package me.stu.datastructure.sort;

import java.util.Comparator;

public class MergeSort{


    public void sort(int[] data, int left, int right){
        int mid;

        if(left < right){
            mid = (left + right) / 2;
            sort(data, left, mid);
            sort(data, mid + 1, right);

            MergeTwoArea(data, left, mid, right);
        }
    }

    /*
        두개로 나눠져있는 배열을 합치는 메서드
        배열 1, 2로 정의하며 두개의 배열 값을 하나씩 꺼내서 비교하여 새로운 배열에 저장한뒤 return한다.
     */
    private void MergeTwoArea(int[] data, int left, int mid, int right) {
        int fIDX = left; //1번째 배열 시작 인덱스
        int rIDX = mid + 1; //2번째 배열 시작 인덱스
        int sIDX = left; //새로운 배열 시작 인덱스
        int[] temp = new int[data.length]; //정렬된 배열을 임시로 저장할 배열
        int i;

        while(fIDX <= mid && rIDX <= right){
            if(data[fIDX] < data[rIDX]){
                temp[sIDX] = data[fIDX++];
            }else{
                temp[sIDX] = data[rIDX++];
            }
            sIDX++;
        }

        if(fIDX > mid){
            for(i = rIDX; i <= right; i++, sIDX++){
                temp[sIDX] = data[i];
            }
        }else{
            for(i = fIDX; i <= mid; i++, sIDX++){
                temp[sIDX] = data[i];
            }
        }
        for(i = left; i <= right; i++){
            data[i] = temp[i];
        }


    }

}
