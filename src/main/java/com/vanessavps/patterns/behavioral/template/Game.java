package com.vanessavps.patterns.behavioral.template;

public abstract class Game {
  abstract String initialize();

  abstract String startPlay();

  abstract String endPlay();

  /**
   * Template method
   *
   * @return the String with the play steps
   */
  public final String play() {
    StringBuilder sb = new StringBuilder();

    //initialize the game
    sb.append(initialize()).append("\n");

    //start game
    sb.append(startPlay()).append("\n");

    //end game
    sb.append(endPlay()).append("\n");

    return sb.toString();
  }
}
