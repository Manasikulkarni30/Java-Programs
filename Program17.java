//Java Program to Calculate Power of a Number
package Assignment2;

public class Program17 {
	static void mymethod() {
		int base = 3, exponent = 4;

	    long result = 1;

	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }

	    System.out.println("Power of a given number is: " + result);
	  }
	public static void main(String[] args) {
		mymethod();
	}
}
