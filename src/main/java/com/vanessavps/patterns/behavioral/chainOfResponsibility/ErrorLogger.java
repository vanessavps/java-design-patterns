package com.vanessavps.patterns.behavioral.chainOfResponsibility;

public class ErrorLogger extends Logger {

  public ErrorLogger(int level) {
    this.level = level;
  }

  @Override
  protected String display(String message) {
    return "Error Console::Logger: " + message;
  }
}