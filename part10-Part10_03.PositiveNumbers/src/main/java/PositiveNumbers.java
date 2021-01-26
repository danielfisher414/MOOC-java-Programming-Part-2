
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        System.out.println( positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {

        ArrayList<Integer> posNumbers = numbers.stream()
                .filter(number -> number>=0)
                .collect(Collectors.toCollection(ArrayList::new));
                
        
        return posNumbers;

    }
}
