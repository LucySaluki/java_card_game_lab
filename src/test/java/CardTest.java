import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;

    @Before
    public void before(){
        card= new Card(Suit.HEARTS,Rank.JACK);
    }
    @Test
    public void cardHasRank(){
        assertEquals("JACK",card.getRank().toString());
    }
    @Test
    public void cardHasSuit(){
        assertEquals("HEARTS", card.getSuit().toString());
    }
    @Test
    public void cardHasValue(){
        assertEquals(11,card.getValueFromEnum());
    }
}
