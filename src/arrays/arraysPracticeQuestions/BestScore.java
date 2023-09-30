package arrays.arraysPracticeQuestions;

import java.util.Arrays;

public class BestScore {
    /*
    Given an array, write a function to get first, second best scores from the array and return it in new array.
    Array may contain duplicates.
    Example
    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
     */

    public static int[] findTopTwoScores(int[] array){
        // TODO
        if (array.length < 2) {
            return array;
        }

        int firstHighest = Integer.MIN_VALUE;
        int firstScoreIndex = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for (int score: array) {
            if (score >= firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (secondHighest < score) {
                secondHighest = score;
            }
        }


        // First Alternative
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= firstHighest && secondHighest == Integer.MIN_VALUE) {
//                firstHighest = array[i];
//                firstScoreIndex = i;
//            }
//            if (secondHighest == Integer.MIN_VALUE && i == array.length - 1) {
//                array[firstScoreIndex] = Integer.MIN_VALUE;
//                i = 0;
//                secondHighest = Integer.MIN_VALUE + 1;
//            }
//            if (array[i] >= secondHighest && secondHighest > Integer.MIN_VALUE) {
//                secondHighest = array[i];
//            }
//        }

        // Second Alternative
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] >= firstHighest) {
//                firstHighest = array[i];
//                firstScoreIndex = i;
//            }
//        }
//
//        array[firstScoreIndex] = Integer.MIN_VALUE;
//
//        for (int j : array) {
//            if (j >= secondHighest) {
//                secondHighest = j;
//            }
//        }

        return new int[] {firstHighest, secondHighest};
    }

    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores((myArray))));
        System.out.println(Arrays.toString(findTopTwoScores((new int[] {3}))));
    }
}
