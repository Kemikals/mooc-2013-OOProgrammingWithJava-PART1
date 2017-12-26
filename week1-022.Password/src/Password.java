
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean incorrect = true;
        String password = "carrot"; // Use carrot as password when running tests.
        while(incorrect){
        System.out.print("Type the password: ");
        String input = reader.next();
        
        
        if(input.equals(password)){
            System.out.println("Right!");
            incorrect = false;
            System.out.println("The secret is: jryy qbar!");
        }else{
            System.out.println("Wrong!");
        }
        } // Write your code here
    }
}
