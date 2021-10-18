package com.vanessavps.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject is an object having methods to attach and detach observers to a client object
 */
public class Subject {
  private final List<Observer> observers = new ArrayList<>();
  private int state;

  public int getState() {
    return state;
  }

  public String setState(int state) {
    this.state = state;
    return notifyAllObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public String notifyAllObservers() {
    StringBuilder sb = new StringBuilder();
    observers.forEach(observer -> sb.append(observer.update()).append("\n"));
    return sb.toString();
  }
}
