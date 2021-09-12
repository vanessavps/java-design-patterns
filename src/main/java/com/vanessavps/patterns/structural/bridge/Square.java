package com.vanessavps.patterns.structural.bridge;

public class Square extends Shape {
  /**
   * Construct Square with chosen color
   * @param color to be set for this object
   */
  public Square(Color color) {
    super(color);
  }

  @Override
  public String draw() {
    return "Square drawn. " + color.fill();
  }
}
