package arrays;

import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] args) {

        // Find Number of Days Above Average Temperature

        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = input.nextInt();
        int [] temps = new int[numDays];
        // recall temperatures and find average
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = input.nextInt();
            sum += temps[i];
        }

        double avg = (double) sum / numDays;
        // count days above average
        int above = 0;
        for (int temp : temps) {
            if (temp > avg) {
                above++;
            }
        }

        System.out.println();
        System.out.println("Average Temp = " + avg);
        System.out.println(above + " day(s) above average");

    }

}
