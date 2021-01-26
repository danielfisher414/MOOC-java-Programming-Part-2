
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> list;

    public DictionaryOfManyTranslations() {
        this.list = new HashMap<>();

    }

    public void add(String word, String translation) {
        this.list.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translationList = this.list.get(word);
        translationList.add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> empty = new ArrayList<>();
        empty.add("");

        if (!list.containsKey(word)) {
            list.put(word, empty);

        } else if (list.containsKey(word)) {
                list.values().remove(empty);

                return list.get(word);
            
        }

        return new ArrayList<String>();
    }

    public void remove(String word) {

        if (this.list.containsKey(word)) {
            this.list.remove(word);
        } else {
            System.out.println("cant find it mate");
        }

    }
}
