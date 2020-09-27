import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;
    private Deck deck;
    private Card winningCard;
    private Card losingCard;
    private Card drawCard;

    @Before
    public void before(){
        player1=new Player("Sonny");
        player2 = new Player("Lucy");
        deck=new Deck();
        game= new Game(deck);
        game.addPlayer(player1);
        game.addPlayer(player2);
        winningCard=new Card(Suit.HEARTS,Rank.KING);
        losingCard=new Card(Suit.CLUBS,Rank.THREE);
        drawCard=new Card(Suit.DIAMONDS,Rank.THREE);
    }

    @Test
    public void gameStartsWith2Players(){
        assertEquals(2,game.getPlayersCount());
    }

    @Test
    public void playersCanBeAdded(){
        assertEquals(2,game.getPlayersCount());
    }

    @Test
    public void playersReceiveCards(){
        deck.initialisePack();
        deck.shufflePack();
        game.playGame();
        assertEquals(1,player1.getHandSize());
        assertEquals(1,player2.getHandSize());
    }
    @Test
    public void canFindWinningPlayer(){
        player1.addCardToHand(winningCard);
        player2.addCardToHand(losingCard);
        assertEquals("Sonny", game.checkWhoWins());
    }
    @Test
    public void canFindDraw(){
        player1.addCardToHand(drawCard);
        player2.addCardToHand(losingCard);
        assertEquals("Its a draw", game.checkWhoWins());
    }
}
