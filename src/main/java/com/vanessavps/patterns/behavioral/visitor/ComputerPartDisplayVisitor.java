package com.vanessavps.patterns.behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
  @Override
  public String visit(ComputerPart computerPart) {
    return "Displaying " + computerPart.getClass().getSimpleName();
  }
}
