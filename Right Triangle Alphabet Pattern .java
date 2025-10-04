
//Creates a right-aligned triangle by adding spaces before printing increasing characters from 'A

import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
         int n;
         System.out.println("Enter the number: ");
         Scanner input =new Scanner(System.in);
         n= input.nextInt();

         for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
             char ch='A';
            for(int j=1; j<=i; j++){

                 System.out.print(ch );
              ch++;

            }
            System.out.println();

        }
    }
}
