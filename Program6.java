//Java Program to Check Whether a character is Vowel or Consonant.
package Assignment2;

public class Program6 {
	    public static void main(String[] args) {

	        char ch = 'M';

	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' &&ch <= 'Z'))
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");

	    }
	}