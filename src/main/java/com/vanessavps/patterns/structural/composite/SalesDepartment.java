package com.vanessavps.patterns.structural.composite;

/**
 * Leaf class that implements the base component behavior
 */
public class SalesDepartment implements Department {
  private Integer id;

  public SalesDepartment(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String getDepartmentName() {
    return "Sales department";
  }
}
