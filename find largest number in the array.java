import java.util.Scanner;

public class LargestElement {
    
    public static int largestNumber(int[]array) {

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > largest) {
                largest = array[i];

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int  num;
        System.out.println("Enter the number: ");
        Scanner input =new Scanner(System.in);
        num= input.nextInt();

        int []array =new int[num];
        System.out.println("Enter the number of array: ");
        for(int i=0; i<num; i++){
            array[i]=input.nextInt();

        }
      int largest= largestNumber(array);
        System.out.println("The largest number is: " + largest);

    }
}
