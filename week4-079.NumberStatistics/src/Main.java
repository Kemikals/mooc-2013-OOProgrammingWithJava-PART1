import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        
        int number = 0;
        while(number!=-1){
            
            System.out.println("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
            if(number!=-1){
            stats.addNumber(number);
            if(number%2==0){
                evenStats.addNumber(number);
            } else{
                oddStats.addNumber(number);
            }
            }
        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + evenStats.sum());
        System.out.println("Sum of Odd: " + oddStats.sum());
     }
}
