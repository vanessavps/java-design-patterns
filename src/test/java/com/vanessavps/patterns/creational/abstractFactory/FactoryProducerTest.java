package com.vanessavps.patterns.creational.abstractFactory;

import com.vanessavps.patterns.creational.abstractFactory.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryProducerTest {
  @Test
  public void testShapeAbstractFactory() {
    //Get normal shapes
    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    Shape rectangle = shapeFactory.getShape(AbstractFactory.ShapeType.RECTANGLE);
    Shape square = shapeFactory.getShape(AbstractFactory.ShapeType.SQUARE);

    //Draw method will have each shape type implementation
    assertEquals("Drawing a rectangle", rectangle.draw());
    assertEquals("Drawing a square", square.draw());
  }

  @Test
  public void testRoundedShapeAbstractFactory() {
    //Get rounded shapes
    AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
    Shape roundedRectangle = roundedShapeFactory.getShape(AbstractFactory.ShapeType.RECTANGLE);
    Shape roundedSquare = roundedShapeFactory.getShape(AbstractFactory.ShapeType.SQUARE);

    //Draw method will have each rounded shape type implementation
    assertEquals("Drawing a rounded rectangle", roundedRectangle.draw());
    assertEquals("Drawing a rounded square", roundedSquare.draw());
  }
}
