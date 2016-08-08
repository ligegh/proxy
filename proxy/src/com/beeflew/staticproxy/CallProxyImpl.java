package com.beeflew.staticproxy;

public class CallProxyImpl implements Call {

	private Call delegate;
	
	public CallProxyImpl (Call delegate){
		this.delegate = delegate;
	}
	
	/**
	 * ί�д�������ɹ���.
	 */
	@Override
	public void callUp(String name) {
		long start = System.currentTimeMillis()/1000;
		delegate.callUp(name);
		long end = System.currentTimeMillis()/1000;
		System.out.println("��������˵绰,��ʱ:"+(start-end)+"��.");
	}

}
