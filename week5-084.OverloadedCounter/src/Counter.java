/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waiti
 */
public class Counter {
    
    boolean check;
    int counter;
    
    public Counter(int startingValue, boolean check){
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this.counter = startingValue;
    }
    
    public Counter(boolean check){
        this.check = check;
        this.counter = 0;
    }
    
    public Counter(){
        this.counter = 0;
    }
    
   public int value(){
        return this.counter;
    }
   
   public void increase(){
        this.counter++;
   }
   
   public void increase(int increaseAmount){
       if(increaseAmount > 0){
           this.counter+= increaseAmount;
       } 
   }
   public void decrease(){
       if(this.check){
           if(this.counter > 0){
               this.counter--;
           }
       } else{
           this.counter--;
       }
       
   }
   
   public void decrease(int decreaseAmount){
       if(this.check){
           if((this.counter - decreaseAmount) > 0){
               this.counter -= decreaseAmount;
           } else{
               this.counter = 0;
           }
       } else if(decreaseAmount > 0){
           this.counter -= decreaseAmount;
       }
   }
    
}
