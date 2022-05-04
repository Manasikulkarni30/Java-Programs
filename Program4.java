//Java Program to Swap Two Numbers
package Assignment2;

public class Program4 {
	public static void main(String[] args) {

        int num1=12 , num2=65;
        System.out.println("Before swap");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        int temporary = num1;
        num1 = num2;
        num2 = temporary;

        System.out.println("________________________");
        System.out.println("\nAfter swap");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }

}
