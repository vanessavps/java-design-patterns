package com.vanessavps.patterns.behavioral.chainOfResponsibility;

public class FileLogger extends Logger {

  public FileLogger(int level) {
    this.level = level;
  }

  @Override
  protected String display(String message) {
    return "File::Logger: " + message;
  }
}