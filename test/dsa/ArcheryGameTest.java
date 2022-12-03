package dsa;

import chap7.Archery;
import chap7.Player;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ArcheryGameTest {
    private  Archery game;
    @BeforeEach
    public void setUp () {
        game = new Archery(1);
    }

    @Test
    public void testThatArcheryGameExists()  {
        assertNotNull(game);
}
@Test
    public void testThatPlayersCanJoinArcheryGame()  {
    Player [] players = game.getPlayers();
    assertNotNull(players);
    assertTrue(players.length > 0);

}
@Test
    public void testThatGameHasPlayer(){
        game.getPlayers();

}

}
