package com.testng;

import org.testng.annotations.Test;

public class ThreadPoolTest {
  
  @Test(priority=-1,invocationCount=4,threadPoolSize=8)
  public void log() {
	  System.out.println("log method");
	  System.out.println("thread id:" +Thread.currentThread().getId());
  }
  @Test(priority=0)
  public void search() {
	  System.out.println("search method");
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

