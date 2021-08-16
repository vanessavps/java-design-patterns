package com.vanessavps.patterns.creational.factory.shape;

//Create class implementing Shape interface
public class Square implements Shape {

  @Override
  public String draw() {
    return "Drawing a square";
  }
}