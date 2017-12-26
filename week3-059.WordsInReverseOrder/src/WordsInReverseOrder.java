import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        
        String entry = "null";
        while(!entry.isEmpty()){
        System.out.print("Type a word: ");
        entry = reader.nextLine();
        words.add(entry);
        }
        
        System.out.println("You typed the following words: ");
        int i = words.size()-1;
        for (; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }
}
