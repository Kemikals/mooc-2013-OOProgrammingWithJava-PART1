
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username1 = "alex";
        String username2 = "emily";
        String password1 = "mightyducks";
        String password2 = "cat";
        
        System.out.print("Type your username: ");
        String username = reader.nextLine();
        System.out.print("Type your password: ");
        String password = reader.nextLine();
        
        if(username.equals(username1) && password.equals(password1)){
            System.out.println("You are now logged into the system!");
            
        }else if(username.equals(username2) && password.equals(password2)){
            System.out.println("You are now logged into the system!");
        } else{
            System.out.println("Your username or password was invalid!");
        }
        
    }
}
