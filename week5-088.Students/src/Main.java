import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<Student>();
        String name = "";
         
        while(true){
         
        System.out.print("Name: ");
        name = input.nextLine();
         if(name.isEmpty()){
            break;
        }
        System.out.print("Student Number: ");
        String number = input.nextLine();
        
        Students.add(new Student(name, number));
        }
         
        for(Student s: Students){
            System.out.println(s);
             
            
        }
         System.out.print("Give search term: ");
         System.out.println("Result: ");
         String searchTerm = input.nextLine();
        for(Student s: Students){
            
            if(s.getName().contains(searchTerm) || s.getStudentNumber().contains(searchTerm) ){
                System.out.println(s);
            }
        }
    }
}