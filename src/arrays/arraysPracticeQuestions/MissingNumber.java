package arrays.arraysPracticeQuestions;

public class MissingNumber {

    /*
    Missing Number
    Write Java function called findMissingNumberInArray that takes an integer array containing n-1
    unique elements from a range of 1 to n, with one missing number, and returns the missing number.

    Example
    myArray = {1,2,3,4,6}
    findMissingNumberInArray(myArray, 6) // 5
     */

    public static int findMissingNumberInArray(int[] arr) {
        // TODO
        int n = arr.length + 1;
        int actualSum = (n * (n + 1)) / 2; // This find the sum of the first n natural numbers
        for (int j : arr) {
            actualSum -= j;
        }
        return actualSum;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[] {1, 2, 4}));
    }
}
