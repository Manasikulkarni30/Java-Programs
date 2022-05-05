//Java Program to Display Prime Numbers Between Two Intervals Using Functions
package Assignment2;

public class Program29 {
	public static void main(String[] args) {

        int lowvalue = 20, highvalue = 50;
        System.out.println("Prime Numbers Between given two Intervals are : ");
        while (lowvalue < highvalue) {
            if(checkPrimeNumber(lowvalue))
                System.out.print(lowvalue + " ");

            lowvalue++;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}
