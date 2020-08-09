package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class Algo1ReverseMergeSort {

    public static void algo1sort(){
        Integer[] arrayToSort = new Integer[]{-123, 34, 20, 4, -56, 0, 98, 45, -90, 98, 345, -123};

        reverseMergeSort(arrayToSort, 0, arrayToSort.length);
        PrintList.printSortedList(arrayToSort);
    }

    public static void reverseMergeSort(Integer[] arrayToSort, int startIndex, int endIndex){
        if(endIndex - startIndex <= 1)
            return;


        int pivotIndex = (endIndex + startIndex) / 2;

        reverseMergeSort(arrayToSort, startIndex, pivotIndex);
        reverseMergeSort(arrayToSort, pivotIndex, endIndex);
        mergeArray(arrayToSort, startIndex, pivotIndex, endIndex);
    }

    public static void mergeArray(Integer[] arrayToSort, int startIndex, int mid, int endIndex){

        if(arrayToSort[mid-1] > arrayToSort[mid]) return;

        int i = startIndex;
        int j = mid;

        Integer[] temp = new Integer[endIndex - startIndex];
        Integer index = 0;

        while(i < mid && j < endIndex) {

            temp[index++] = (arrayToSort[j] > arrayToSort[i]) ? arrayToSort[j++] : arrayToSort[i++];
        }

        System.arraycopy(temp, 0, arrayToSort, startIndex, index);
        System.arraycopy(arrayToSort, i, arrayToSort, startIndex+index, mid-i);
    }
}
