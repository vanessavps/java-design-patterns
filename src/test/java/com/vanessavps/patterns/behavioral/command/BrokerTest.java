package com.vanessavps.patterns.behavioral.command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrokerTest {

  @Test
  public void testTakeOrder() {
    Stock stock = new Stock();

    BuyStock buyStockOrder = new BuyStock(stock);
    SellStock sellStockOrder = new SellStock(stock);

    Broker broker = new Broker();
    broker.takeOrder(buyStockOrder);
    broker.takeOrder(sellStockOrder);

    String expected = "Stock [ Name: ABC, Quantity:10 ] bought\n" +
                      "Stock [ Name: ABC, Quantity:10 ] sold\n";
    assertEquals(expected, broker.placeOrders());
  }
}
