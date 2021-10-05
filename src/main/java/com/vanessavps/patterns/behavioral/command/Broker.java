package com.vanessavps.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * This the invoker class
 */
public class Broker {
  private final List<Order> orderList = new ArrayList<>();

  public void takeOrder(Order order) {
    orderList.add(order);
  }

  public String placeOrders() {
    StringBuilder builder = new StringBuilder();
    for (Order order : orderList) {
      builder.append(order.execute())
              .append("\n");
    }

    orderList.clear();
    return builder.toString();
  }
}
