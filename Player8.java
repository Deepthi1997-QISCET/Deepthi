/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = "";
		char firstChar = s.charAt(0);
		result = result + Character.toUpperCase(firstChar);
		for (int i = 1; i < s.length(); i++)
		{
			char currentChar = s.charAt(i);
			char previousChar = s.charAt(i - 1);
			if (previousChar == ' ') 
			{
				result = result + Character.toUpperCase(currentChar);
				
			} 
			else 
			{
				result = result + currentChar;
			}
		}
		System.out.println(result);
	}
}
