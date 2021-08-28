package com.vanessavps.patterns.creational.prototype.shape;

public class Rectangle extends Shape {

  public Rectangle() {
    type = ShapeType.RECTANGLE;
  }

  @Override
  public String draw() {
    return "Drawing a rectangle";
  }
}
