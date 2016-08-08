package com.beeflew.staticproxy;

public class CallProxyImpl implements Call {

	private Call delegate;
	
	public CallProxyImpl (Call delegate){
		this.delegate = delegate;
	}
	
	/**
	 * 委托代理来完成工作.
	 */
	@Override
	public void callUp(String name) {
		long start = System.currentTimeMillis()/1000;
		delegate.callUp(name);
		long end = System.currentTimeMillis()/1000;
		System.out.println("代理打完了电话,用时:"+(start-end)+"秒.");
	}

}
