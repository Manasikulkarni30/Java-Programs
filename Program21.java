//Java Program to Check Whether a Number is Palindrome or Not
package Assignment2;

public class Program21 {
	public static void main(String args[]){  
		  int n=454,r,sum=0,temp;    		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("This is the palindrome number.");    
		  else    
		   System.out.println("This is not the palindrome number ");    
		}    
}
