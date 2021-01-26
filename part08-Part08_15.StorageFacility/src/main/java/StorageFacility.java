
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> hashmap;

    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.hashmap.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = this.hashmap.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> empty = new ArrayList<>();
        empty.add("");
        if (!hashmap.containsKey(storageUnit)) {
            return empty;
        } else if (hashmap.containsKey(storageUnit)) {
            return hashmap.get(storageUnit);
        }

        return null;
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> removeList = this.hashmap.get(storageUnit);
        removeList.remove(item);
        hashmap.put(storageUnit, removeList);

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> listOfUnits = new ArrayList<>();

        for (String keys : hashmap.keySet()) {

            if (hashmap.get(keys).size() != 0) {
                listOfUnits.add(keys);
            }
        }

        return listOfUnits;
    }

}
