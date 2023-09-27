package arrays.twoDimensionalArray;

import java.util.Arrays;

public class TwoDArrayPractice {

    public static void main(String[] args) {
        // Step 1 - Declare
        int[][] int2DArray;             // Declaration -- O(1)

        // Step 2 - Instantiate
        int2DArray = new int[2][2];     // Instantiation -- O(1)

        // Step 3 - Initialize
        int2DArray[0][0] = 1;           // Initialization -- O(1)
        int2DArray[0][1] = 2;           // Initialization -- O(1)
        int2DArray[1][0] = 3;           // Initialization -- O(1)
        int2DArray[1][1] = 4;           // Initialization -- O(1) ** line 15 - 18 in all sums up to O(mn)

        System.out.println(Arrays.deepToString(int2DArray));
        // All together
        String[][] s2DArray = {{"a", "b"}, {"c", "d"}}; // O(1)
        System.out.println(Arrays.deepToString(s2DArray));

        // In all space complexity is O(mn) where m is n0 of rolls & n is n0 of columns
        // cos we're allocating mn number of cells
    }

}
