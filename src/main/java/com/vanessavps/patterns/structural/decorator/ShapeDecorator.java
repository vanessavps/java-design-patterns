package com.vanessavps.patterns.structural.decorator;

import com.vanessavps.patterns.structural.decorator.shape.Shape;

//Abstract decorator class implementing Shape interface
public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public String draw() {
    return decoratedShape.draw();
  }
}
