package arrays.arraysPracticeQuestions;

import java.util.stream.IntStream;

public class TwoDArrays {
    /*
    Given 2D array calculate the sum of diagonal elements.
    Example
    myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    sumDiagonalElements(myArray2D) # 15
     */

    public static int sumDiagonalElements(int[][] array) {
        try {

            int numRows = array.length;
            int numCols = array[0].length;

            if (array == null || numRows == 0 || numCols == 0) {
                throw new IllegalArgumentException("Invalid array!!!");
            } else if (numRows != numCols) {
                throw new IllegalArgumentException("Array sizes not equal");
            }

            return IntStream.range(0, numRows)
                .map(i -> array[i][i])
                .sum();

            /*
            This is more understandable
            int sum = 0;
            int i = 0;
            while (i < numRows) {
                sum = array[i][i];
                i++;
            }
            return sum;
             */

        } catch (IllegalArgumentException e) {
            throw e;
        }
    }


    public static void main(String[] args) {
        int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumDiagonalElements(myArray2D));
    }

}
