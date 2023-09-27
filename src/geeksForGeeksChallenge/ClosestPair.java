package geeksForGeeksChallenge;

import java.util.ArrayList;

public class ClosestPair {
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosestPair (int arr[], int brr[], int n, int m, int x) {
        // code here
        int arrLastElement = arr[arr.length - 1];
        int brrLastElement = brr[brr.length - 1];
        int firstNumber = 0;
        int secondNumber = 0;

        if (arrLastElement >= brrLastElement) {
            for (int i = arr.length - 1; i >= 0; i--) {
                int checker = arr[i] - x;
                if (checker < 0) {
                    firstNumber = arr[i];
                    break;
                }
            }

            for (int i = brr.length - 1; i >= 0; i--){
                int temporalSum = brr[i] + firstNumber;
                if (temporalSum - x <= 0) {
                    secondNumber = brr[i];
                    break;
                }
            }
        }
        else {
            for (int i = brr.length - 1; i >= 0; i--) {
                int checker = brr[i] - x;
                if (checker < 0) {
                    firstNumber = brr[i];
                    break;
                }
            }

            for (int i = arr.length - 1; i >= 0; i--){
                int temporalSum = arr[i] + firstNumber;
                if (temporalSum - x <= 0) {
                    secondNumber = arr[i];
                    break;
                }
            }
        }

        ArrayList<Integer> finalList = new ArrayList<>(2);
        finalList.add(firstNumber);
        finalList.add(secondNumber);
        return finalList;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7};
        int[] brr = {10, 20, 30, 40};
        int n = 4;
        int m = 4;

        System.out.println(printClosestPair(arr, brr, n, m, 32));
        System.out.println(printClosestPair(arr, brr, n, m, 50));
    }
}
