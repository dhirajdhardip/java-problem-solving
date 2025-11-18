import java.util.Scanner;

class SmallestElement {

   static int smallestNumber(int[]array){
       int smallest= Integer.MAX_VALUE;

       for(int i=0; i<array.length ; i++){

           if(array[i]<smallest){
               smallest=array[i];
           }
       }
       return smallest;

   }
    public static void main(String[] args) {

        int num;
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num= input.nextInt();

        int[] array =new int[num];
        System.out.println("Enter the number of array: ");
        for(int i=0; i<num; i++){
            array[i]=input.nextInt();
        }

        int result=smallestNumber(array);
        System.out.println("The smallest number ="+result);

    }

}
