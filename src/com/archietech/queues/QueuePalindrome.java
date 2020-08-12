package com.archietech.queues;

import java.util.LinkedList;

public class QueuePalindrome {

    public static void queuePalindrome() {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String stringToCheck) {

        LinkedList<Character> queueList = new LinkedList<Character>(); //FIFO
        LinkedList<Character> stackList = new LinkedList<Character>(); //LIFO

        for (Character charItem: stringToCheck.toCharArray()) {
            if(Character.isLetter(charItem)) {
                queueList.offerLast(Character.toLowerCase(charItem));
                stackList.push(Character.toLowerCase(charItem));
            }
        }

       while(!stackList.isEmpty()){
            if(!stackList.pop().equals(queueList.pollFirst()))
                return false;
        }

        return true;
    }
}
