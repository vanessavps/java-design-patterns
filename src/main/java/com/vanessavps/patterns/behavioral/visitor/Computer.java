package com.vanessavps.patterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Computer implements ComputerPart {
  List<ComputerPart> computerParts;

  public Computer() {
    computerParts = Arrays.asList(new Mouse(), new Keyboard(), new Monitor());
  }

  @Override
  public String accept(ComputerPartVisitor computerPartVisitor) {
    StringBuilder sb = new StringBuilder();

    computerParts.forEach(part -> sb.append(part.accept(computerPartVisitor)).append("\n"));
    sb.append(computerPartVisitor.visit(this));
    return sb.toString();
  }
}
