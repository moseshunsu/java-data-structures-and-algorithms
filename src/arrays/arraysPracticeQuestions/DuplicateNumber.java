package arrays.arraysPracticeQuestions;

import java.util.Arrays;

public class DuplicateNumber {

    /*
    Write a function which takes sorted integer array as a parameter and returns a new integer array with
    unique elements. (remove duplicates)
    Example
    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
    Output : [1, 2, 3, 4, 5]
     */

    public static int[] removeDuplicates(int[] arr) {
        //   TODO
        if (arr.length < 1) {
            return arr;
        }

        int[] uniqueArray = new int[arr.length];
        int uniqueItems = 1;
        uniqueArray[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i -1]) {
                continue;
            }
            uniqueArray[i] = arr[i];
            uniqueItems++;
        }

        int[] newArray = new int[uniqueItems];
        newArray[0] = uniqueArray[0];
        int arrayCounter = 0;

        for (int i = 1; i < uniqueArray.length; i++) {
            if (uniqueArray[i] == 0) {
                continue;
            }
            newArray[++arrayCounter] = uniqueArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5})));
    }

}
