package com.vanessavps.patterns.structural.bridge;

/**
 * Red implementation of Color
 */
public class Red implements Color {

  @Override
  public String fill() {
    return "Color is red";
  }
}
