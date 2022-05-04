//Java Program to Display Armstrong Number Between Two Intervals
package Assignment2;

public class Program25 {
	static void method() {
	int num1 = 100, num2 = 900;
	System.out.println("Armstrong Numbers Between Two Intervals are : ");

    for(int number = num1 + 1; number < num2; number++) {
      int digits = 0;
      int result = 0;
      int originalNumber = number;

      while (originalNumber != 0) {
        originalNumber /= 10;
        ++digits;
      }

      originalNumber = number;
      while (originalNumber != 0) {
        int remainder = originalNumber % 10;
        result += Math.pow(remainder, digits);
        originalNumber /= 10;
      }

      if (result == number) {
        System.out.print(number + " ");
      }
    }
  }
public static void main(String[] args) {
	method();

}
}
