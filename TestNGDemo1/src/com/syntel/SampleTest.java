package com.syntel;

import org.testng.annotations.Test;
import org.testng.Assert;

public class SampleTest {
  @Test
  public void test1() {
	  Assert.assertEquals(10.0, 9.9996,0.01);
  }
}
