//Java Program to Find Quotient and Remainder
package Assignment2;

public class Program2{
	public static void main(String[] args) {
		int dividend = 121, divisor = 11;
		
		int quotient = dividend /divisor;
		System.out.println("Quotient is : " +quotient);
		
		int remainder = dividend % divisor;
		System.out.println("Remainder is : " +remainder);
		
	}
}