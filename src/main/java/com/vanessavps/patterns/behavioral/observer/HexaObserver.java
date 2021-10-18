package com.vanessavps.patterns.behavioral.observer;

public class HexaObserver extends Observer {
  public HexaObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public String update() {
    return "Hex set to " + Integer.toHexString(subject.getState()).toUpperCase();
  }
}
