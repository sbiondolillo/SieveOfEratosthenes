/*
 * Stack Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To implement a stack data structure using ArrayLists
 * Version  0.0.1  10/17/17
 */

package main;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList<Integer> elements = new ArrayList<Integer>();
	
	public void push(int value) {
		
		elements.add(value);
	
	}
	
	public int pop() {
		
		int topValue = elements.get(elements.size());
		elements.remove(topValue);
		return topValue;
		
	}
	
	public int peek() {
		
		return elements.get(elements.size());
		
	}
	
	public boolean isEmpty() {
		
		return elements.size() == 0;
		
	}
	
	@Override
	public String toString() {
		
		String output = "[ ";
		for (Integer i: elements) {
			output += i + " ";
		}
		output += "]";
		return output;
		
	}

}
