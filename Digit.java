import java.util.*;
import java.lang.*;
import java.io.*;
class Digit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,n=456;
		while(n!=0)
		{
			n=n/10;
			++count;
		}
		System.out.println("Number of digits:" +count);
	}
}
