package org.example;

import java.util.Arrays;

public abstract class UserSorting {

    public static void HeapSort(int[] userArray){
        for (int start = 0, end = userArray.length; start < end; end--) {
            //System.out.println(end);
            for (int i = end/2-1; i >= start; i--) {
                int first = Math.min(end-1, i*2+1);
                int second = Math.min(end-1, i*2+2);
                int tempMaxChild =  searchMaxValue(userArray, first, second);
                userSwap(userArray, i, tempMaxChild);
            }

            int tempResult = userArray[start];
            userArray[start] = userArray[end-1];
            userArray[end-1] = tempResult;

        }
    }

    private static void userSwap(int[] userArray, int parent, int child) {

        if (userArray[parent] < userArray[child]) {
            int temp = userArray[parent];
            userArray[parent] = userArray[child];
            userArray[child] = temp;
        }
    }

    private static int searchMaxValue(int[] userArray, int child1, int child2){
        if(userArray[child1] > userArray[child2])
            return child1;
        return child2;
    }


}
