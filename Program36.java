//Java Program to Convert Octal Number to Decimal and vice-versa
package Assignment2;

public class Program36 {
	public static void main(String[] args) {
        int decimal = 89;
        int octal = conversion(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
    }

    public static int conversion(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        return octalNumber;
    }
}
