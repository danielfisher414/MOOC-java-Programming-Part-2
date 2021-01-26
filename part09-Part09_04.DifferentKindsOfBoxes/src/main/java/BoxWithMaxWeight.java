
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
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> boxList;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        boxList = new ArrayList<>();

    }

    @Override
    public void add(Item item) {

        if (item.getWeight() <= this.capacity) {

            int weight = item.getWeight();
            this.boxList.add(item);
//             System.out.println(this.capacity);
            this.capacity -= weight;
//            System.out.println(this.capacity);
            if (this.capacity < 0) {

                this.boxList.remove(item);
                this.capacity += item.getWeight();
            }

        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item value : this.boxList) {
            if (value.getName().contains(item.getName())) {
                return true;
            }

        }

        return false;
    }

}
