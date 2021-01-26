
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        hashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
//        System.out.println(">: "+licensePlate.toString());

        if (!hashmap.containsKey(licensePlate)) {
            hashmap.put(licensePlate, owner);

            return true;
        }
//        System.out.println(">: " + hashmap.get(licensePlate));

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            return hashmap.get(licensePlate);
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate keys : hashmap.keySet()) {
            System.out.println(keys);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
        for (String value : hashmap.values()) {
            if (!list.contains(value)) {
                list.add(value);
                System.out.println(value);
                
            }
        }
    }
}
