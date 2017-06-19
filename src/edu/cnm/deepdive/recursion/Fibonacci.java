package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  //  end main method

	public static BigInteger fibonacci(int n) {
		if (n <= 0) {
			return BigInteger.ZERO;
		}
	if (n == 1) {
		return BigInteger.ONE;
	}
	return fibonacci(n - 1).add(fibonacci(n - 2));
}
} // end Fibonacci
