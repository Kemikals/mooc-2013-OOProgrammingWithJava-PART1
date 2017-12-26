/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class Person {
    private String name;
    private String number;
    
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }
    
    public void changeNumber(String number){
        this.number = number;
    }
    
    public String toString(){
        return this.name + "number: " + this.number;
    }
}
