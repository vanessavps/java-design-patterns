package com.vanessavps.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class that holds a collection of Department components It adds and removes the departments. The
 * implementation of interface methods are implemented by iterating over the list of leaf elements
 */
public class CompoundDepartment implements Department {
  private Integer id;

  private List<Department> childDepartments;

  public CompoundDepartment(Integer id) {
    this.id = id;
    this.childDepartments = new ArrayList<>();
  }

  public String getDepartmentName() {
    String departmentNames = "";
    for (Department department : childDepartments) {
      departmentNames = departmentNames.concat(department.getDepartmentName() + "\n");
    }
    return departmentNames;
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }
}
