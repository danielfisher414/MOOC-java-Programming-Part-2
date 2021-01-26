
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int count = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input >= 0) {
                if (input == 0) {
                    if (average == 0) {
                        System.out.println("Cannot calculate the average");
                    } else {
                        System.out.println(average / count);
                    }
                    break;
                }
                average += input;
                count++;
            }
        }
    }
}
