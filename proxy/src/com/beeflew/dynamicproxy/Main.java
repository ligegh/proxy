package com.beeflew.dynamicproxy;

public class Main {
	
	public static void main(String[] args) {
		CallProxyImpl proxy = new CallProxyImpl();
		Call call = (Call) proxy.bind(CallImpl.getInstance());
		call.callUp("lili");
		call.callUp("hanmeimei");
		call.callUp("scott");
	}

}
