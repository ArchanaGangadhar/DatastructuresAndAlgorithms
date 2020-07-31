package com.archietech;

import com.archietech.utilities.PrintIntList;

public class InsertionSort {

    public static void sortListInsertionSort(){

        Integer[]arrayList = new Integer[]{-123, 34, 20, 4, -56, 0, 98, 45, -90, 98, 50, -123};

        for(int unsortedStartIndex = 1; unsortedStartIndex < arrayList.length; unsortedStartIndex++){

            int tempItem = arrayList[unsortedStartIndex];
            int j = 0;

            for(j = unsortedStartIndex - 1; j >= 0 && arrayList[j] > tempItem; j--){
                    arrayList[j+1] = arrayList[j];
                }
            arrayList[j+1] = tempItem;
            }

        PrintIntList.printSortedList(arrayList);

        }



}
