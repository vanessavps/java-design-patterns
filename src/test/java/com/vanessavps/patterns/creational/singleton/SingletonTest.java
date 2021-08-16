package com.vanessavps.patterns.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

  @Test
  public void testSingletonClass() {
    Singleton firstClass = Singleton.getInstance();
    Singleton secondClass = Singleton.getInstance();
    Singleton thirdClass = Singleton.getInstance();

    String message = "Hi! I'm the Singleton class message";
    assertEquals(message, firstClass.getMessage());
    assertEquals(message, secondClass.getMessage());
    assertEquals(message, thirdClass.getMessage());

    //Set upper case message to firstClass
    firstClass.setMessage(firstClass.getMessage().toUpperCase());
    String messageUppercase = message.toUpperCase();

    //It should affect all the variables
    assertEquals(messageUppercase, firstClass.getMessage());
    assertEquals(messageUppercase, secondClass.getMessage());
    assertEquals(messageUppercase, thirdClass.getMessage());

  }
}
