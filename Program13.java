//Java Program to Display Fibonacci Series
package Assignment2;

public class Program13 {
	static void myMethod() {
	int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " +n+ " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }
  }
	public static void main(String[] args) {
	    myMethod();
	}
}


