import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ScoreSheet scoreSheet = new ScoreSheet();
        int score;
        System.out.println("Type exam scores, -1 completes"); 
        do{
            score = input.nextInt();
            scoreSheet.addGrade(score);
            
       }while(score!= -1);
        
        scoreSheet.createGradeMap();
        scoreSheet.printGrades();
        
    }
}
