package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Loginsample {
  @Test(priority=-1,retryAnalyzer=com.Listeners.RetryFailed.class)
  public void log() {
	  System.out.println("log method");
	  Assert.assertEquals(false,true);
  }
  @Test(priority=0)
  public void search() {
	  System.out.println("search method");
	  Assert.assertEquals(false,true);
  }
  @Test(priority=1)
  public void addtocart() {
	  System.out.println("add to cart method");
  }
  @Test(priority=2)
  public void checkout() {
	  System.out.println("checkout method ");
  }
  
}
