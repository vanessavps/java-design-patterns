package com.vanessavps.patterns.behavioral.iterator;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameRepositoryTest {

  @Test
  public void testNext() {
    NameRepository nameRepository = new NameRepository();

    Iterator iterator =  nameRepository.getIterator();
    assertTrue(iterator.hasNext());
    assertEquals("Robert", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("John", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("Julie", iterator.next());
    assertTrue(iterator.hasNext());
    assertEquals("Lora", iterator.next());
    assertFalse(iterator.hasNext());
    assertNull(iterator.next());
  }
}
