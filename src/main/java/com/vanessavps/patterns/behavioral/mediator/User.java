package com.vanessavps.patterns.behavioral.mediator;

public class User {
  private String name;

  public String getName() {
    return name;
  }

  public User(String name) {
    this.name = name;
  }

  public String sendMessage(String message) {
    return ChatRoom.showMessage(this, message);
  }
}
