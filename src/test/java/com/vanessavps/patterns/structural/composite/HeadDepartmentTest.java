package com.vanessavps.patterns.structural.composite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadDepartmentTest {

  @Test
  public void testHeadDepartment() {
    Department salesDepartment = new SalesDepartment(1);
    Department financialDepartment = new FinancialDepartment(2);

    CompoundDepartment headDepartment = new CompoundDepartment(3);

    headDepartment.addDepartment(salesDepartment);
    headDepartment.addDepartment(financialDepartment);

    assertEquals(headDepartment.getDepartmentName(), "Sales department\nFinancial department\n");
  }
}
