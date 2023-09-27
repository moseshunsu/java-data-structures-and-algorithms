package arrays.OneDimensionalArray;

import java.util.Arrays;

public class SingleDimensionArray {

    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];     // ------------------------------------------------------------------ O(1)
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.MIN_VALUE;
//        }
        Arrays.fill(arr, Integer.MIN_VALUE);    // ----------------------------------------------------------- O(N)
    }

    // Insert value into array
    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {     //--------------------------------------------------- O(1)
                arr[location] = valueToBeInserted;      //----------------------------------------------------- O(1)
                System.out.println("Successfully inserted");      //------------------------------------------- O(1)
            } else {
                System.out.println("This cell is already occupied");     //------------------------------------ O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Invalid index to access array, " + e.getMessage());     //-------------------- O(1)
        }
        // ----------------------------- Total is O(1) Time & Space Complexity --------------------------------------
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for (int i: arr) {      // ------------------------------------------------------------------------ O(N)
                System.out.print(i + " ");      // ------------------------------------------------------------ O(1)
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());     // -------------------------------------------------------- O(1)
        }
        // Total is O(N) Time Complexity and
        // O(1) Space Complexity (because no extra space was required since we were only printing to the console
    }

    // Search for an element in a given array
    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {      // -------------------------------------------------------- O(N)
            if (arr[i] == valueToSearch) {      // ------------------------------------------------------------ O(1)
                System.out.println("Value is found at the index of " + i);      // ---------------------------- O(1)
                return;     // -------------------------------------------------------------------------------- O(1)
            }
        }
        System.out.println(valueToSearch + " is not found");        // ---------------------------------------- O(1)
        // Total is O(N) Time Complexity and
        // O(1) Space Complexity (because no extra space was required since we were only printing to the console
    }

    // Delete value from Array
    public void deleteValueFromArray(int indexOfValueToDelete) {
        try {
            arr[indexOfValueToDelete] = Integer.MIN_VALUE;        // ------------------------------------------ O(1)
            System.out.println("The value has been deleted successfully");        // -------------------------- O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value provided is not in the range of array");        // ------------------ O(1)
        }
        // ----------------------------- Total is O(1) Time & Space Complexity --------------------------------------
    }

}
