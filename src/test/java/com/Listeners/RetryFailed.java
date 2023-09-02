package com.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {

	int counter=0;
	int retryLimit=4;
	
	
	
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		
		return false;
	}
	//IRetryAnalyzer is for boolean values...

}
