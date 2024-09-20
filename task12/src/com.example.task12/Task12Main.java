package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));*/
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) { return; }

        for (int i = 0; i < arr.length; i++){
            int minNum = (int) Math.pow(10, 6), indexMin = 0;
            for (int l = i; l < arr.length; l++){
                if (arr[l] <= minNum){
                    minNum = arr[l];
                    indexMin = l;
                }
            }
            arr[indexMin] = arr[i];
            arr[i] = minNum;
        }
    }

}