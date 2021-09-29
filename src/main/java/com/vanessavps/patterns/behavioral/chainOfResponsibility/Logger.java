package com.vanessavps.patterns.behavioral.chainOfResponsibility;

public abstract class Logger {
  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;

  protected int level;

  //next element in chain of responsibility
  protected Logger nextLogger;

  public void setNextLogger(Logger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public String logMessage(int level, String message) {
    if (this.level <= level) {
      return display(message);
    }
    if (nextLogger != null) {
      return nextLogger.logMessage(level, message);
    }

    return "There's no logger to display the error message";
  }

  abstract protected String display(String message);

}
