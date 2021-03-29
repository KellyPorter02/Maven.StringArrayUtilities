package com.zipcodewilmington;

import oracle.jrockit.jfr.StringConstantPool;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        String[] reversedArray = new String[array.length];
        int i = array.length - 1;
        for (String element : array) {
            reversedArray[i] = element;
            i--;
        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        int i = array.length - 1;
        for (String element : array) {
            reversedArray[i] = element;
            i--;
        }

        if (Arrays.toString(array).equals(Arrays.toString(reversedArray))) {
            return true;
        }
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] lowercaseAll = new String[array.length];
        int i = 0;
        for (String element : array ) {
            lowercaseAll[i] = element.toLowerCase();
            i++;
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaChars = alphabet.toCharArray();
        char[] elementToChars;

        int alphaCounter = 0;
        for (String element : lowercaseAll) {
            elementToChars = element.toCharArray();
            for (char elementChar : elementToChars) {
                for (char alphaCharacter : alphaChars) {
                    if (elementChar == alphaCharacter) {
                        alphaCounter++;
                    }
                }
            }
        }
        if (alphaCounter >= 26) {
            return true;
        } else {
            return false;
        }
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String element : array) {
            if (element.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] removedArray = new String[array.length - 1];
        int i = 0;
        for (String element : array) {
            removedArray[i] = element;
            i++;
            if (element.equals(valueToRemove)) {
                i--;
                continue;
            }
        }
        return removedArray;
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
        String[] removedConsecDupes = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i+1])) {
                removedConsecDupes[j] = array[i];
                j++;
                i++;
            } else {
                removedConsecDupes[j] = array[i];
                j++;
            }
        }
        return removedConsecDupes;
    }




    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int counter = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                continue;
            }
            counter++;
        }
        int k = 0;

        String[] newArray = new String[counter];
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j].equals(array[j + 1])) {
                array[j] += array[j + 1];

            }
            newArray[k] = array[j];
            k++;
        }

        return newArray;
    }




}
