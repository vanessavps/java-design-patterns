package com.vanessavps.patterns.structural.facade;

import com.vanessavps.patterns.structural.facade.shape.Circle;
import com.vanessavps.patterns.structural.facade.shape.Rectangle;
import com.vanessavps.patterns.structural.facade.shape.Shape;
import com.vanessavps.patterns.structural.facade.shape.Square;

/**
 * This is the facade class
 * It creates a facade to all shapes, so the client side does not need to know how to implement them
 */
public class ShapeMaker {
  private final Shape circle;
  private final Shape rectangle;
  private final Shape square;

  public ShapeMaker() {
    this.circle = new Circle();
    this.rectangle = new Rectangle();
    this.square = new Square();
  }

  public String drawCircle() {
    return circle.draw();
  }

  public String drawRectangle() {
    return rectangle.draw();
  }

  public String drawSquare() {
    return square.draw();
  }
}
