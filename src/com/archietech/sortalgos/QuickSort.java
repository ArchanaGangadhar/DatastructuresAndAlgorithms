package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class QuickSort {

    public static void quickSortList(){
        Integer sortArray[] = new Integer[]{24, 34, -65, 72, 55, -22, 0, 8};

        sortList(sortArray, 0, sortArray.length);

        PrintList.printSortedList(sortArray);

    }

    public static void sortList(Integer[] sortArray, int startIndex, int endIndex ){
        if(endIndex - startIndex <= 1)
            return;

        int pivotIndex = findPivotIndex(sortArray, startIndex, endIndex);
        sortList(sortArray, startIndex, pivotIndex);
        sortList(sortArray, pivotIndex+1, endIndex);

    }

    public static int findPivotIndex(Integer[] sortArray, int startIndex, int endIndex){

        int pivotItem = sortArray[startIndex];
        int i = startIndex;
        int j = endIndex;

        //24, 34, -65, 72, 55, -22, 0, 8
        while(j >= i)
        {
            while ( j>= i && sortArray[--j] >= pivotItem){};

            if(i < j)
                sortArray[i] = sortArray[j];

            while(j>= i && sortArray[++i] <= pivotItem){}

            if(i <j)
                sortArray[j] = sortArray[i];

        }
        sortArray[i] = pivotItem;

        return i;
    }

}
