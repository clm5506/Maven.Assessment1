package com.zipcodewilmington.assessment1.part1;



/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String firstlet = str.substring(0,1).toUpperCase();
        String ans = firstlet + str.substring(1);
        return ans;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder reversedString = new StringBuilder(str);
        reversedString = reversedString.reverse();

        return reversedString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        str = reverse(str);
        str = camelCase(str);
        return str;
    }
    
    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String ans = str.substring(1,str.length()-1);

        return ans;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] chars = str.toCharArray();

        for(int i = 0; i <chars.length; i++) {

            char c = chars[i];
            if(Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }

        }

        return new String(chars);
    }
}
