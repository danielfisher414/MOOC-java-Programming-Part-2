
public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card compared) {
        //if both of the cards are the same this will be processed
      
//        if (this.suit == suit.HEART) {
//            System.out.println("hi");
//        }

        if (this.suit == compared.suit && this.value == compared.value) {
            return 0;
        }
        if (this.value < compared.value) {
            return -1;
        } else if (this.value > compared.value) {
            return 1;
        }

        if (this.value == compared.value) {
            //FOR SPADE SUITS

            if (this.suit == suit.SPADE) {

                return 1;
            } else if (this.suit == this.suit.HEART) {
                if (compared.suit == compared.suit.DIAMOND
                        || compared.suit == compared.suit.CLUB) {
                    return 1;
                }

            } else if (this.suit == this.suit.DIAMOND) {
                if (compared.suit == compared.suit.CLUB) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
