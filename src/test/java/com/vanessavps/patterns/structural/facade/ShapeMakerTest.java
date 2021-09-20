package com.vanessavps.patterns.structural.facade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeMakerTest {

  @Test
  public void testDrawShapes() {
    //The implementation is transparent for the client
    ShapeMaker shapeMaker = new ShapeMaker();

    assertEquals("Drawing a circle", shapeMaker.drawCircle());
    assertEquals("Drawing a rectangle", shapeMaker.drawRectangle());
    assertEquals("Drawing a square", shapeMaker.drawSquare());
  }
}
