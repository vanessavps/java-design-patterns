package com.vanessavps.patterns.behavioral.visitor;

public class Monitor implements ComputerPart {

  @Override
  public String accept(ComputerPartVisitor computerPartVisitor) {
    return computerPartVisitor.visit(this);
  }
}