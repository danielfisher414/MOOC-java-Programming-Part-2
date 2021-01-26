
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
public class Herd implements Movable {

    private ArrayList<Movable> herdList;


    public Herd() {
        herdList = new ArrayList<>();

    }

    public String toString() {
        String word = "";
        for(Movable value:this.herdList){
            word += value.toString() ;
            word += "\n";
        }
        return word;
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    public void move(int dx, int dy) {
          for(Movable value : this.herdList){
          value.move(dx, dy);
          }
    }
}
