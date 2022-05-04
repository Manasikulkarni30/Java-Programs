//Java Program to Reverse a Number
package Assignment2;

public class Program16 {
	static void mymethod() {
		int num = 78965, revnum = 0;
	    System.out.println("Given number is: " + num);

	    while(num != 0) {
	      int digit = num % 10;
	      revnum = revnum * 10 + digit;
	      num = num / 10;
	    }

	    System.out.println("Reversed Number is: " + revnum);
	  }
	public static void main(String[] args) {
		mymethod();
	}
	}

