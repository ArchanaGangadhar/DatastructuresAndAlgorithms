package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class Algo2InsertionRecursion {

    public static void algo2Sort(){
        Integer[] arrayToSort = new Integer[]{-123, 34, 20, 4, -56, 0, 98, 45, -90, 98, 345, -123};

        insertionSort(arrayToSort, arrayToSort.length);

        PrintList.printSortedList(arrayToSort);
    }


    public static void insertionSort(Integer[] arrayToSort, int arrayLength){
        // 0, 4, 20, 34, 2
        if(arrayLength <= 1)
            return;

        insertionSort(arrayToSort, arrayLength-1);

//        for(int indexOfItemToSort=1; indexOfItemToSort < arrayToSort.length; indexOfItemToSort++ ){

            Integer itemToSort = arrayToSort[arrayLength-1];

            int index = arrayLength - 2;

            while(arrayToSort[index] > itemToSort && index >= 0){
                arrayToSort[index+1] = arrayToSort[index];
                index--;
            }

            arrayToSort[++index] = itemToSort;

//        }
    }


}
