package com.vanessavps.patterns.creational.prototype.shape;

public class Square extends Shape {

  public Square() {
    type = ShapeType.SQUARE;
  }

  @Override
  public String draw() {
    return "Drawing a square";
  }
}
