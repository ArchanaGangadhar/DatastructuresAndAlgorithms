package com.archietech;


import com.archietech.utilities.PrintIntList;

public class MergeSort {

  public static void mergeSortList(){
      Integer[] arrayToSort = new Integer[]{-123, 34, 20, 4, -56, 0, 98, 45, -90, 98, 345, -123};

      splitAndMerge(arrayToSort, 0, arrayToSort.length);

      PrintIntList.printSortedList(arrayToSort);
  }

  //end is last index + 1
  public static void splitAndMerge(Integer[] arrayToSort, int start, int end){

      if(end - start <= 1)
          return;

      int mid = (start + end) / 2;  // mid will always be the start index of right array

      //call merge recursively
      splitAndMerge(arrayToSort, start, mid);
      splitAndMerge(arrayToSort, mid, end);
      mergeList(arrayToSort, start, mid, end);

  }

  //  {-123, 34, 20, 4, -56, 23} start = 0; mid = 3; end = 6
  public static void mergeList(Integer[] arrayToSort, int start, int mid, int end){

      if(arrayToSort[mid-1] <= arrayToSort[mid])
          return; // because the arrays are already sorted

      int i = start;
      int j = mid;

      int tempIndex = 0;

      Integer[] tempArray = new Integer[end - start];

      while(i < mid && j < end) {
       tempArray[tempIndex++] =  (arrayToSort[i] <= arrayToSort[j] ) ? arrayToSort[i++] : arrayToSort[j++];
      }

      System.arraycopy(arrayToSort, i, arrayToSort, start + tempIndex, mid - i);
      System.arraycopy(tempArray,0,arrayToSort,start,tempIndex);
  }
}
