package com.vanessavps.patterns.behavioral.chainOfResponsibility;

public class LoggerChain {
  public static Logger getChainOfLoggers(){
    Logger errorLogger = new ErrorLogger(Logger.ERROR);
    Logger fileLogger = new FileLogger(Logger.DEBUG);
    Logger consoleLogger = new ConsoleLogger(Logger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }
}
