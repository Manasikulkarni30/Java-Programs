//Java Program to Calculate Average of Numbers Using Arrays
package Assignment2;

public class Program40 {

	    public static void main(String[] args) {
	 
	        int[] array = { 1, 2, 3, 4, 5 };
	 
	        int length = array.length;
	        int sum = 0;
	
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	 
	        double average = sum / length;
	         
	        System.out.println("Average of the given array is: "+average);
	 
	    }
}
