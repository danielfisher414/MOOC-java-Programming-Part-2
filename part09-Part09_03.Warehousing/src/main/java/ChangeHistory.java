
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();

    }

    public void add(double status) {

        this.history.add(status);

    }

    public void clear() {
        this.history.removeAll(history);
    }

    public double maxValue() {
        double sum = 0;
        if (this.history.isEmpty()) {
            return 0;
        } else {
            for (Double value : history) {

                if (value > sum) {
                    sum = value;
                }
            }

        }
        return sum;
    }

    public double minValue() {

        
        double firstNum = this.history.get(0);
        if (this.history.size() == 1) {
            return this.history.get(0);
        } 
        for(Double value: this.history){
          
        if(firstNum > value){
        firstNum = value;
        }
        }

        return firstNum;
    }

    public double average() {
        double total = 0;
        double count = 0;
        double average = 0;
        for (Double value : history) {
            count++;
            total += value;
        }
        average = total / count;
        return average;
    }

    public String toString() {
        String list = this.history.toString();
        return list;
    }
}
