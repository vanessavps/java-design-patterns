package com.vanessavps.patterns.behavioral.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest {
  private final int NUM1 = 10;
  private final int NUM2 = 5;

  @Test
  public void testOperationAdd() {
    Context context = new Context(new OperationAdd());
    assertEquals(15, context.executeStrategy(NUM1, NUM2));
  }

  @Test
  public void testOperationMultiply() {
    Context context = new Context(new OperationMultiply());
    assertEquals(50, context.executeStrategy(NUM1, NUM2));
  }

  @Test
  public void testOperationSubtraction() {
    Context context = new Context(new OperationSubtract());
    assertEquals(5, context.executeStrategy(NUM1, NUM2));
  }
}
