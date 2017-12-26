

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array){
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            
            reversed[j] = array[i];
            j++;
           
        }
        return reversed;
    }
    
}
