//Java Program to Convert Binary Number to Decimal and vice-versa
package Assignment2;

public class Program35 {
	static void conversion() {
		  
		    long num = 1101101111;

		    int decimal = convertBinaryToDecimal(num);

		    System.out.println(num + " in binary = " + decimal + " in decimal");
		   
		  }

		  public static int convertBinaryToDecimal(long num) {
		    int decimalNumber = 0, i = 0;
		    long remainder;
		    
		    while (num != 0) {
		      remainder = num % 10;
		      num /= 10;
		      decimalNumber += remainder * Math.pow(2, i);
		      ++i;
		    }		    
		    return decimalNumber;
		  }
public static void main(String[] args) {
	conversion();
}
}
