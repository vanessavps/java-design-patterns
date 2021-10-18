package com.vanessavps.patterns.behavioral.observer;

public class BinaryObserver extends Observer {
  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public String update() {
    return "Binary set to " + Integer.toBinaryString(subject.getState());
  }
}
