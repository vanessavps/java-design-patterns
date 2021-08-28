package com.vanessavps.patterns.creational.abstractFactory;

import com.vanessavps.patterns.creational.abstractFactory.shape.Rectangle;
import com.vanessavps.patterns.creational.abstractFactory.shape.Shape;
import com.vanessavps.patterns.creational.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

  //Given a ShapeType, the desired shape will be created and its interface returned
  @Override
  Shape getShape(ShapeType shapeType) {
    switch (shapeType) {
      case RECTANGLE:
        return new Rectangle();
      case SQUARE:
        return new Square();
      default:
        return null;
    }
  }
}
