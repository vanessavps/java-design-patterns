package com.vanessavps.patterns.behavioral.command;

public class BuyStock implements Order {
  private final Stock stock;

  public BuyStock(Stock stock) {
    this.stock = stock;
  }

  public String execute() {
    return stock.buy();
  }
}
