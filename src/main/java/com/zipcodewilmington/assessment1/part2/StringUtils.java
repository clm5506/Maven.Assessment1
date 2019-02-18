package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] wordArray = sentence.split(" ");

    return wordArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] wordArray = getWords(sentence);

        return wordArray[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String[] sentenceArray = sentence.split(" ");
        StringBuilder wordSB = new StringBuilder();
        wordSB.append(sentenceArray[0]);
        String ans = wordSB.reverse().toString();

        return ans;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {


        String ans = reverseFirstWord(sentence);
        String firstLetter = ans.substring(0,1).toUpperCase();
        int index = ans.length();
        String answer = firstLetter+ans.substring(1,index);

        return answer;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        ArrayList<String> newArrayList = new ArrayList<String>();

        String[] strArray = str.split("");

        for(int i = 0; i < strArray.length; i++) {

            newArrayList.add(strArray[i]);
        }
        newArrayList.remove(index);
        String ans = newArrayList.toString();

        ans = ans.replace("[","");
        ans = ans.replace("]","");
        ans = ans.replace(",","");
        ans = ans.replace(" ","");

        return ans;
    }

}
