
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
String name1, name2;
        int age1, age2;
        
        System.out.print("Type your name: ");
        name1 = reader.next();
        System.out.print("Type your age: ");
        age1 = reader.nextInt();
        
        System.out.print("\nType your name: ");
        name2 = reader.next();
        System.out.print("Type your age: ");
        age2 = reader.nextInt();
        
        System.out.println("\n" +name1 + " and " + name2 + " are " + (age1+age2) + " years old in total.");
        // Implement your program here
    }
}
