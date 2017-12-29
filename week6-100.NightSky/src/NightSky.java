/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
import java.util.Random;
public class NightSky {
   private double density;
    private int width;
    private int height;
  
   private int starsInLastPrint;
    public NightSky(double density){
      
        this.density = density;
        this.width = 20;
        this.height = 10;
        

    }
    
    public NightSky(int width, int height){
    
        this.width = width;
        this.height = height;
        this.density = 0.1;
       
    }
    
    public NightSky(double density, int width, int height){
   
        this.density = density;
        this.width = width;
        this.height = height;
       
    }
    
    public void printLine(){
        String stars = "";
        
        String symbol;
        for(int i = 0; i < this.width; i++){
            double probability = randomDouble();
            if(probability <= this.density){
            stars += "*";
                 starsInLastPrint++;
            } else{
                stars += " ";
               
        }
        
    }
        System.out.println(stars);
    }
    public void print(){
        starsInLastPrint = 0;
        for(int i = 0; i < this.height; i++){
            printLine();
        }
    }
    
    public double randomDouble(){
        Random rand = new Random();
        return rand.nextDouble();
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
    
    
}
