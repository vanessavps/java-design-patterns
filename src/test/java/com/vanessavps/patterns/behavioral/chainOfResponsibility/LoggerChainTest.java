package com.vanessavps.patterns.behavioral.chainOfResponsibility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerChainTest {

  @Test
  public void testLoggerChain() {
    Logger loggerChain = LoggerChain.getChainOfLoggers();
    String infoMessage = "This is an information.";
    String debugMessage = "This is a debug level information.";
    String errorMessage = "This is an error information.";

    String infoDisplayedMessage = loggerChain.logMessage(Logger.INFO, infoMessage);
    String debugDisplayedMessage = loggerChain.logMessage(Logger.DEBUG, debugMessage);
    String errorDisplayedMessage = loggerChain.logMessage(Logger.ERROR, errorMessage);

    assertEquals("Standard Console::Logger: " + infoMessage, infoDisplayedMessage);
    assertEquals("File::Logger: " + debugMessage, debugDisplayedMessage);
    assertEquals("Error Console::Logger: " + errorMessage, errorDisplayedMessage);
  }
}
