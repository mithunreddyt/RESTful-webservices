package com.mithun.restService;

public class Greeting {
	
	private final long id; //private is a access modifier and can be used only within this class
							//final can only be assigned once, once assigned, cannot be changed ever
	private final String content;

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	

}
