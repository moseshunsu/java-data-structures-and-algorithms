package arrays.OneDimensionalArray;

import java.util.Arrays;

public class OneDArrayPractice {

    public static void main(String[] args) {
        int[] intArray;         // Declaration -- O(1)
        intArray = new int[3];  // Instantiation -- O(1)

        intArray[0] = 1;        // Initialization -- O(1)
        intArray[1] = 2;        // Initialization -- O(1)
        intArray[2] = 3;        // Initialization -- O(1) ** line 10 - 12 in all sums up to O(N)

        System.out.println(Arrays.toString(intArray));

        //All together
        String[] sArray = {"a", "b", "c"}; // O(1)
        System.out.println(Arrays.toString(sArray));
    }

}
