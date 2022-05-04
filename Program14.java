//Java Program to Find GCD
package Assignment2;

public class Program14 {
	static void mymethod() {
		int num1 = 64, num2 = 164;
	    int gcd = 1;
	    for (int i = 1; i <= num1 && i <= num2; ++i) {
	      if (num1 % i == 0 && num2 % i == 0)
	        gcd = i;
	    }
	    System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);
	  }
	
public static void main(String[] args) {
	mymethod();
}

}
