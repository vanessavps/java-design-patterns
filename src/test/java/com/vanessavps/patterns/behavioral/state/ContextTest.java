package com.vanessavps.patterns.behavioral.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest {
  @Test
  public void testState() {
    Context context = new Context();

    StartState startState = new StartState();
    assertEquals("Player is in start state", startState.doAction(context));
    assertEquals("Start State", context.getState().toString());

    StopState stopState = new StopState();
    assertEquals("Player is in stop state", stopState.doAction(context));
    assertEquals("Stop State", context.getState().toString());
  }
}
