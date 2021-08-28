package com.vanessavps.patterns.creational.abstractFactory;

import com.vanessavps.patterns.creational.abstractFactory.shape.Shape;

//Create abstract class to get factories for Normal and Rounded Shapes
public abstract class AbstractFactory {
  public enum ShapeType {SQUARE, RECTANGLE}

  abstract Shape getShape(ShapeType shapeType);
}
