package com.publiccom.assignment;

import java.text.FieldPosition;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CenterStringTextAlignTest {

  private CenterStringTextAlign centerStringTextAlignUnderTest;

  @Before
  public void setUp() {
    centerStringTextAlignUnderTest = new CenterStringTextAlign(10);
  }

  @Test public void testFormat() {
    // Setup
    final StringBuffer where = new StringBuffer();

    // Run the test
    final StringBuffer result = centerStringTextAlignUnderTest.format("This text should be center aligned", where, null);

    // Verify the results
    assertThat(result.toString(), is("This text \n"
      + "should be \n"
      + "center ali\n"
      + "   gned   \n"));
  }
}
