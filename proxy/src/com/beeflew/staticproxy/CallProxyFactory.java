package com.beeflew.staticproxy;

public class CallProxyFactory {
	
	private static Call call = new CallProxyImpl(CallImpl.getInstance());

	private CallProxyFactory(){}
	
	public static Call getCallProxy(){
		return call; 
	}
}
