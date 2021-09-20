package com.vanessavps.patterns.structural.facade.shape;

//Create class implementing Shape interface
public class Rectangle implements Shape {

  @Override
  public String draw() {
    return "Drawing a rectangle";
  }
}
