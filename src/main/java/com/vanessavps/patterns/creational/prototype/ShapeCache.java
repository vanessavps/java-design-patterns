package com.vanessavps.patterns.creational.prototype;

import com.vanessavps.patterns.creational.prototype.shape.Rectangle;
import com.vanessavps.patterns.creational.prototype.shape.Shape;
import com.vanessavps.patterns.creational.prototype.shape.Square;

import java.util.Hashtable;

//Create a class to get concrete classes and store them in a Hashtable
public class ShapeCache {
  private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

  public static Shape getShape(String shapeId) {
    Shape cachedShape = shapeMap.get(shapeId);
    return (Shape) cachedShape.clone();
  }

  public static void loadCache() {
    Square square = new Square();
    square.setId("1");
    System.out.println("Loading square. Hashcode: " + square.hashCode());
    shapeMap.put(square.getId(), square);

    Rectangle rectangle = new Rectangle();
    rectangle.setId("2");
    System.out.println("Loading rectangle. Hashcode: " + rectangle.hashCode());
    shapeMap.put(rectangle.getId(), rectangle);
  }
}
