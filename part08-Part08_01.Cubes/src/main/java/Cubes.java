
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int cube = 0;
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            cube = Integer.valueOf(input);
            cube = cube * cube * cube;
            System.out.println(cube);
        }
    }
}
