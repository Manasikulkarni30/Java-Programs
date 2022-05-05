//Java program to Calculate Factorial of a Number Using Recursion
package Assignment2;

public class Program33 {
	public static void main(String[] args) {
        int num = 5;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}
