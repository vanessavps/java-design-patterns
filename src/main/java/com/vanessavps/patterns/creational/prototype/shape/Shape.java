package com.vanessavps.patterns.creational.prototype.shape;

public abstract class Shape implements Cloneable {
  public enum ShapeType {SQUARE, RECTANGLE}

  private String id;
  protected ShapeType type;

  abstract String draw();

  public ShapeType getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Object clone() {
    Object clone = null;

    try {
      clone = super.clone();

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }
}
