package com.vanessavps.patterns.behavioral.observer;

public class OctalObserver extends Observer {
  public OctalObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public String update() {
    return "Octal set to " + Integer.toOctalString(subject.getState());
  }
}
