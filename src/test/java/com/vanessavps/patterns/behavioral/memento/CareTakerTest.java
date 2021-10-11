package com.vanessavps.patterns.behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CareTakerTest {
  @Test
  public void testSaveMemento() {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #4");

    assertEquals("Should show current state", "State #4", originator.getState());
    originator.getStateFromMemento(careTaker.get(0));
    assertEquals("Should show first saved state","State #2", originator.getState());
    originator.getStateFromMemento(careTaker.get(1));
    assertEquals("Should show second saved state","State #3", originator.getState());
  }
}
