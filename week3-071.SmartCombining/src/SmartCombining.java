import java.util.ArrayList;
import java.util.Collections;
 
public class SmartCombining {
    public static void main(String[] args) {
 
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
 
        Collections.addAll(list1, 4, 3);
 
        Collections.addAll(list2, 5, 10, 4, 3, 7);
 
        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }
public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
    for (Integer numbers: second) {
        if(!first.contains(numbers)){
            first.add(numbers);
        }
         
    }
}
}