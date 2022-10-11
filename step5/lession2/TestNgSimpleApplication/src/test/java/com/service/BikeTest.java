package com.service;

import org.testng.annotations.Test;

public class BikeTest {
  @Test(groups = {"speed"})
  public void speed() {
	  System.out.println("Bike Speed Test");
  }
  @Test(groups = {"milege"})
  public void milege() {
	  System.out.println("Bike milege Test");
  }
  @Test
  public void color() {
	  System.out.println("Bike color Test");
  }
}
