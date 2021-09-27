package com.vanessavps.patterns.creational.factory;

import com.vanessavps.patterns.creational.factory.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeFlyweightFactoryTest {
  private final ShapeFactory shapeFactory = new ShapeFactory();

  @Test
  public void testShapeFactory() {
    //Create different shapes using the shape factory
    Shape circle = shapeFactory.createShape(ShapeFactory.ShapeType.CIRCLE);
    Shape rectangle = shapeFactory.createShape(ShapeFactory.ShapeType.RECTANGLE);
    Shape square = shapeFactory.createShape(ShapeFactory.ShapeType.SQUARE);

    //Draw method will have each shape type implementation
    assertEquals("Drawing a circle", circle.draw());
    assertEquals("Drawing a rectangle", rectangle.draw());
    assertEquals("Drawing a square", square.draw());
  }
}
