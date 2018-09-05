/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String reverse = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println( reverse);
	}
}
