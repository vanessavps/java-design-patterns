package com.vanessavps.patterns.behavioral.observer;

public abstract class Observer {
  protected Subject subject;

  public abstract String update();
}
