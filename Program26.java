//Java Program to Display Factors of a Number
package Assignment2;

public class Program26 {
	static void method() {
	    int number = 85;

	    System.out.print("Factors of " + number + " are: ");

	    for (int i = 1; i <= number; ++i) {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	public static void main(String[] args) {
		method();
	}
}
