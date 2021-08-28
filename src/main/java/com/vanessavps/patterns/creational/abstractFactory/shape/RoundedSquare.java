package com.vanessavps.patterns.creational.abstractFactory.shape;

//Create class implementing Shape interface
public class RoundedSquare implements Shape {

  @Override
  public String draw() {
    return "Drawing a rounded square";
  }
}