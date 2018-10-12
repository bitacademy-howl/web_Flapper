package com.flapper.test.BeanClassInterface;


public class Mybean implements MyBeanInterface{
	private String message;
	
	public Mybean() {
		message = "(no message)";
	}
	
	public Mybean(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "메시지 from bean" + this.message +"]";
	}
}
