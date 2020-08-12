package com.archietech;

import com.archietech.queues.QueuePalindrome;
import com.archietech.sortalgos.*;
import com.archietech.stacks.Palindrome;

public class Main {

    public static void main(String[] args) {

//        callAllProjects();
        QueuePalindrome.queuePalindrome();
    }

    public static void callAllProjects(){
        Palindrome.palindromeCheck();
        Algo3RadixAlpha.radixAlphaSort();
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


