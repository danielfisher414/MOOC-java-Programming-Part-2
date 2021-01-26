
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
public class OneItemBox extends Box {
    
    private ArrayList<Item> singleItem;
    
    public OneItemBox() {
        singleItem = new ArrayList<>();
        
    }

    @Override
    public void add(Item item) {
        
        if (singleItem.size() == 0) {
            singleItem.add(item);
        }
        
    }
    
    @Override
    public boolean isInBox(Item item) {
        for (Item value : singleItem) {
            
            if (value.getName().contains(item.getName())) {
                return true;
            }
        }
        
        return false;
    }
    
}
