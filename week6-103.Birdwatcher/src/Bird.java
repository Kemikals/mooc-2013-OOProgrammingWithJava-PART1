/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class Bird {
    private String name;
    private String latinName;
    private int timesObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        timesObserved = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the latinName
     */
    public String getLatinName() {
        return latinName;
    }

    /**
     * @return the timesObserved
     */
    public int getTimesObserved() {
        return timesObserved;
    }
    
    public void observed(){
        this.timesObserved++;
    }
    
}
