package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class CountingSort {

    public static void countingSortList(){

        int[] intArray = new int[] {9, 12, 45, 34, 23, 23, 23, 45, 37, 23, 14, 26, 35 };

        countSort(intArray, 5, 45);

        PrintList.printSortedList(intArray);
    }

    public static void countSort(int[] intArray, Integer startIndex, Integer endIndex){

        int[] countArray = new int[endIndex-startIndex+1];
        for (int i : intArray) {
            countArray[i-startIndex] += 1;
        }
        int index = 0;
        for(int i=0; i<countArray.length; i++){
            while(countArray[i] != 0) {
                intArray[index++] = i + startIndex;
                countArray[i] -= 1;
            }
        }
    }
}
