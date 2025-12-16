import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static int[] sortArray(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        int[] sortedArray = sortArray(nums);
        System.out.println("After sorting the array : " + Arrays.toString(sortedArray));
    }
}

