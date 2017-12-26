import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        while(this.numbers.size()<7){
            int randomNumber = (1+random.nextInt(39));
            if(!containsNumber(randomNumber)){
                numbers.add(randomNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
       return this.numbers.contains(number);
       
    }
}
