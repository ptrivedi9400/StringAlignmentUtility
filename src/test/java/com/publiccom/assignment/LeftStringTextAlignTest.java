package com.publiccom.assignment;

import java.text.FieldPosition;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LeftStringTextAlignTest {

  private LeftStringTextAlign leftStringTextAlignUnderTest;

  @Before
  public void setUp() {
    leftStringTextAlignUnderTest = new LeftStringTextAlign(20);
  }

  @Test public void testFormat() {
    // Setup
    final StringBuffer where = new StringBuffer();

    // Run the test
    final StringBuffer result = leftStringTextAlignUnderTest.format("This text should be left aligned", where, null);

    // Verify the results
    assertThat(result.toString(), is("This text should be \n"
      + "left aligned        \n"));
  }
}
