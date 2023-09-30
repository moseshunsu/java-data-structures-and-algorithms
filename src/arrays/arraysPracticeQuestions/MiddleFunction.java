package arrays.arraysPracticeQuestions;

import java.util.Arrays;

public class MiddleFunction {
    /*
    Middle Function
    Write a function called middle that takes an array and returns a new array that contains all
    but the first and last elements.
    myArray = [1, 2, 3, 4]
    middle(myArray)  # [2,3]
     */
    public static int[] middle(int[] array) {
        // TODO
        if (array.length < 2) {
            return new int[0];
        }

        int[] middleArray = new int[array.length - 2];
//        System.arraycopy(array, 1, middleArray, 0, array.length - 2);
        for (int i = 1; i < array.length - 1; i++) {
            middleArray[i - 1] = array[i];
        }
        return middleArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(middle(new int[] {})));
        System.out.println(Arrays.toString(middle(new int[] {1, 2, 3, 4})));
    }

}
