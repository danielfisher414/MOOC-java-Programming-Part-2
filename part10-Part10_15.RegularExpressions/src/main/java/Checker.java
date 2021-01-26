
public class Checker {

    public Checker() {
    }

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }

        return false;
    }

    public boolean allVowels(String string) {

        if (string.matches("(a|i|e|o|u)+")) {
            return true;
        }

        return false;

    }

    public boolean timeOfDay(String string) {

        if(string.matches("(00|2[0-3]|1[0-9]|0[0-9]):(00|[0-5][0-9]):(00|[0-5][0-9])")){
        return true;
        }
        
        return false;
    }
}
