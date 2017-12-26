
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
       if(guessedLetters.contains(letter)){
           return;
       } 
       this.guessedLetters += letter;
       
       if(!word.contains(letter)){
           this.numberOfFaults++;
       }
       
    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            String wordString = "" + this.word.charAt(i);
            if(guessedLetters.contains(wordString)){
                hiddenWord += wordString;
            } else{
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
