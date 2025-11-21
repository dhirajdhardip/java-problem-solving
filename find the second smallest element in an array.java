import java.util.*;

class SecondSmallest {

    static int findSecondSmallest(int[] array) {

        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {

            if(array[i] < smallest) {
                ssmallest = smallest;
                smallest = array[i];
            }
            else if(array[i] > smallest && array[i] < ssmallest) {
                ssmallest = array[i];
            }
        }

        return ssmallest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of input: ");
        int number = input.nextInt();

        int[] array = new int[number];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < number; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The second smallest number is: " + findSecondSmallest(array));

    }
}
