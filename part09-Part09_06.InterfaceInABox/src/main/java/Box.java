
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
public class Box implements Packable {

    private ArrayList<Packable> itemList;

    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        itemList = new ArrayList<>();

    }

    public double weight() {

        double weight = 0;
        for (Packable values : itemList) {
            weight += values.weight();
        }

        return weight;

    }

    public void add(Packable item) {
        if (item.weight() < this.maxCapacity) {
            itemList.add(item);
            this.maxCapacity -= item.weight();
        }
        if (this.maxCapacity < 0) {
            itemList.remove(item);
            this.maxCapacity += item.weight();
        }
    }

    public String toString() {
        int size = itemList.size();
        return "Box: " + size + " items, total weight " + weight() + " kg";
    }

}
