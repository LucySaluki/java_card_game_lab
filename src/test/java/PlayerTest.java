import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1;
    private Card card1;

    @Before
    public void before(){
        player1=new Player("Sonny");
        card1= new Card(Suit.HEARTS,Rank.JACK);
    }

    @Test
    public void playerHasName(){
        assertEquals("Sonny", player1.getName());
    }

    @Test
    public void playerStartsWithEmptyHand(){
        assertEquals(0,player1.getHandSize());
    }
    @Test
    public void cardIsAddedToPlayerHand(){
        player1.addCardToHand(card1);
        assertEquals(1, player1.getHandSize());
    }

}
