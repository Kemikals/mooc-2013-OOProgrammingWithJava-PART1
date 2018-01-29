
public class Main {

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }

        return smallest;
    }
    public static int indexOfTheSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }

        }
       
        return index;
}

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        

        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }

        }

        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
    
}
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            
            
        }
        
}
  
  



public static void main(String[] args) {
        

  
        
    }

}
