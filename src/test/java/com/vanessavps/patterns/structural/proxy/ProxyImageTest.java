package com.vanessavps.patterns.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProxyImageTest {

  @Test
  public void proxyImageDisplayTest() {
    String fileName = "test_10mb.jpg";
    Image image = new ProxyImage(fileName);

    assertEquals("Preparing image. Displaying " + fileName, image.display());
  }
}
