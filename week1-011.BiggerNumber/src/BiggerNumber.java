import java.util.Scanner;
 
public class BiggerNumber {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a,b;
        System.out.print("Type a number: ");
        a = reader.nextInt();
        System.out.print("\nType another number: ");
        b = reader.nextInt();
        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
 
        // Implement your program here. Remember to ask the input from user
    }
}

