package com.vanessavps.patterns.structural.flyweight.shape;

import com.vanessavps.patterns.structural.flyweight.Color;

public class Circle implements Shape {
  private Color color;
  private int x;
  private int y;
  private int radius;

  public Circle(Color color){
    this.color = color;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public String draw() {
    return "Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius;
  }
}
