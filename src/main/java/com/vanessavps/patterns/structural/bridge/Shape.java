package com.vanessavps.patterns.structural.bridge;

/**
 * Shape has a reference (bridge) to the Color object
 */
public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  abstract public String draw();
}
