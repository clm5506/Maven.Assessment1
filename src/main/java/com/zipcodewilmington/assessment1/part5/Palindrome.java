package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        String a;
        Integer countSubs=input.length();

        for(int i = 0; i < input.length(); i++) {
            for(int j = i+2; j<=input.length(); j++) {
                a = input.substring(i,j);
                countSubs+= count(a);
            }

        }

        return countSubs;
    }

    public Integer count(String str){

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)!= str.charAt(str.length()-1-i)) {
                return 0;
            }

        }
        return 1;
    }


}
