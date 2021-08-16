package com.vanessavps.patterns.creational.factory;

import com.vanessavps.patterns.creational.factory.shape.Circle;
import com.vanessavps.patterns.creational.factory.shape.Rectangle;
import com.vanessavps.patterns.creational.factory.shape.Shape;
import com.vanessavps.patterns.creational.factory.shape.Square;

public class ShapeFactory {
  public enum ShapeType {SQUARE, RECTANGLE, CIRCLE}

  //Given a ShapeType, the desired shape will be created and its interface returned
  public Shape createShape(ShapeType shapeType) {
    switch (shapeType) {
      case RECTANGLE:
        return new Rectangle();
      case SQUARE:
        return new Square();
      case CIRCLE:
        return new Circle();
      default:
        return null;
    }
  }
}
