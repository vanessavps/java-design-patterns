package com.vanessavps.patterns.behavioral.observer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubjectTest {
  @Test
  public void testObserver() {
    Subject subject = new Subject();
    new HexaObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    assertEquals("Hex set to F\n" +
                 "Octal set to 17\n" +
                 "Binary set to 1111\n"
            , subject.setState(15));

    assertEquals("Hex set to A\n" +
                 "Octal set to 12\n" +
                 "Binary set to 1010\n",
                 subject.setState(10));
  }
}
