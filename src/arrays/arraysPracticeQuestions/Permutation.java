package arrays.arraysPracticeQuestions;

public class Permutation {
    /*
    You are given two integer arrays. Write a program to check if they are permutation of each other.

    Example
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,1,2,3,4};
    permutation(array1, array2)

    Output
    true
     */

    public boolean permutation(int[] array1, int[] array2){
        // TODO - check if the length are equal, if yes - continue, if no, return false
        if (array1.length != array2.length) {
            return false;
        }

        /*
        // TODO - sort both arrays, then loop through to see if the values at both array indexes are the same
        // this approach is not too effective because it offers O(n log(n)) time complexity

        Arrays.sort(array1);        // O(n log(n))
        Arrays.sort(array2);        // O(n log(n))

        for (int i = 0; i < array1.length; i++) {       // O(n)
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
         */

        // TODO - check if the sum and product of both arrays are the same, if yes, return true, else return false
        int sumArray1 = 0;
        int sumArray2 = 0;
        int productArray1 = 1;
        int productArray2 = 1;

        for (int i = 0; i < array2.length; i++) {
            sumArray1 += array1[i];
            sumArray2 += array2[i];
            productArray1 *= array1[i];
            productArray2 *= array2[i];
        }

        return sumArray2 == sumArray1 && productArray2 == productArray1;

    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        boolean result = permutation.permutation(array1, array2);
        System.out.println(result);
    }
}
