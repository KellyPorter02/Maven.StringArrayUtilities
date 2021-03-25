package com.zipcodewilmington;

import oracle.jrockit.jfr.StringConstantPool;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String string : array) {
            if (string.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        return null;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//        for (String string : array) {
//            if (string.equals(value))
//                return true;
//        }
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        /* a pangramic sting is a sentence with all the letters in the alphabet
        in it.make a new array, if I find a, add to new array, if
         */
//        for (String string : array) {
//            if (string.equals(value))
//                return true;

        return false;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        /* we are going to loop through the 1st array, check a[0] vs a[1], if same
        just add a[0] to new array b. else keep looping. if a[1] == a[2], skip, else
        add. at last element a[a.length-1], add? length of array is i = a.length,
        last element in array is a[last element] = a.length-1
         */
//        int counter = 0;
//        String[] removedDupes = new String[array.length];
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i].equals(array[i + 1])) {
//                removedDupes = array[i];
//                i--;
//            }

        }

        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
//        String[] newArr;
//        if (int i = 0; i <= newArr.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//
//            }
        return null;
    }




}
