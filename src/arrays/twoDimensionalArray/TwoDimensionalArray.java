package arrays.twoDimensionalArray;

public class TwoDimensionalArray {
    int[][] arr = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the Array
    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {     // -------------------------------------------------- O(1)
                arr[row][col] = value;     // ----------------------------------------------------------------- O(1)
                System.out.println("The value is successfully inserted");     // ------------------------------ O(1)
            } else {
                System.out.println("This cell is already occupied");     // ----------------------------------- O(1)
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");     // ------------------------------------------ O(1)
        }
        // ----------------------------- Total is O(1) Time & Space Complexity --------------------------------------
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);     // --------------------------------- O(1)
        try {
            System.out.println("Cell value is: " + arr[row][col]);     // ------------------------------------- O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");     // ------------------------------------------ O(1)
        }
        // ----------------------------- Total is O(1) Time & Space Complexity --------------------------------------
    }

    // 2D Array Traversal
    public void traverse2DArray() {
        for (int[] ints : arr) {     // ----------------------------------------------------------------------- O(m)
            for (int col = 0; col < arr[0].length; col++) {     // -------------------------------------------- O(n)
                System.out.print(ints[col] + " ");     // ----------------------------------------------------- O(1)
            }
            System.out.println();     // ---------------------------------------------------------------------- O(1)
        }
        // ---------------------- Total is O(MN) Time Complexity & 0(1) Space Complexity --------------------------
    }

    // Search for an element in 2D array
    public void search(int valueToSearch) {
        for (int row = 0; row < arr.length; row++) {     // --------------------------------------------------- O(m)
            for (int col = 0; col < arr[0].length; col++) {     // -------------------------------------------- O(n)
                if (arr[row][col] == valueToSearch) {     // -------------------------------------------------- O(1)
                    System.out.println("Value is found at row: " + row + " Col: " + col);      // ------------- O(1)
                    return;     // ---------------------------------------------------------------------------- O(1)
                }
            }
        }
        System.out.println("Value is not found");     // ------------------------------------------------------ O(1)
        // ---------------------- Total is O(MN) Time Complexity & 0(1) Space Complexity --------------------------
    }

    // Delete value from Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successfully deleted");     // ------------------------------------------------ O(1)
            arr[row][col] = Integer.MIN_VALUE;     // --------------------------------------------------------- O(1)

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array");     // ---------------------------------- O(1)
        }
        // ----------------------------- Total is O(1) Time & Space Complexity --------------------------------------
    }

}
