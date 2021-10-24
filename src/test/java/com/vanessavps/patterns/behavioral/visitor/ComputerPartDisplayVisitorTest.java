package com.vanessavps.patterns.behavioral.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerPartDisplayVisitorTest {
  @Test
  public void testAccept() {
    ComputerPart computer = new Computer();
    ComputerPartVisitor computerPartVisitor = new ComputerPartDisplayVisitor();
    assertEquals("Displaying Mouse\n" +
                 "Displaying Keyboard\n" +
                 "Displaying Monitor\n" +
                 "Displaying Computer",
                 computer.accept(computerPartVisitor));
  }
}
