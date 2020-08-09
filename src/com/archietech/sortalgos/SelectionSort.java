package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class SelectionSort {

    public static void sortListSelectionSort() {
        Integer[] sortArray = new Integer[]{20, 4, -56, 0, 98, 45, -90, 50};

        for(int i = sortArray.length-1; i > 0; i--){
            int largestNumberIndex = 0;
            for(int j = 1; j <= i; j++){
                if(sortArray[largestNumberIndex] < sortArray[j])
                    largestNumberIndex = j;
            }
            switchItems(sortArray, largestNumberIndex, i);
        }

        PrintList.printSortedList(sortArray);

    }

    public static void switchItems(Integer[] sortArray, int i, int j ){
        if(i == j)
            return;

        int tempItem = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] =  tempItem;
    }


}
