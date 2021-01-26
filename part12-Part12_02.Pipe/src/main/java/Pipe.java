
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
public class Pipe<T> {

    private T value;
    private ArrayList<T> list = new ArrayList<>();

    public void putIntoPipe(T value) {
        list.add(value);
//        System.out.println(list);
    }

    public T takeFromPipe() {
        int first = 0;

        if (!list.isEmpty()) {
            T lastName =list.get(first);
            list.remove(first);
            return lastName;
        } else {
            return null;
        }
    }

    public boolean isInPipe() {
        if (this.list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
