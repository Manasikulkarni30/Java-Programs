//Java Program to Display Prime Numbers Between Two Intervals
package Assignment2;

public class Program23 {
	public static void main(String[] args) {
		int num1 = 20, num2 = 50;
		System.out.println("Prime Numbers Between Two Intervals are : ");
		while (num1 < num2) {
		boolean flag = false;
		
		for(int i = 2; i <= num1/2;i++) {
		if(num1 % i == 0) {
		flag = true;
		break;
		}
		}
		if (!flag)	
		System.out.print(num1 + " ");
		num1++;
		}
		}
}
