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
    ArrayList<Bird> birds;
    
    public Database(){
        birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName){
        birds.add(new Bird(name, latinName));
        
    }
    
    public void observe(String name){
        
        if(exists(name)){
            
        }
        
    }
        
    
    
    
    public boolean exists(String name){
        for(Bird b: birds){
            if(b.getName().trim().toLowerCase().equalsIgnoreCase(name.trim().toLowerCase())){
                return true;
            } else{
                return false;
            }
        }
        return false;
    } 
    
}
