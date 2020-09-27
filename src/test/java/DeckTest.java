import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deckOfCards;
    private Card card;

    @Before
    public void before(){
        deckOfCards= new Deck();
        card= new Card(Suit.CLUBS,Rank.QUEEN);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0,deckOfCards.cardCount());
    }

    @Test
    public void initalizedDeckHas52Cards(){
        deckOfCards.initialisePack();
        assertEquals(52, deckOfCards.cardCount());
    }

    @Test
    public void firstCardInInitializedPackIsAceHearts(){
        deckOfCards.initialisePack();
        String str1=deckOfCards.dealCard().getRank().toString();
        String str2 =deckOfCards.dealCard().getSuit().toString();
        assertEquals("ACE of HEARTS",str1.concat(" of ").concat(str2));
    }

    @Test
    public void firstCardInShuffledPackIsNotAceHearts(){
        deckOfCards.initialisePack();
        deckOfCards.shufflePack();
        String str1=deckOfCards.dealCard().getRank().toString();
        String str2 =deckOfCards.dealCard().getSuit().toString();
        assertNotEquals("ACE of HEARTS",str1.concat(" of ").concat(str2));
    }

    @Test
    public void queenOfClubsMovesPositionAfterShuffling() {
        deckOfCards.initialisePack();
        deckOfCards.shufflePack();
        assertNotEquals(50,deckOfCards.findCard(card));
    }
}
