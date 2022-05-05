//Java Program to Find G.C.D Using Recursion
package Assignment2;

public class Program34 {
	public static void main(String[] args) {
        int n1 = 100, n2 = 50;
        int gcd = gcd(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, gcd);
    }

    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
	

}
