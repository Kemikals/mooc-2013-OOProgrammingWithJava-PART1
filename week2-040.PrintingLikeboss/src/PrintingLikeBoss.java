public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
     int i = 1;  
   while(i <= size){
       printWhitespaces(size-i);
       printStars(i);
       i++;
   }
        
    }

    public static void xmasTree(int height) {
        int h = height;
        int stars = 1;
        int standSpace;
        int i = 1;
        while(i <= height+1){
                      
                printWhitespaces(height-i);
                printStars(stars);
            
            stars = stars + 2;
            i++;
            
            if(i==height+1){
                printWhitespaces(height-2);
                printStars(3);
                printWhitespaces(height-2);
                printStars(3);
                break;
             }
  }
                           
                           
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
