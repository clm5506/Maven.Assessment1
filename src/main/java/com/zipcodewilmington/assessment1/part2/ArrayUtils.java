package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        Integer counter= 0;
        for(int i = 0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToCount)) {
                counter++;
            }

        }
        return counter;

    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        ArrayList<Object> newArrayList = new ArrayList<Object>();

        for(int i = 0; i < objectArray.length; i++) {
            if(objectArray[i].equals(objectToRemove)==false) {
                newArrayList.add(objectArray[i]);
            }
        }

        Integer[] ans = newArrayList.toArray(new Integer[0]);
        return ans;

    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {


        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        //List<Object> list = new ArrayList<>(Arrays.asList(objectArray));

        //Collections.addAll(list, objectArrayToAdd);

        //Object[] objArray = (Integer[])list.toArray();

        Collection<Object> result = new ArrayList<Object>(objectArray.length+objectArrayToAdd.length);

        for(Object val : objectArray) {
            result.add(val);
        }
        for(Object val : objectArrayToAdd) {
            result.add(val);
        }
        return  result.toArray();
    }
}
