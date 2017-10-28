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
	
	/*
	 * Add a value to the top of the stack
	 * @param value - any valid integer
	 */
	public void push(int value) {
		
		elements.add(value);
	
	}
	
	/*
	 * Remove and display the top element of the stack
	 */
	public int pop() {
		
		int topValue = -1;
		if (!elements.isEmpty()) {
			topValue = elements.get(elements.size()-1);
			elements.remove(elements.size()-1);
		}
		else {
			System.out.println("The stack is empty, unable to pop()");
		}
		return topValue;
		
	}
	
	/*
	 * Display the top element of the stack
	 */
	public int peek() {
		
		return elements.get(elements.size());
		
	}
	
	/*
	 * Identify whether the stack is empty
	 */
	public boolean isEmpty() {
		
		return elements.size() == 0;
		
	}
	
	/*
	 * Provide a readable format for printing a stack
	 * the top element is at the extreme right of the printed list
	 */
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
