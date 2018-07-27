import java.util.*;
import java.lang.*;
import java.io.*;
class Leapyear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year=2008;
		if(year%4==0)
		{
			System.out.println(year+ "is a leapyear");
		}
		else
		{
			System.out.println(year+ "not a leapyear");
		}
	}
}
