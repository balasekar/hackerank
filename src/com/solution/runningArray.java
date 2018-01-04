package com.solution;

import java.util.*;

public class runningArray {

    public static Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    public static Queue<Integer> high = new PriorityQueue<>();

    public static void add(int number) {
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(number);
        balance();
    }

    public static void balance() {
        if(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()) {
            low.add(high.poll());
            high.add(low.poll());
        }
    }

    public static double median() {
        if(low.isEmpty() && high.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        } else {
            return low.size() == high.size() ? (low.peek() + high.peek()) / 2.0 : low.peek();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            add(a[a_i]);
            System.out.println(median());
        }
    }
}