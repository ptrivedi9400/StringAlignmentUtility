package com.publiccom.assignment;

import java.text.FieldPosition;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RightStringTextAlignTest {

  private RightStringTextAlign rightStringTextAlignUnderTest;

  @Before
  public void setUp() {
    rightStringTextAlignUnderTest = new RightStringTextAlign(10);
  }

  @Test public void testFormat() {
    // Setup
    final StringBuffer where = new StringBuffer();

    // Run the test
    final StringBuffer result = rightStringTextAlignUnderTest.format("This text should be right aligned", where, null);

    // Verify the results
    assertThat(result.toString(), is("This text \n"
      + "should be \n"
      + "right alig\n"
      + "       ned\n") );
  }
}
