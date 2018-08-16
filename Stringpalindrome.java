import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in);
      s= in.nextLine();
 
      int length = s.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + s.charAt(i);
 
      if (s.equals(reverse))
      {
         System.out.println("yes");
      }
      else
      {
         System.out.println("no");
      }
	}
}
