import java.util.Scanner;
 
public class Accounts {
 
    public static void main(String[] args) {
        Account newAccount = new Account("Anthony", 100.0);
        newAccount.deposit(20);
        System.out.println(newAccount);
    }
 
}