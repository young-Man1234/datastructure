package me.stu.datastructure.sort;


public class QuickSort {


    public void sort(int[] data, int left, int right){
        if(left <= right){
            int pivot = partition(data, left, right);
            sort(data, left, pivot - 1);
            sort(data, pivot + 1, right);
        }
    }
    /*
            정렬기준: 내림차순 정렬
            low가 가리키는 데이터가 pivot이 가리키는 데이터의 우선순위보다 작을때까지 이동 즉 더 큰값을 찾을때까지
            high가 가리키는 데이터가 pivot이 가리키는 데이터의 우선순위보다 클때까지 이동 즉 더 작은값을 찾을때까지
            low와 high의 위치가 역전되지 않을때까지 데이터를 바꿔줌
            low와 high의 위차가 역전되면 high의 값과 pivot의 값을 바꿔줌
    */
    private int partition(int[] data, int left, int right){
        int pivot = data[left];
        int low = left + 1;
        int high = right;

        while(low <= high){
            while(pivot >= data[low] && low <= right)
                low++;
            while(pivot <= data[high] && high >= left + 1)
                high--;
            if(low <= high)
                swap(data, low, high);
        }
        swap(data, left, high);
        return high; //옮겨진 pivot데이터의 index값을 반환
    }

    private void swap(int[] data, int low, int high) {
        int temp = data[low];
        data[low] = data[high];
        data[high] = temp;
    }

}
