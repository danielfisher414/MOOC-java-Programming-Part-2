
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    
                    .map(parts -> new Person(parts[3], parts[2].replace("(%)", "").trim(), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    
                    .forEach(person -> list.add(person));
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        
        list.stream()
                .sorted()
                .forEach(person -> System.out.println(person));
                
    }
}
