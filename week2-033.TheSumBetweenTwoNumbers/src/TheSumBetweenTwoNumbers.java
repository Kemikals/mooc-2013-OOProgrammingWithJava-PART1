
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
          System.out.print("First: ");
          int first = reader.nextInt();
          System.out.print("Second: ");
        int second = reader.nextInt();
        
        int sum = 0;
        
        for(int i = first; i <= second; i++){
            sum += i;
    }
        System.out.println("The sum is: " + sum);
}}
