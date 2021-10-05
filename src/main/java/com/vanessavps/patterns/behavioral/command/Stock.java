package com.vanessavps.patterns.behavioral.command;

/**
 * This is the request class
 */
public class Stock {
  private final String name = "ABC";
  private final int quantity = 10;

  public String buy() {
    return "Stock [ Name: " + name + ", Quantity:" + quantity + " ] bought";
  }

  public String sell() {
    return "Stock [ Name: " + name + ", Quantity:" + quantity + " ] sold";
  }
}
