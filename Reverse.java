/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, reverse = 0;
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 while(n != 0)
		 {
		 	reverse = reverse * 10;
		 	reverse = reverse + n%10;
		 	n = n/10;
		 }
		 System.out.println(reverse);
	}
}
