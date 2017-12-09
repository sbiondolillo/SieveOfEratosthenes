/*
 * SieveOfEratosthenes Class
 * Samuel Biondolillo
 * CIS210M:ZZ Data Structures and Elementary Algorithms
 * Goal: To generate a stack of prime numbers using the Sieve of Eratosthenes algorithm
 * Version  0.0.1  10/17/17
 */

package main;

import programs.PrimeNumberGenerator;

public class SieveOfEratosthenes {
	
	private static Stack theStack = new Stack();
	
	/*
	 * Create a boolean[1001]
	 * Run it through the Sieve Of Eratosthenes to identify primes
	 * push() the primes onto theStack
	 */
	private static void buildTheStack() {
		
		boolean[] primes = PrimeNumberGenerator.buildArray(1001);
		PrimeNumberGenerator.identifyComposites(primes);
		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				theStack.push(i);
		}
		
	}
	
	/*
	 * Print theStack top-down by calling pop() until theStack is empty
	 */
	private static void printTheStack() {
		
		while (!theStack.isEmpty()) {
			System.out.println(theStack.pop());
			try        
			{
			    Thread.sleep(100);
			} 
			catch(InterruptedException ex) 
			{
			    Thread.currentThread().interrupt();
			}
		}
		
	}

	/*
	 * Main
	 * Create a Stack() of the prime numbers 2 to 1000
	 * Display the stack to the console
	 */
	public static void main(String[] args) {
		
		System.out.println("Here is a stack of every prime integer from 2 to 1000 printed from top to bottom:");
		System.out.println();
		buildTheStack();
		printTheStack();
		
	}

}
