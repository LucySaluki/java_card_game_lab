import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name=name;
        this.hand=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandSize(){
        return this.hand.size();
    }
    public void addCardToHand(Card card){
        hand.add(card);
    }
    public int getHandValue(){
        int totalOfHand=0;
        for (Card card: this.hand){
            totalOfHand += card.getValueFromEnum();
        }
        return totalOfHand;
    }
}
