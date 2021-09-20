package com.vanessavps.patterns.structural.decorator;

import com.vanessavps.patterns.structural.decorator.shape.Circle;
import com.vanessavps.patterns.structural.decorator.shape.Rectangle;
import com.vanessavps.patterns.structural.decorator.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedShapeDecoratorTest {

  @Test
  public void testRectangle() {
    Shape rectangle = new Rectangle();
    assertEquals("Drawing a rectangle", rectangle.draw());
  }

  @Test
  public void testCircle() {
    Shape circle = new Circle();
    assertEquals("Drawing a circle", circle.draw());
  }

  @Test
  public void testRedRectangle() {
    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    assertEquals("Drawing a rectangle - It has red border", redRectangle.draw());
  }

  @Test
  public void testRedCircle() {
    Shape redCircle = new RedShapeDecorator(new Circle());
    assertEquals("Drawing a circle - It has red border", redCircle.draw());
  }
}
