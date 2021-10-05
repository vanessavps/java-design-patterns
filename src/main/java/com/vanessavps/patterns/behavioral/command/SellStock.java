package com.vanessavps.patterns.behavioral.command;

public class SellStock implements Order {
  private final Stock stock;

  public SellStock(Stock stock) {
    this.stock = stock;
  }

  public String execute() {
    return stock.sell();
  }
}
