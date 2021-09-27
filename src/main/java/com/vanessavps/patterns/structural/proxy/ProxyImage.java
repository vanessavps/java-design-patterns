package com.vanessavps.patterns.structural.proxy;

/**
 * Proxy class
 */
public class ProxyImage implements Image {
  private RealImage realImage;
  private final String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  /**
   * It does something before display the real image
   * @return modified display
   */
  @Override
  public String display() {
    String preText = doSomethingBefore();
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    return preText + " " + realImage.display();
  }

  private String doSomethingBefore() {
    return "Preparing image.";
  }
}
