import java.util.ArrayList;

public class Game<firstCard> {


    private ArrayList<Player> players;
    private Deck deckOfCards;

    public Game(Deck deckOfCards) {
        this.players = new ArrayList<>();
        this.deckOfCards = deckOfCards;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int getPlayersCount() {
        return this.players.size();
    }

    public void playGame() {
        for(Player players: this.players){
            Card cardDealt =  this.deckOfCards.dealCard();
            players.addCardToHand(cardDealt);
        }
    }
    public String checkWhoWins(){
        int highestTotal = 0;
        String winningPlayer="";
        for (Player player: this.players){
            if(player.getHandValue() >= highestTotal){
                if(player.getHandValue()==highestTotal){
                    winningPlayer="Its a draw";
                } else {
                    highestTotal=player.getHandValue();
                    winningPlayer=player.getName();
                }
            }
        }
        return winningPlayer;
    }

}
