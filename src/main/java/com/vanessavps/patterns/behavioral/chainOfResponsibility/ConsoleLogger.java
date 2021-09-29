package com.vanessavps.patterns.behavioral.chainOfResponsibility;

public class ConsoleLogger extends Logger {
  public ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  protected String display(String message) {
    return "Standard Console::Logger: " + message;
  }
}
