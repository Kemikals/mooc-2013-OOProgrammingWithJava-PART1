
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondword = reader.nextLine();
        int contains = word.indexOf(secondword);
        
    
        
          if(contains != -1){
            System.out.println("The word " + secondword+ " is found in the word " + word+  ".");
        }else{
            System.out.println("The word " + secondword+ " is not found in the word " + word+  ".");
        }
    }
    }
    

