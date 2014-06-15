package com.restaurant.tutos;

public class Counter {
	private String name;
	private int tally;
	
	public Counter(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void increment() {
		tally++;
	}
	
	public int tally() {
		return tally;
	}
}
