package com.vanessavps.patterns.behavioral.visitor;

public interface ComputerPart {
  String accept(ComputerPartVisitor computerPartVisitor);
}