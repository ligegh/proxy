package com.beeflew.staticproxy;

public class CallImpl implements Call {
	
	private static CallImpl callImpl = new CallImpl();
	
	private CallImpl(){}
	
	public static CallImpl getInstance(){
		return callImpl;
	}

	@Override
	public void callUp(String name) {
		System.out.println(callImpl.hashCode()+":我给"+name+"打了电话!");
	}

}
