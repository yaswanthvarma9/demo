package com.Listeners;

import org.testng.IExecutionListener;

public class ExceutionTest implements IExecutionListener {
	
	@Override
	public void onExecutionStart()
	{
		System.out.println("started");
	}
	
	public void OnExecutionFinish()
	{
		System.out.println("Finished");
	}

}
