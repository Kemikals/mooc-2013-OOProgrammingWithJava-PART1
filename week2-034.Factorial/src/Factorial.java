import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int factorial = reader.nextInt();
     
        
            
        
        System.out.println("Factorial: " + fact(factorial));
    }

static int fact(int n)
    {
        int result;

       if(n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }
}
