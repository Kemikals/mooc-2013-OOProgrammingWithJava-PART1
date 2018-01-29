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
public class Database {
    private ArrayList<Bird> birds;
    
    public Database(){
        birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName){
        getBirds().add(new Bird(name, latinName));
        
    }
    
    public void observe(String name){
       int indexOfBirdName =  indexOfBirdName(name);
        if(indexOfBirdName != -1){
            getBirds().get(indexOfBirdName).observed();
        
    } else{
            System.out.println("Is not a bird!");
        }
        
    }

    

    public int indexOfBirdName(String name){
        int indexOfBirdName = -1;
        int index = 0;
        for(Bird b: getBirds()){
            if(b.getName().toLowerCase().equals(name.toLowerCase())){
                indexOfBirdName = index;
                break;
            }else{
                indexOfBirdName = -1;
                }
            index++;
        } 
        
    return indexOfBirdName;
}
    public ArrayList<Bird> getBirds() {
        return birds;
    }
    
   
    
}
