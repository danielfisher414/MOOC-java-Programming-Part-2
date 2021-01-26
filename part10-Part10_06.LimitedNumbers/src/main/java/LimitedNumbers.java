
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                break;
            }
            inputList.add(input);
        }
        inputList.stream()
                .filter(number -> number >= 1)
                .filter(number -> number <= 5)
                .forEach(value -> System.out.println(value));

    }
}
