package com.vanessavps.patterns.structural.flyweight;

import com.vanessavps.patterns.structural.flyweight.shape.Circle;
import com.vanessavps.patterns.structural.flyweight.shape.Shape;

import java.util.HashMap;

/**
 * Here the uniqueness we need is the color
 * So there is a map to save the different colors of Circle
 * If an existent Circle-color is found, then return the existent Circle object
 */
public class ShapeFlyweightFactory {
  private static final HashMap<Color, Circle> circleMap = new HashMap<>();

  public static Shape getCircle(Color color) {
    Circle circle = circleMap.get(color);

    if (circle == null) {
      circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("Creating circle of color: " + color);
      System.out.println("Circle Map size is: " + circleMap.size());
    }
    return circle;
  }

  public static int circleMapSize() {
    return circleMap.size();
  }
}
