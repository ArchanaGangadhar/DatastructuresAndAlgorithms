package com.archietech;

public class SelectionSort {

    public static void sortListSelectionSort() {
        int[] sortArray = new int[]{20, 4, -56, 0, 98, 45, -90, 50};

        for(int i = sortArray.length-1; i > 0; i--){
            int largestNumberIndex = 0;
            for(int j = 1; j <= i; j++){
                if(sortArray[largestNumberIndex] < sortArray[j])
                    largestNumberIndex = j;
            }
            switchItems(sortArray, largestNumberIndex, i);
        }

        printItems(sortArray);

    }

    public static void switchItems(int[] sortArray, int i, int j ){
        if(i == j)
            return;

        int tempItem = sortArray[i];
        sortArray[i] = sortArray[j];
        sortArray[j] =  tempItem;
    }

    public static void printItems(int[] sortedArray){
        for(int i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }


}
