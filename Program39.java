//Java Program to Calculate Power Using Recursion
package Assignment2;

public class Program39 {
	public static void main(String[] args) {
	      
	    int base = 2, powerRaised = 8;
	    int result = power(base, powerRaised);
	    System.out.println("The power of the given number is : ");
	    System.out.println(base + "^" + powerRaised + "=" + result);
	  }

	  public static int power(int base, int powerRaised) {
	    if (powerRaised != 0) {

	      return (base * power(base, powerRaised - 1));
	    }
	    else {
	      return 1;
	    }
	  }

}
