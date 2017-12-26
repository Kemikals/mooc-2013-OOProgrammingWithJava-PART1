import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type numbers:\n");
        int i;
        int sum = 0;
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        
       do{
         i = Integer.parseInt(reader.next());
         if(i!=-1){ 
         count++;
         sum += i;
         if(i%2==0){
             evenCount++;
         } else{
             oddCount++;
         }
         }
       }while(i!=-1);
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + ((float)sum/(float)count));
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
       
       
    }
}
