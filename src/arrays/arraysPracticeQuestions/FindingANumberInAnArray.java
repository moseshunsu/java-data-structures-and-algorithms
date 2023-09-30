package arrays.arraysPracticeQuestions;

public class FindingANumberInAnArray {
    /*
    Write a program to check if an array contains a number in Java.
    int[] intArray = {1,2,3,4,5,6};
    searchInArray(intArray, 6); // 5
     */

    public static int searchInArray(int[] intArray, int valueToSearch) {
        // TODO

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        System.out.println(searchInArray(new int[] {1,2,3,4,5,6}, 6));
    }

}
