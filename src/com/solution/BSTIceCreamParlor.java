package com.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSTIceCreamParlor {

    public static String BSTIceCreams(int[] iceCreams, int moneyPooled){
        List<String> matchFlavours = new ArrayList<>();
        for(int i=0; i< iceCreams.length-1; i++){
            for(int j=0; j< iceCreams.length-1; j++){
                if((iceCreams[i]+iceCreams[j]) == moneyPooled){
                    matchFlavours.add(i+","+j);
                }
            }
        }
        return matchFlavours.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfVisits = in.nextInt();
        for (int a0 = 0; a0 < noOfVisits; a0++) {
            int moneyPooled = in.nextInt();
            int noOfFlavours = in.nextInt();
            int iceCreams[] = new int[noOfFlavours];
            for (int a_i = 0; a_i < noOfFlavours; a_i++) {
                iceCreams[a_i] = in.nextInt();
            }
            System.out.println(BSTIceCreams(iceCreams, moneyPooled));
        }

    }
}

