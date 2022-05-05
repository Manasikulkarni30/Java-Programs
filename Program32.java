//Java program to Find Sum of Natural Numbers using Recursion
package Assignment2;

public class Program32 {
	public static void main(String[] args) {
        int number = 50;
        int sum = add(number);
        System.out.println("Sum of natural numbers are : " + sum);
    }

    public static int add(int num) {
        if (num != 0)
            return num + add(num - 1);
        else
            return num;
    }
}
