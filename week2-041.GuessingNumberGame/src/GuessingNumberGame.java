
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guess;
        int guesses = 0;
        System.out.print("Guess a number: ");
        
        
        do{
        guess = Integer.parseInt(reader.next());
        guesses++;
        if(guess>numberDrawn){
            System.out.println("The number is lesser, guesses made" + guesses);
        }else if(guess<numberDrawn){
            System.out.println("The number is greater, guesses made" + guesses);
        }else{
            System.out.println("Congratulations, your guess is correct!, guesses made" + guesses);
        }
        }while(guess!=numberDrawn);
        

       
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
