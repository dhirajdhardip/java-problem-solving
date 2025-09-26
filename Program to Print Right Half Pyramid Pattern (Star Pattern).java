// Given an integer N, print N rows of right half pyramid pattern. In right half pattern of N rows, the first row has 1 star, second row has 2 stars and so on till the Nth row which has N stars. All the stars are left aligned.

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Input the number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     
    }
}
