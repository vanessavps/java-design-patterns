package com.vanessavps.patterns.creational.prototype;

import com.vanessavps.patterns.creational.prototype.shape.Shape;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object. This
 * pattern is used when creation of object directly is costly. For example, an object is to be created after a costly
 * database operation. We can cache the object, returns its clone on next request and update the database as and when
 * needed thus reducing database calls.
 */
public class ShapeCacheTest {
  @Test
  public void cloneShapeTest() {
    //Load existing shapes
    ShapeCache.loadCache();

    //Get two cloned squares
    Shape clonedSquare1 = ShapeCache.getShape("1");
    Shape clonedSquare2 = ShapeCache.getShape("1");
    assertEquals(Shape.ShapeType.SQUARE, clonedSquare1.getType());
    assertEquals(Shape.ShapeType.SQUARE, clonedSquare2.getType());

    //Get two cloned rectangles
    Shape clonedRectangle1 = ShapeCache.getShape("2");
    Shape clonedRectangle2 = ShapeCache.getShape("2");
    assertEquals(Shape.ShapeType.RECTANGLE, clonedRectangle1.getType());
    assertEquals(Shape.ShapeType.RECTANGLE, clonedRectangle2.getType());

    //Check if object hash codes are different
    assertNotEquals(clonedSquare1.hashCode(), clonedSquare2.hashCode());
    assertNotEquals(clonedRectangle1.hashCode(), clonedRectangle2.hashCode());
  }
}
