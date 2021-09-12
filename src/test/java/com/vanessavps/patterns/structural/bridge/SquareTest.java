package com.vanessavps.patterns.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

  @Test
  public void testRedSquare() {
    Shape square = new Square(new Red());
    assertEquals(square.draw(), "Square drawn. Color is red");
  }

  @Test
  public void testBlueSquare() {
    Shape square = new Square(new Blue());
    assertEquals(square.draw(), "Square drawn. Color is blue");
  }
}
