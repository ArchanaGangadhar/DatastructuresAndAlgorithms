package com.archietech;

public class BubbleSort {

    public static void bubbleSortList(){

        Integer sortArray[] = new Integer[]{24, 34, -65, 72, 55, -22, 0, 8};

        for(int i = sortArray.length - 1; i > 0; i-- ){
            for(int j = 0; j < i; j++){
                if(sortArray[j] > sortArray[j+1])
                    swapItems(sortArray, j, j+1);
            }
        }

        printSortedList(sortArray);

    }

    public static void printSortedList(Integer[] sortedArray){

        for(int i = 0; i < sortedArray.length; i++)
            System.out.println(sortedArray[i]);
    }

    public static void swapItems(Integer[] arrayList, int a, int b){
        if(a == b)
            return;
        if(arrayList[a] > arrayList[b])
        {
            int tempItem = arrayList[a];
            arrayList[a] = arrayList[b];
            arrayList[b] = tempItem;
        }
    }
}
