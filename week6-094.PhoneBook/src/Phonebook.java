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

public class Phonebook {
    ArrayList<Person> phonebook;
    
    public Phonebook(){
        this.phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        phonebook.add(new Person(name, number));
    }
    
    public void printAll(){
        for(Person p: phonebook){
            System.out.println(p);
        }
    }
    
}
