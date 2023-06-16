package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int[] uArray = {14, 61, 85, 24, 74, 26, 17, 50, 40, 45, 21, 32, 59, 58, 13};
        int[] uArray = {14, 61, 85, 24, 74, 26, 17, 50, 40, 45, 21, 32, 59, 58, 13, 100};
//        int[] uArray = {1,0,98,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,56,567};
//        int[] uArray = {1,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,0,1,0,56,0};
//        int[] uArray = {5,4,3,2};
//        int[] uArray = {5,4,3,2,6};

        System.out.println(Arrays.toString(uArray));
        System.out.println("*************************************");

        UserSorting.HeapSort(uArray);


        System.out.println(Arrays.toString(uArray));
        System.out.println("*************************************");


    }
}