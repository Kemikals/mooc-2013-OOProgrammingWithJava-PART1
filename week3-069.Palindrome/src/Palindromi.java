import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
       
        int i = text.length()-1;
        String helper = "";
        System.out.print("In reverse order: ");
        for (; i >= 0; i--) {
            helper += text.charAt(i);
        }
    return helper.equals(text);  
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
