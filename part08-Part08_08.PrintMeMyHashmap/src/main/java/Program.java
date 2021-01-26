
import java.util.HashMap;
import java.util.stream.Collectors;

public class Program {

    private HashMap<String, String> hashmap;

    public Program() {
        this.hashmap = new HashMap<>();
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String i : hashmap.keySet()){
        if(i.contains(text)){
            System.out.println(hashmap.get(i));
        }
        }

    }

}
