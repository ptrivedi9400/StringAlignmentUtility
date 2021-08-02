package com.publiccom.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class AlignFactoryTest {

  private AlignFactory alignFactoryUnderTest;

  @Before
  public void setUp() {
    alignFactoryUnderTest = new AlignFactory();
  }

  @Test
  public void testGetAlignment() {

    // Run the test
    final StringTextAlign resultLeft = alignFactoryUnderTest.getAlignment(0, Alignment.LEFT);

    // Verify the results
    Assert.assertNotNull(resultLeft);
    assertThat(resultLeft, instanceOf(LeftStringTextAlign.class));

    // Run the test
    final StringTextAlign resultRight = alignFactoryUnderTest.getAlignment(0, Alignment.RIGHT);

    // Verify the results
    Assert.assertNotNull(resultRight);
    assertThat(resultRight, instanceOf(RightStringTextAlign.class));

    // Run the test
    final StringTextAlign resultCenter = alignFactoryUnderTest.getAlignment(0, Alignment.CENTER);

    // Verify the results
    Assert.assertNotNull(resultCenter);
    assertThat(resultCenter, instanceOf(CenterStringTextAlign.class));
  }
}
