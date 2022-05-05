//Java Program to Find Largest Element of an Array
package Assignment2;

public class Program41 {
	public static void main(String[] args) {  
		  
        int [] arr = new int [] {17, 30, 52, 87, 56};  
        int max = arr[0];  

        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element in given array: " + max);  
    }  

}
