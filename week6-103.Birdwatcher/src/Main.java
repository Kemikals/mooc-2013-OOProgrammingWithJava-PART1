import java.util.Scanner;
import java.util.*;


public class Main {  
    
    Database birdDatabase = new Database();
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main command = new Main();
        
        String userInput;
        
        do{
            System.out.print("? ");  
            userInput = input.nextLine();
            command.commands(userInput.toLowerCase(), input);
            
            
        }while(!userInput.toLowerCase().equals("quit"));
            
    }
    
    public void commands(String command, Scanner input){
        
        if(command.equals("add")){
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.println("Latin Name");
                String latinName = input.nextLine();
                birdDatabase.addBird(name, latinName);
        }
        
        if(command.equals("observation")){
            System.out.print("What was observed:? ");
            String birdObserved = input.nextLine().toLowerCase();
            birdDatabase.observe(birdObserved);
        }
        
        if(command.equals("statistics")){
            for(Bird b: birdDatabase.getBirds())
                System.out.println(b);
                
            }
        if(command.equals("show")){
            System.out.print("What?");
            String name = input.nextLine();
            for(Bird b: birdDatabase.getBirds())
               if(b.getName().toLowerCase().equals(name.toLowerCase())){
                   System.out.println(b);
                  }
            
        }
        }
    }


