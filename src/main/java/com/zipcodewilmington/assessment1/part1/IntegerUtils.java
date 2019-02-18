package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer ans = 0;

        for(int i = 0; i <= n; i++) {
            ans += i;
        }
        return ans;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {

        Integer ans = n;
        for(int i = 1; i<n; i++) {
            ans *= i;
        }

        return ans;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        StringBuilder str = new StringBuilder(val);

        str = str.reverse();
        String[] strArray = str.toString().split("");

        Integer intAns = 0;



        return null;
    }
}
