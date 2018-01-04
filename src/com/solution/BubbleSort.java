package com.solution;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String ...arg){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Boolean sorted = false;
        int noOfSwaps = 0;
        int lastUnSortedLocation = a.length-1;
        while(!sorted){
            sorted = true;
            for(int i=0; i < lastUnSortedLocation; i++){
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    noOfSwaps++;
                    sorted = false;
                }
            }
            lastUnSortedLocation--;
        }
        System.out.println("number of swaps:"+noOfSwaps);
        for (int val :
                a) {
            System.out.println(val);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
