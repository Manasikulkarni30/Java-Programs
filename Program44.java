//Java Program to Multiply Two Matrix Using Multi-dimensional Arrays
package Assignment2;

public class Program44 {
	public static void main(String args[]){  
		 
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    		   
		int c[][]=new int[3][3];  
		System.out.println("The multiplication of given two matrices is : ");     
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		} 
		
		System.out.print(c[i][j]+" ");  
		} 
		System.out.println();    
		}    
	}
}
