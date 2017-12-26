
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int radius;
        System.out.print("Type the radius: ");
        radius = reader.nextInt();
        double circumfrence = 2 * Math.PI * radius;
        System.out.println("Circumfrence of the circle: " + circumfrence);
    }
}
