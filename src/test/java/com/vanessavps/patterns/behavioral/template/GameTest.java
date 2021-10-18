package com.vanessavps.patterns.behavioral.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
  @Test
  public void testPlay() {
    Game game = new Cricket();
    assertEquals("Cricket Game Initialized! Start playing.\n" +
                 "Cricket Game Started. Enjoy the game!\n" +
                 "Cricket Game Finished!\n",
                 game.play());

    game = new Football();
    assertEquals("Football Game Initialized! Start playing.\n" +
                 "Football Game Started. Enjoy the game!\n" +
                 "Football Game Finished!\n",
                 game.play());
  }
}
