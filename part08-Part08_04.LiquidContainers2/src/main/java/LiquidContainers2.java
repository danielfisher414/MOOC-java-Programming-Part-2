
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();
        int amount = 0;
        while (true) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(number);

            } else if (command.equals("remove")) {
                container2.remove(number);

            } else if (command.equals("move")) {
                if (container1.contains() >= number) {
                    container2.add(number);
                    container1.remove(number);
                } else if(container1.contains() < number){
                    amount = container1.contains();
                    container1.remove(amount);
                    container2.add(amount);
                }
            }
        }
    }

}
