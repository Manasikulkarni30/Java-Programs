//Java Programs To Create Pyramid and Pattern
package Assignment2;

public class Program27 {
	static void method() {
	
	    int rows = 10;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}
public static void main(String[] args) {
	method();
}
}