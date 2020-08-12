package com.archietech.stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Palindrome {

    public static void palindromeCheck() {
        // should return true
        System.out.println(isPalindrome("abccba"));
        // should return true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(isPalindrome("I did, did I?"));
        // should return false
        System.out.println(isPalindrome("hello"));
        // should return true
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String stringCheck) {

        LinkedList<Character> stackList = new LinkedList<Character>();

        for(Character ch: stringCheck.toCharArray()){
            if(Character.isLetter(ch))
                stackList.push(Character.toLowerCase(ch));
        }

        for(Character ch: stringCheck.toCharArray()){
            if(Character.isLetter(ch))
                if(Character.toLowerCase(ch) != stackList.pop())
                    return false;
        }

        return true;
    }
}

