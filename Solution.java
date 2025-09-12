//Write a Java Program to Compute the Sum of Array Elements.

import java.util.Scanner;

public class Solution {


    public static int sumofArray(int[] array, int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of elements: ");
        int num = input.nextInt();

        int[] array = new int[num];

        System.out.println("Input the elements of the array:");
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }

        int result = sumofArray(array, num);
        System.out.println("The sum of array elements is: " + result);

        input.close();
    }
}
