
import java.util.Scanner;
public class ReversedPattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Input the number: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for (int i = n; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     
    }
}

