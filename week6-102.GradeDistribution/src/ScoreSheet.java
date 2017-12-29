/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
import java.util.ArrayList;
public class ScoreSheet {
       
    ArrayList<Score> scoreSheet;
    int[] grades = {0,0,0,0,0,0};
    public ScoreSheet(){
        scoreSheet = new ArrayList<Score>();
    }
   
    public int calculateGrade(int points){
        if(points > 0 && points <= 29){
            return 0;
        } else if(points < 35) {
            return 1;
        } else if(points < 40) {
            return 2;
        } else if(points < 45){
            return 3;
        } else if(points < 50){
            return 4;
        } else if(points <= 60)  {
            return 5;
        }
       
        return -1;
        
    }
    
    public void addGrade(int score){
        
        if(score > 0 && score <=60){
        this.scoreSheet.add(new Score(calculateGrade(score)));
        }
    }
    
    public void createGradeMap(){
        for(Score score: scoreSheet){
            grades[score.getScore()]++;
        }
    }
    
    public void printGrades(){
        System.out.println("Grade Distribution: ");
        for (int i = grades.length-1; i>= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");
            
            
        }
        System.out.println("Acceptance Percentage: " + calculateAcceptance() + "%");
    }
    
    public void printStars(int times){
        for (int i = 0; i < times; i++) {
            System.out.print("*");
        }
    }    
    public double calculateAcceptance(){
        int totalGrades = 0;
        
        for (int i = 0; i < this.grades.length; i++) {
            totalGrades += this.grades[i];
        }
        if(grades[0] == 0){
            return 100;
        }
        System.out.println(totalGrades);
        System.out.println(grades[0]);
        return (100-(((double)this.grades[0]/totalGrades)*100));
    }
          
       
    
    
}
