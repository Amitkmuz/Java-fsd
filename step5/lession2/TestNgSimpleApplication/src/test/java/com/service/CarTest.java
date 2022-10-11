package com.service;

import org.testng.annotations.Test;

public class CarTest {
  @Test(groups = {"speed"})
  public void speed() {
	  System.out.println("Car speed Test");
  }
  @Test(groups = {"milege","speed"})
  public void milege() {
	  System.out.println("Car Milege Test");
  }
  @Test
  public void color() {
	  System.out.println("Car Color Test");
  }
}
