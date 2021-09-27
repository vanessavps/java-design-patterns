package com.vanessavps.patterns.structural.flyweight;

import com.vanessavps.patterns.structural.flyweight.shape.Circle;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeFlyweightFactoryTest {

  @Test
  public void testGetCircle() {
    for (int i = 0; i < 50; ++i) {
      Color color = getRandomColor();
      int x = getRandom();
      int y = getRandom();
      int radius = getRandom();

      String expectedDraw = "Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius;

      Circle circle = (Circle) ShapeFlyweightFactory.getCircle(color);
      circle.setX(x);
      circle.setY(y);
      circle.setRadius(radius);
      assertEquals(expectedDraw, circle.draw());
    }

    assertTrue(ShapeFlyweightFactory.circleMapSize() <= 5);
  }

  private Color getRandomColor() {
    return Color.values()[new Random().nextInt(Color.values().length)];
  }

  private static int getRandom() {
    return (int) (Math.random() * 100);
  }
}
