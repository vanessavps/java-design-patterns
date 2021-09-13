package com.vanessavps.patterns.structural.composite;

/**
 * Leaf class that implements the base component behavior
 */
public class FinancialDepartment implements Department {
  private Integer id;

  public FinancialDepartment(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  @Override
  public String getDepartmentName() {
    return "Financial department";
  }
}
