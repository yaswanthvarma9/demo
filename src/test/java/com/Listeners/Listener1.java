package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case started");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case started");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case started");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case successful");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println("test case failed");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String testname=context.getName();
		System.out.println("On start");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String testname=context.getName();
		System.out.println("On finish");
	}
	
	
	
    
	
	
}
