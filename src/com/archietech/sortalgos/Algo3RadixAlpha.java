package com.archietech.sortalgos;

import com.archietech.utilities.PrintList;

public class Algo3RadixAlpha {

    static char[] alphaSet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y','z' };

    public static void radixAlphaSort(){
        String[] arrayToSort = new String[]{"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        if(arrayToSort.length < 0)
            return;

        for(int i = arrayToSort[0].length()-1; i>=0 ; i-- ){
            radixSort(arrayToSort, i);
        }

        PrintList.printSortedList(arrayToSort);

    }

    public static void radixSort(String[] arrayToSort, int positionIndex){
       int[] radixArray = new int[26];

        // get the alpha at the position and increment that by 1
        for(int i = 0; i < arrayToSort.length; i++) {
            ++radixArray[getCharIndex(arrayToSort[i].charAt(positionIndex))];
        }

        // update the index
        for(int i = 1; i<radixArray.length; i++){
            radixArray[i] += radixArray[i-1];
        }

        String[] tempArray = new String[arrayToSort.length];
        for(int i = arrayToSort.length - 1; i >= 0; i--){
            int index = getCharIndex(arrayToSort[i].charAt(positionIndex));
            tempArray[--radixArray[index]] = arrayToSort[i];
        }

        //Copy back to original array
        for(int i = 0; i < arrayToSort.length; i++)
            arrayToSort[i] = tempArray[i];
    }

    public static int getCharIndex(char item){
        int itemIndex = 0;
        for(int j = 0; j < alphaSet.length; j++ ){
            if(item == alphaSet[j])
                itemIndex = j;
        }
        return itemIndex;
    }
}
