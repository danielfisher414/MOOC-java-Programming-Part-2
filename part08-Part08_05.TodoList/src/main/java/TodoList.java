
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
public class TodoList {

   private ArrayList<String> list = new ArrayList<>();

    public TodoList() {
        this.list = list;
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int count = 1;
        for (int index = 0; index < this.list.size(); index++) {
            System.out.println(count + ": " + this.list.get(index));
            count++;
        }

    }

    public void remove(int number) {
        number -= 1;
        this.list.remove(number);
    }
}
