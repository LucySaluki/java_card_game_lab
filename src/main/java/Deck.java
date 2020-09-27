import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int cardCount(){
        return this.cards.size();
    }
    //initialize pack
    public void initialisePack(){
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                Card card = new Card(suit,rank);
                this.cards.add(card);
            }
        }
    }
    //shuffle cards
    public void shufflePack(){
        Collections.shuffle(this.cards);
    }
    // deal a card from the top
    public Card dealCard(){
        if (this.cardCount()>=1){
            return this.cards.remove(0);
        }
        return null;
    }

    public int findCard(Card singleCard) {
        for (int i = 0; i < cards.size(); i++) {
            if (singleCard.getSuit()==cards.get(i).getSuit() && singleCard.getRank()==cards.get(i).getRank()) {
                return i;
            }
        }
        return -1;
    }
}
