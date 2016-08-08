package com.beeflew.staticproxy;

public class Main {
	
	public static void main(String[] args) {
		Call call = CallProxyFactory.getCallProxy();
		call.callUp("hanmeimei");
		call.callUp("lilei");
		call.callUp("jhon");
		call.callUp("scott");
		call.callUp("lili");
	}

}
