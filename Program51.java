//Java Program to Remove all Characters in a String Except Alphabets.
package Assignment2;

public class Program51 {
	static void removeSpecialCharacter(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
                    s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
    public static void main(String[] args)
    {
    	System.out.println("All Characters in a String Except Alphabets are : ");
        String s = "J@v@ i$ *a popular progr@mm!ng l@nguage!!!";
        removeSpecialCharacter(s);
    }
}