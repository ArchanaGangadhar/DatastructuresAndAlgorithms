package com.archietech;

import com.archietech.sortalgos.*;

public class Main {

    public static void main(String[] args) {

        Algo3RadixAlpha.radixAlphaSort();
//        callAllProjects();

    }

    public static void callAllProjects(){
        Algo2InsertionRecursion.algo2Sort();
        Algo1ReverseMergeSort.algo1sort();
        RadixSort.radixSortList();
        BubbleSort.bubbleSortList();
        SelectionSort.sortListSelectionSort();
        InsertionSort.sortListInsertionSort();
        ShellSort.shellSortList();
        MergeSort.mergeSortList();
        QuickSort.quickSortList();
        CountingSort.countingSortList();
    }


}


