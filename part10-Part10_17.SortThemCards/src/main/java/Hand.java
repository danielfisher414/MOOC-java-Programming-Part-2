/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> handList;

    public Hand() {
        handList = new ArrayList<>();
    }

    public void add(Card card) {
        handList.add(card);
    }

    public void print() {
        handList.stream().forEach(member -> System.out.println(member));
    }

    public void sort() {
        handList.stream().sorted().forEach(member -> System.out.println(member));
    }

    //compare based on the value of the card
    @Override
    public int compareTo(Hand compare) {

        int firstSum = handList.stream().mapToInt(m -> m.getValue()).sum();

        int secondSum = compare.handList.stream()
                .mapToInt(m -> m.getValue())
                .sum();
        if (firstSum > secondSum) {
            return 1;
        } else if (firstSum < secondSum) {
            return -1;
        } else {
            return 0;
        }

    }

    public void sortBySuit() {
        BySuitInValueOrder suitValue = new BySuitInValueOrder();
       
        handList.sort(suitValue);
        
//    Collections.sort(handList);
       
        
    }
}
