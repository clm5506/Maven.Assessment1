package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int counter = 0;
        String[] stringArray = input.split("");

        for (int i = 0; i < stringArray.length; i++) {
            if(!stringArray[i].equals(stringArray[i])) {
            counter++;
            }
        }

        return counter;
    }
}
