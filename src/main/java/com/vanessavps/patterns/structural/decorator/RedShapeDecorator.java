package com.vanessavps.patterns.structural.decorator;

import com.vanessavps.patterns.structural.decorator.shape.Shape;

public class RedShapeDecorator extends ShapeDecorator {
  public static final String RED_BORDER_MESSAGE = " - It has red border";

  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  //The usual draw method doing something more
  @Override
  public String draw() {
    return decoratedShape.draw().concat(RED_BORDER_MESSAGE);
  }
}
