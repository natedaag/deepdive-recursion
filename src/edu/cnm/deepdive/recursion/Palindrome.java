package edu.cnm.deepdive.recursion;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String rawString = args[0].toLowerCase();
String scrubString = rawString.replaceAll("[^a-z0-9]", "");
System.out.println(isPalindrome(scrubString));

	} // end main method
	
	public static boolean isPalindrome(String input) {
		if (input.length() <= 1) {
			return true;
		} 
		if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}
		return isPalindrome(input.substring(1, input.length() - 1));
	} // end isPalidrome

} // end main class
