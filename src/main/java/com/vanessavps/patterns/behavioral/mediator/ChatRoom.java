package com.vanessavps.patterns.behavioral.mediator;

import java.util.Date;

public class ChatRoom {
  public static String showMessage(User user, String message) {
    return "[" + user.getName() + "] : " + message;
  }
}
