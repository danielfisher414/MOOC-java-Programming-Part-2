
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
public class IOU {

   
    private HashMap<String, Double> hashmap;

    public IOU() {
//        IOU iou = new IOU();
        this.hashmap = new HashMap();
    }

    public void setSum(String toWhom, double amount) {
        this.hashmap.put(toWhom, amount);
        this.hashmap.get(toWhom);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if(this.hashmap.containsKey(toWhom)){
        return this.hashmap.get(toWhom);
        }
        return 0;
    }

}
