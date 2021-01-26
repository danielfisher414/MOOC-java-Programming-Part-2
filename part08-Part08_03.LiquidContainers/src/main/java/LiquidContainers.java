
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (number >= 0) {
                    first += number;
                    if (first > 100) {
                        first = 100;
                    }
                }
            } else if (command.equals("move")) {
                if (number >= 0) {
                    if (first >= number) {
                        second += number;
                        first -= number;

                    } else if (first <= number) {

                        System.out.println(first);
                        second += first;
                        first -= number;
                    }
                    if (first < 0) {
                        first = 0;
                    } else if (second > 100) {
                        second = 100;
                    }
                }
            } else if (command.equals("remove")) {
                second -= number;
                if (second < 0) {
                    second = 0;
                }
            }

        }
    }

}
