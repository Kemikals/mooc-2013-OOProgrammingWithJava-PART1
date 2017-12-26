
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

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
      
        Collections.sort(words);
        for(String word: words){
            System.out.println(word);
        }
    
    }
}
