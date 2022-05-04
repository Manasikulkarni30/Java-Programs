//Java Program to Find Factorial
package Assignment2;
public class Program11 {
  static void myMethod() {
	  int i , fact=1;
	  int num = 6;
	  for (i=1;i<=num;i++)
	  fact = fact * i;
	  System.out.println("Factorial of "+num+" is: "+fact);
  }
  public static void main(String[] args) {
    myMethod();
  }
}
