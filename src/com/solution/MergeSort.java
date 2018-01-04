package com.solution;

import java.util.Scanner;

public class MergeSort {


    static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd) return;
        int mid = (leftStart + rightEnd)/2;
        mergeSort(arr, temp, leftStart, mid);
        mergeSort(arr, temp, mid+1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left  = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <=rightEnd){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left ++;
            } else {
                temp[index] = arr[right];
                right ++;
            }
            index ++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd-left+1);
        System.arraycopy(arr, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            mergeSort(arr);
            for (int val :
                    arr) {
                System.out.println(val);
            }
        }
        in.close();
    }
}
