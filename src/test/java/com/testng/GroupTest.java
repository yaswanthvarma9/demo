package com.testng;

import org.testng.annotations.Test;



public class GroupTest {
  @Test(groups="sanity")
  public void log() {
	  System.out.println("log method");
  }
  @Test(groups="Regression")
  public void search() {
	  System.out.println("search method");
  }
  @Test(groups= {"sanity","Regression"})
  public void addtocart() {
	  System.out.println("add to cart method");
  }
  @Test(groups ="Regression")
  public void checkout() {
	  System.out.println("checkout method ");
  }
  
}

