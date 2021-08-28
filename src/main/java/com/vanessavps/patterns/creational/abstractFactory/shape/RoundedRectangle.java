package com.vanessavps.patterns.creational.abstractFactory.shape;

//Create class implementing Shape interface
public class RoundedRectangle implements Shape {

  @Override
  public String draw() {
    return "Drawing a rounded rectangle";
  }
}
