package com.vanessavps.patterns.behavioral.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExpressionTest {
  @Test
  public void testInterpret() {
    Expression isMale = getMaleExpression();
    Expression isMarriedWoman = getMarriedWomanExpression();

    assertTrue("John is male", isMale.interpret("John"));
    assertTrue("Julie is a married woman", isMarriedWoman.interpret("Married Julie"));
    assertFalse("Anna is not male", isMale.interpret("Anna"));
  }

  /**
   * Rule: Robert and John are male
   */
  private static Expression getMaleExpression() {
    Expression robert = new TerminalExpression("Robert");
    Expression john = new TerminalExpression("John");
    return new OrExpression(robert, john);
  }

  /**
   * Rule: Julie is a married women
   */
  private static Expression getMarriedWomanExpression() {
    Expression julie = new TerminalExpression("Julie");
    Expression married = new TerminalExpression("Married");
    return new AndExpression(julie, married);
  }
}
