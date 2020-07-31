package com.archietech;

import com.archietech.utilities.PrintIntList;

public class ShellSort {

    public static void shellSortList(){
        Integer[] arrayToSort = new Integer[]{-123, 34, 20, 4, -56, 0, 98, 45, -90, 98, 50, -123};

//        Integer[] arrayToSort = new Integer[]{20, 35, -15, 7, 55, 1, -22};

        for(int gap = arrayToSort.length/2; gap > 0; gap /= 2 ){

             for(int j = gap; j < arrayToSort.length; j++ ){
                 int tempItem = arrayToSort[j];

                 int index = j;

                 while(index-gap >= 0 &&  tempItem < arrayToSort[index-gap]){
                     arrayToSort[index] = arrayToSort[index-gap];
                     index = index - gap;
                 }
                arrayToSort[index] =  tempItem;

            }
        }

        PrintIntList.printSortedList(arrayToSort);



    }


}
