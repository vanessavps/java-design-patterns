package com.vanessavps.patterns.behavioral.iterator;

public class NameRepository implements Container {
  public final String[] names = {"Robert", "John", "Julie", "Lora"};

  @Override
  public Iterator getIterator() {
    return new NameIterator();
  }

  private class NameIterator implements Iterator {
    private int index;

    @Override
    public boolean hasNext() {
      return index < names.length;
    }

    @Override
    public Object next() {
      if (this.hasNext()) {
        String name = names[index];
        index++;
        return name;
      }
      return null;
    }
  }
}
