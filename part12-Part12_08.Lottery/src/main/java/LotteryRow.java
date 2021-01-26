
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created

        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {

        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        for (int i = 0; i < 7; i++) {
            int randNum = this.random.nextInt(41 - 1) + 1;
            if (containsNumber(randNum) == false) {

                this.numbers.add(randNum);
            }else if(containsNumber(randNum)==true){
            i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
