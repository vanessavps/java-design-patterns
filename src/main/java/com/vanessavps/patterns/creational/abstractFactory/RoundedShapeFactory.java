package com.vanessavps.patterns.creational.abstractFactory;

import com.vanessavps.patterns.creational.abstractFactory.shape.RoundedRectangle;
import com.vanessavps.patterns.creational.abstractFactory.shape.RoundedSquare;
import com.vanessavps.patterns.creational.abstractFactory.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {

  //Given a ShapeType, the desired shape will be created and its interface returned

  @Override
  Shape getShape(ShapeType shapeType) {
    switch (shapeType) {
      case RECTANGLE:
        return new RoundedRectangle();
      case SQUARE:
        return new RoundedSquare();
      default:
        return null;
    }
  }
}
