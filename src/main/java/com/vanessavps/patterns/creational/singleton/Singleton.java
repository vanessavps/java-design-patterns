package com.vanessavps.patterns.creational.singleton;

public class Singleton {
  //The unique Singleton instance
  private static Singleton instance = null;
  private String message;

  //Constructor restricted to this class itself
  private Singleton() {
    this.message = "Hi! I'm the Singleton class message";
  }

  //Create or get the existent instance
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
