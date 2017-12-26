
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
       String reverse = "";
       int i = text.length();
      for(;i>0; i--){
          reverse = reverse + text.charAt(i-1);
      } 
      
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
