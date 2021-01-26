
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        //compares both cards that have similarities
        //such as similar cards
        if (c1.getSuit() == c2.getSuit()
                && c1.getValue() == c2.getValue()) {

            return 0;
        } else if (c1.getSuit() == c2.getSuit()) {
            if (c1.getValue() < c2.getValue()) {
                return -1;
            } else if (c1.getValue() > c2.getValue()) {
                return 1;
            }
            //else if statements that now are listing the cards
        }

        if (c1.getSuit() == Suit.CLUB) {
            return -1;
        } else if (c1.getSuit() == Suit.DIAMOND) {
            if (c2.getSuit() == Suit.CLUB) {
                return 1;
            } else {
                return -1;
            }
        } else if (c1.getSuit() == Suit.HEART) {
            if (c2.getSuit() == Suit.DIAMOND
                    || c2.getSuit() == Suit.CLUB) {
                return 1;
            } else {
                return -1;
            }
        } else if (c1.getSuit() == Suit.SPADE) {
            return 1;
        }

        return 0;
    }

}
