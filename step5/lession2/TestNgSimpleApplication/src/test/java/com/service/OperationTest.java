package com.service;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OperationTest {

  @Test
  @Ignore
  public void addTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.add(100,200);
	  assertEquals(result,300);
  }

  @Test
  public void divTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.div(1000,200);
	  assertEquals(result,5);
  }

  @Test
  public void mulTest() {
    //throw new RuntimeException("Test not implemented");
	  Operation op=new Operation();
	  int result=op.mul(1,200);
	  assertEquals(result,200);
  }

  @Test
  public void subTest() {
    //throw new RuntimeException("Test not implemented");
    Operation op=new Operation();
	  int result=op.sub(1000,200);
	  assertEquals(result,800);
  }
}
