
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputList.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String decider = scanner.nextLine();

        double averageOfPos = inputList.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number >= 0).average().getAsDouble();
        double averageOfNeg = inputList.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();

        if (decider.equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPos);
        } else if (decider.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNeg);
        }
    }
}
