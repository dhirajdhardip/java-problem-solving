 import java.util.Scanner;

public class SecondLargestElement{

    public static int secondLarge(int[] array) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
            else if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of input: ");
        int num = input.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the numbers of arrays: ");
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }

        int result = secondLarge(array);
        System.out.println("Second Largest: " + result);
    }
}
