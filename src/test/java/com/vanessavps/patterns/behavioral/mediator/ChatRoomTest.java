package com.vanessavps.patterns.behavioral.mediator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChatRoomTest {
  @Test
  public void sendMessageTest() {
    String userName1 = "Robert";
    User user1 = new User(userName1);

    String userName2 = "John";
    User user2 = new User(userName2);

    String userMessage1 = "Hi, " + userName2;
    String userMessage2 = "Hello, " + userName1;


    String messageSent = user1.sendMessage(userMessage1);
    assertEquals("[" + userName1 + "] : " + userMessage1, messageSent);

    messageSent = user2.sendMessage(userMessage2);
    assertEquals("[" + userName2 + "] : " + userMessage2, messageSent);
  }
}
