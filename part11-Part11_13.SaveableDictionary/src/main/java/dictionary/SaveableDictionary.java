/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class SaveableDictionary {

    private HashMap<String, String> wordsList;
    private String file;

    public SaveableDictionary() {
        this.wordsList = new HashMap<>();

    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {

        try (Scanner scanner = new Scanner(Paths.get(this.file))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // if the line is blank we do nothing
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        return true;
    }

    public boolean save() {

        try {
            PrintWriter writer = new PrintWriter(this.file);
            //putting the values in the hashmap
            load();
            Iterator iterator = this.wordsList.entrySet().iterator();
            while (iterator.hasNext()) {
                String word = iterator.next().toString();
                String changeWord = word.replace("=", ":");

                writer.println(changeWord);
            }

            //closing the file
            writer.close();

            return true;
        } catch (Exception e) {

            System.out.println("error " + e.getMessage());
            return false;
        }

    }

    public void add(String words, String translation) {
        if (!this.wordsList.containsKey(words)) {
            this.wordsList.put(words, translation);
        }
    }

    public String translate(String word) {
        for (String key : wordsList.keySet()) {
//            System.out.println("keys: "+key);
            if (wordsList.containsKey(word)) {
                return wordsList.get(word);
            } else if (wordsList.get(key).contains(word)) {

                return key;
            }
        }
        return null;
    }

    public void delete(String word) {
        Iterator iterator = wordsList.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toString().contains(word)) {
                iterator.remove();
            }
        }
    }
}
