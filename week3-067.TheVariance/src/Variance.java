import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(Integer numbers: list){
            sum+=numbers;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        return sum/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
       double mean = average(list);
     
       double sumOfMean = 0;
       for(Integer number: list){
           sumOfMean += Math.pow((number-mean), 2);
       }
       
        return sumOfMean/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
